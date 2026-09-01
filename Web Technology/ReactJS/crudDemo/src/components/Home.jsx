import {useState, useEffect} from 'react'
import axios from 'axios';
import { Link } from 'react-router-dom';

function Home() {
  
  let [user, setUser] = useState([]);

  useEffect(()=> {
    async function fetchData() {
      let {data} = await axios("http://localhost:3030/users");
      setUser(data);
    }
    fetchData();
  },[]);

  return (
    <>
      <h1>User Data</h1><button><Link to="/create">Create +</Link></button>
      <br /><br />
      <table border={1}>
        <thead>
          <tr>
            <th>ID</th>
            <th>Username</th>
            <th>Phone</th>
            <th>Action</th>
          </tr>
        </thead>
        {
          user.map((val) => {
            let {id, username, phone} = val;
            return (
              <tbody key={id}>
                <tr>
                  <td>{id}</td>
                  <td>{username}</td>
                  <td>{phone}</td>
                  <td>
                    <button><Link to="/read">Read</Link></button>
                    <button><Link to="/update">Update</Link></button>
                    <button>Delete</button>
                  </td>
                </tr>
              </tbody>
            );
          })
        }
      </table>
    </>
  )
}

export default Home