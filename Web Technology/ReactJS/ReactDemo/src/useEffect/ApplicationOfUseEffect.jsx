import React, { Fragment, useEffect, useState } from 'react';

const ApplicationOfUseEffect = () => {

    const [res, setRes] = useState([]);
    useEffect( () => {
        (async () => {
            let res = await fetch('https://fakestoreapi.com/products');
            let data = await res.json();

            setRes(data);
        })();

    },[]);

    // timing function
    useEffect( () => {
        let count = 0;
        let clearData = setInterval(() => {
            console.log(count);
            count++;
        }, 1000)

        return () => {
            clearInterval(clearData);
        }
    },[])

    let[count,setCount] = useState(0);
    useEffect(() => {
        document.title = `Message ${count}`;
    },[count])
    

    return (
        <>
            <h1>UseEffect : {count}</h1>
            {/* { 
                res.map((val) => {
                    let {id, category, price, image} = val;
                    // console.log(id, category, price, image);
                    return (
                        <Fragment key={id}>
                            <h2>{id}</h2>
                            <h2>{category}</h2>
                            <h2>{price}</h2>
                            <img src={image} height={200} width={200} alt="" />
                        </Fragment>
                    )
                })
            } */}
            <button onClick={() => setCount(count+1)}>Increment</button>

        </>
    )
}

export default ApplicationOfUseEffect