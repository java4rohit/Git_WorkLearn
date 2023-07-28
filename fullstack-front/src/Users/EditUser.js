import axios from "axios";
import React, { useEffect, useState } from "react";
import { Link, useNavigate, useParams } from "react-router-dom";

export default function EditUser() {
  let navigate = useNavigate();

  const { id } = useParams();

  const [user, setUser] = useState({
    name: "",
    username: "",
    email: "",
    aadhaarNumber: "",
  });

  const { name, username, email, aadhaarNumber } = user;

  const onInputChange = (e) => {
    setUser({ ...user, [e.target.name]: e.target.value });
  };

  useEffect(() => {
    loadUser();
    console.log(id);
  }, []);

  const onSubmit = async (e) => {
    console.log("update :: ");
    e.preventDefault();
    await axios.put(`http://localhost:8080/v1/updateUserById/${id}`, user);
    navigate("/");
  };

  const loadUser = async () => {
    console.log("ho ja bhai" + id);
    console.log(id);
    const result = await axios.get(
      `http://localhost:8080/v1/getUserByID/${id}`
    );
    console.log(result);
    setUser(result.data);
  };

  return (
    <div className="container">
      <div className="row">
        <div className="col-md-6 offset-md-3 border rounded p-4 mt-2 shadow">
          <h2 className="text-center m-4">Edit User</h2>

          <form onSubmit={(e) => onSubmit(e)}>
            <div className="mb-3">
              <label htmlFor="Name" className="form-lable">
                Name
              </label>
              <input
                type={"Text"}
                className="form-control"
                placeholder="Enter your name"
                name="name"
                value={name}
                onChange={(e) => onInputChange(e)}
              ></input>
            </div>
            <div className="mb-3">
              <label htmlFor="username" className="form-lable">
                Username
              </label>
              <input
                type={"Text"}
                className="form-control"
                placeholder="Enter your username"
                name="username"
                value={username}
                onChange={(e) => onInputChange(e)}
              ></input>
            </div>
            <div className="mb-3">
              <label htmlFor="aadhaarNumber" className="form-lable">
                AddhaarNumber
              </label>
              <input
                type={"Text"}
                className="form-control"
                placeholder="Enter your Addhar Card No"
                name="aadhaarNumber"
                value={aadhaarNumber}
                onChange={(e) => onInputChange(e)}
              ></input>
            </div>
            <div className="mb-3">
              <label htmlFor="email" className="form-lable">
                Email
              </label>
              <input
                type={"Text"}
                className="form-control"
                placeholder="Enter your email address"
                name="email"
                value={email}
                onChange={(e) => onInputChange(e)}
              />
            </div>
            <button type="submit" className="btn btn-outline-primary">
              Submit
            </button>
            <Link type="submit" className="btn btn-outline-danger mx-2" to="/">
              Cancel
            </Link>
          </form>
        </div>
      </div>
    </div>
  );
}
