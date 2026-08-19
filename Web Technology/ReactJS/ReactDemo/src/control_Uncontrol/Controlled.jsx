import React, { useState } from 'react'

const Controlled = () => {

    let [formData, setFormData] = useState ( {
        userName : "",
        password : "",
        email : ""
    })

    function handleSubmit(e) {
        e.preventDefault();
        console.log("form Submitted");
    }

    function handleChange(e) {
        // console.log(e)
        let {name, value} = e.target;
        setFormData({...formData, [name]:value });
        console.log(formData);
        console.log("change");
    }

    return (
        <>
            <h1>Controlled Component</h1>
            <form onSubmit={handleSubmit}>
                <input type="text" value={formData.userName} onChange={handleChange} name='userName' />
                <input type="password" value={formData.password} onChange={handleChange} name='password' />
                <input type="email" value={formData.email} onChange={handleChange} name='email'/>
                <button>Submit</button>
            </form>
        </>
    )
}

export default Controlled