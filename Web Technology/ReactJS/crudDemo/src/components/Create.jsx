import axios from 'axios'
import React, { useState } from 'react'
import { useNavigate } from 'react-router-dom'

function Create() {
  
  let [data, setData] = useState({
    username : "",
    phone : ""
  });

  let navigate = useNavigate();

  function handleChange(e) {
    let {name, value} = e.target;
    setData({...data, [name]:value});
  }

  async function handleSubmit(e) {
    e.preventDefault()
    let res = await axios.post("http://localhost:3030/users", data);
    if(res) {
      navigate("/");
    }
  }

  return (
    <>
      <h1>Add User</h1>
      <form onSubmit={handleSubmit}>
        <input type="text" placeholder='username' name='username' onChange={handleChange} />
        <br /><br />
        <input type="text" placeholder='phone' name='phone' onChange={handleChange} />
        <br /><br />
        <button>Submit</button>
      </form>
    </>
  )
}

export default Create