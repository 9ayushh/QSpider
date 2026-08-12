import React, { useEffect, useState } from 'react';

const ApplicationOfUseEffect = () => {

    const [res, setRes] = useState([]);
    useEffect( () => {
        (async () => {
            let res = await fetch('https://fakestoreapi.com/products');
            let data = await res.json();

            setRes(data);
        })();

    },[]);
    

    return (
        <>
            <h2>Object_Id : {res[0]?.id}</h2>
            <h2>Object_Name : {res[0]?.title}</h2>
            <h2>Object_Price : {res[0]?.price}</h2>
            <h2>Object_Rating : {res[0]?.rating.rate}</h2>
        </>
    )
}

export default ApplicationOfUseEffect