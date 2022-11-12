import React, { useState, useEffect } from "react";
import Item from "../../../model/item";
import { RandomIntegerBetween } from "../../../services/app-utils";
import { Categories } from "../../../services/common-model-service";
import "./orderEntry.css";

export default function OrderEntry(props) {
  const [idCount, setIdCount] = useState({
    id:1
  });

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
  };

  const onChangeCategory = (e) => {
    setFormValues({
      ...formValues,
      category: e.target.value,
    });
  };

  const doSubmitNewItem = (e) => {
    let err = doValidate(formValues);

    if (Object.keys(err).length > 0) {
      return;
    }
    
    setIdCount((prev)=>{
      return {
        ...prev,
        id:prev.id+1
      }
    });

    let cost = RandomIntegerBetween(1,10)*formValues.quantity;

    let item = new Item(idCount.id, formValues.product, formValues.quantity, formValues.category,cost);
    props.onDoAddItem(item);
  };

  useEffect(() => {
    console.log(" iam here...");
    const subs = Categories()
      .fetchAll()
      .then((x) => {
        console.log("$#$#$#$#$#$#$#$#$#$#$#$#$#$$#$#$#")
        console.log(x.data.categories);
        console.log(JSON.stringify(x));

        setCtgr(x.data.categories);
      });
    return () => {
      // Clean up the subscription
      //subs.unsubscribe();
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
    //console.log(errors);
    if (Object.keys(errors).length > 0) {
      //console.log("setting the valid to false")
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
                <option key="0" value="0">Please select a Category</option>
                {ctgr.map((x, id) => {
                  return (
                    <option key={x.id} value={x.id}>{x.name}</option>
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
