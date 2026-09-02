
import axios from 'axios'
import React, { useState, useEffect } from 'react'
import { useParams, Link, useNavigate } from 'react-router-dom'

function Update() {

  let [fdata, setFdata] = useState({
      id : "",
      username : "",
      phone : ""
    });

  let {id} = useParams();
  
  useEffect(()=> {
    async function fetchData() {
      let {data} = await axios(`http://localhost:3030/users/${id}`);
      console.log(data);
      setFdata(data);
    }
    fetchData();
  },[id]);

  function handleChange(e) {
    let {name, value} = e.target;
    setFdata({...fdata, [name]:value});
  }

  let navigate = useNavigate();

  async function handleSubmit(e) {
    e.preventDefault();
    let res = await axios.put(`http://localhost:3030/users/${id}`, fdata);
    console.log(res);
    if(res) {
      navigate("/");
    }
  }
  
  return (
    <>
      <h1>User Data</h1>
        <form onSubmit={handleSubmit}>
          <input type="text" value={fdata.id} name='id' onChange={handleChange}/>
          <input type="text" value={fdata.username} name='username' onChange={handleChange}/>
          <input type="text" value={fdata.phone} name='phone' onChange={handleChange} />

          <button type='submit'>Submit</button>
          <button type='button'><Link to="/">Back</Link></button>
        </form>
    </>
    )
}

export default Update