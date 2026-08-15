import React, { useState, useLayoutEffect, useEffect } from 'react';

const UseLayout = () => {
    let [data, setData] = useState("JacaScript");

    // useEffect(() => {
    //     setData("ReactJs");    
    // },[]) // runs after the screen paint

    useLayoutEffect(() => {
        setData("ReactJs");
    },[])

    return (
        <>
            <h1>UseLayout : {data}</h1>
        </>
    )
}

export default UseLayout