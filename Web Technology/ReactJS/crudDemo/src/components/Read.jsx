import axios from 'axios';
import { useEffect, useState } from 'react';
import { Link, useParams } from 'react-router-dom';

function Read() {
  let [user, setUser] = useState([]);

  let {id} = useParams();

  useEffect(()=> {
    async function fetchData() {
      let {data} = await axios(`http://localhost:3030/users/${id}`);
      setUser(data);
    }
    fetchData();
  },[]);

  return (
    <>
      <h1>User Data</h1>
      <form>
        <label htmlFor="id">Id: </label>
        <input id='id' type="text" value={user.id} />
        <br />
        <label htmlFor="username">Username: </label>
        <input id='username' type="text" value={user.username} />
        <br />
        <label htmlFor="email">Email: </label>
        <input id='email' type="text" value={user.email} />
        <br />
        <label htmlFor="phone">Phone: </label>
        <input id='phone' type="text" value={user.phone} />
        <br />

        <button><Link to="/">Back</Link></button>
      </form>

    </>
  )
}

export default Read