import React , { useEffect, useState } from 'react';

const LifeCycleInFbc = () => {

    let [count, setCount] = useState(0);

    useEffect( () => {
        console.log("Mounting Phase");
    }, []) // [] empty array -> means Mounting phase

    useEffect(() => {
        console.log("Updation Phase");
    }, [count]) // [variable] array with changing variable -> means updating and updation phase

    useEffect(() => {
        // cleanup function -> used to remove eventListner
        return () => { 
            console.log("Un-mounting Phase");
        }
    }, []) // [] empty array but having return function...

    return (
        <>
            <h1>LifeCycleInFbc : {count}</h1>
            <button onClick={() =>  setCount(count+1)}>Increment</button>
        </>
    )
}

export default LifeCycleInFbc