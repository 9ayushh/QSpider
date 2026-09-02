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

  async function handleClick(id) {
    console.log(id);
    let res = confirm("Are you sure, you want to delete?");
    // console.log(res);
    if(res) {
      await axios.delete(`http://localhost:3030/users/${id}`);
      location.reload();
    }
  }

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
                    <button><Link to={`/read/${id}`}>Read</Link></button>
                    <button><Link to={`/update/${id}`}>Update</Link></button>
                    <button onClick={() => handleClick(id)}>Delete</button>
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