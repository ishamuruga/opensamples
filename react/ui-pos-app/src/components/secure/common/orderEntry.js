import React, { useState, useEffect } from "react";
import Item from "../../../model/item";
import { Categories } from "../../../services/common-model-service";
import "./orderEntry.css";

export default function OrderEntry(props) {
  const [formValues, setFormValues] = useState({
    quantity: "",
    product: "",
    category: 0,
  });

  const [ctgr, setCtgr] = useState([]);
  const [errors, setErrors] = useState({});
  const [valid, setValid] = useState(true);

  const handleChange = (event) => {
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

  const onChangeCategory = (e) => {
    console.log(e.target.value);
    setFormValues({
      ...formValues,
      category: e.target.value,
    });
  };

  const doSubmitNewItem = (e) => {
    console.log(formValues);
    let err = doValidate(formValues);
  
    if (Object.keys(err).length > 0) {
      console.log("Error Data");
      return;
    }
    let item = new Item(0,formValues.product,formValues.quantity,formValues.category);
    props.onDoAddItem(item);
  };

  useEffect(() => {
    const subs = Categories()
      .fetchAll()
      .subscribe((x) => {
        
        console.log(x);
        //setCtgr(x);
      });
    return () => {
      // Clean up the subscription
      subs.unsubscribe();
    };
    console.log("=======================");
  }, []);

  const doValidate = (fValues) => {
    const errors = {};
    setErrors({});
    setValid(true);
    // quantity: "",
    // product: "",
    // category: "",
    if (!fValues.product) {
      errors.product = "Product Cannot be Empty";
    }

    if (!fValues.quantity) {
      errors.quantity = "Quantity Cannot be Empty";
    }

    if (fValues.quantity == 0) {
      errors.quantity = "Quantity Cannot be Zero/0";
    }

    if (isNaN(fValues.quantity)) {
      errors.quantity = "Quantity Should be a Number Value";
    }

    if (fValues.category <= 0) {
      errors.category = "Category Cannot be Zero/0";
    }
    console.log(errors);
    if (Object.keys(errors).length>0) {
      console.log("setting the valid to false")
      setValid(false);
    }
    setErrors(errors);

    return errors;
  };

  // https://mdbootstrap.com/snippets/jquery/mdbootstrap/747937#html-tab-view
  return (
    <div>
      {Object.entries(errors).map(([key, value]) => (
        <div className="smallred" key={key}>
          {value}
        </div>
      ))}
      <section className="order-form my-4 mx-4">
        <div className="container">
          <div className="row">
            <div className="col-sm">
              <input
                name="product"
                onChange={handleChange}
                value={formValues.product}
                className="order-form-input"
                placeholder="Product"
              />
            </div>
            <div className="col-sm">
              <input
                name="quantity"
                onChange={handleChange}
                value={formValues.quantity}
                className="order-form-input"
                placeholder="Quantity"
              />
            </div>
            <div className="col-sm">
            <select id="select" onChange={onChangeCategory}>
                {ctgr.map((x, id) => {
                    return (
                      <option key={x.id} value={x.id}>{x.description}</option>
                    );
                  })}
                </select>
            </div>
            <div className="col-sm">
              <button
                type="button"
                id="btnSubmit"
                className="btn btn-dark d-block mx-auto btn-submit"
                onClick={doSubmitNewItem}
              >
                Add Item
              </button>
            </div>
          </div>
        </div>
      </section>
    </div>
  );
}
