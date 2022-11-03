import React, { useState, useEffect } from "react";
import { useNavigate } from "react-router-dom";
import User from "../../model/user";
import './login.css';

import { doAuth } from "../../services/auth-service";

export default function Login() {
  // https://mdbootstrap.com/docs/standard/extended/login/

  const initialValues = {
    email: "ramarajan@gmail.com",
    password: "ramarajan",
    rflag: false,
  };

  const [formValues, setFormValues] = useState(initialValues);
  const [formErrors, setFormErrors] = useState({
    email: "",
    password: "",
  });

  const [valid, setValid] = useState(true);
  const nav = useNavigate();

  const handleOnChange = (event) => {
    const isCheckBox = event.target.value === "checkbox";
    const { name, value } = event.target;
    setFormValues((prev) => {
      return {
        ...prev,
        [name]: isCheckBox ? event.target.checked : value,
      };
    });
    console.log(formValues);
  };

  const validate = (values) => {
    const errors = {};
    const regex = /^[^\s@]+@[^\s@]+\.[^\s@]{2,}$/i;

    if (!values.email) {
      errors.email = "Cannot be blank";
    } else if (!regex.test(values.email)) {
      errors.email = "Invalid email format";
    }

    if (!values.password) {
      errors.password = "Cannot be blank";
    } else if (values.password.length < 4) {
      errors.password = "Password must be more than 4 characters";
    }

    if (Object.keys(errors).length > 0) {
      setValid(false);
      setFormErrors(errors);
      return false;
    }
    return true;
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    validate(formValues);
    console.log(valid);
    console.log(e);

    if (!validate(formValues)) {
      return;
    }
    doAuth(formValues)
      .then((x) => {

        let data = x.data;
        
        let user = new User(
          data.id,
          data.username,
          data.username,
          data.accessToken,
          data.roles
        );


        console.log(user);
        sessionStorage.setItem("auth", JSON.stringify(user));


        nav("/dashboard");
      })
      .catch((err) => {
        console.log(err);    
      })
      .finally(() => {
        console.log("================================Finally");
      });
  };

  useEffect(() => {
    console.log("==========================in Use Effect");
    sessionStorage.clear();
  },[]);

  return (
    <div>
      <section className="w-100 p-4 d-flex justify-content-center pb-4">
        <form style={{ width: "22rem" }} onSubmit={handleSubmit} noValidate>
          <div className="form-outline mb-4">
            <input
              type="email"
              id="email"
              name="email"
              value={formValues.email}
              onChange={handleOnChange}
              className="form-control"
            />
            <label className="form-label" htmlFor="form2Example1">
              Email address
            </label>
            {formErrors.email && (
              <p><span className="error">{formErrors.email}</span></p>
            )}
          </div>

          <div className="form-outline mb-4">
            <input
              type="password"
              id="password"
              name="password"
              value={formValues.password}
              onChange={handleOnChange}
              className="form-control"
            />
            <label className="form-label" htmlFor="form2Example2">
              Password
            </label>
            {formErrors.password && (
              <p><span className="error">{formErrors.password}</span></p>
            )}
          </div>

          {/* <div className="row mb-4">
            <div className="col d-flex justify-content-center">
              <div className="form-check">
                <input
                  className="form-check-input"
                  type="checkbox"
                  value=""
                  id="form2Example31"
                  checked
                />
                <label className="form-check-label" for="form2Example31">
                  {" "}
                  Remember me{" "}
                </label>
              </div>
            </div>

            <div className="col">
              <a href="#!">Forgot password?</a>
            </div>
          </div> */}

          <button type="submit" className="btn btn-primary btn-block mb-4">
            Sign in
          </button>

          {/* <div className="text-center">
            <p>
              Not a member? <a href="#!">Register</a>
            </p>
            <p>or sign up with:</p>
            <button type="button" className="btn btn-link btn-floating mx-1">
              <i className="fab fa-facebook-f"></i>
            </button>

            <button type="button" className="btn btn-link btn-floating mx-1">
              <i className="fab fa-google"></i>
            </button>

            <button type="button" className="btn btn-link btn-floating mx-1">
              <i className="fab fa-twitter"></i>
            </button>

            <button type="button" className="btn btn-link btn-floating mx-1">
              <i className="fab fa-github"></i>
            </button>
          </div> */}
        </form>
      </section>
    </div>
  );
}
