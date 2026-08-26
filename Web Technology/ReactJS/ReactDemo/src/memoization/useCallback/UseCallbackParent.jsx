import React, { useCallback, useState } from 'react'
import UseCallbackChild from './UseCallbackChild';

const UseCallbackParent = () => {
    let [count, setCount] = useState(0);

    let expensiveFn = useCallback(function (){
        console.log("Component re-render");
    },[]);

    return (
        <>
            <h1>UseCallbackParent : {count}</h1>
            <button onClick={() => setCount(count + 1)}>Increment</button>
            <UseCallbackChild expensiveFn={expensiveFn}/>
        </>
    )
}

export default UseCallbackParent;