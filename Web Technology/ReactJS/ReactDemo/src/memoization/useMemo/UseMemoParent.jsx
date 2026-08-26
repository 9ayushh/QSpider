import React, {useState, useMemo } from 'react'
import UseMemoChild from './UseMemoChild'

const UseMemoParent = () => {

    let [count, setCount] = useState(0);
    let [displayCount, setDisplayCount] = useState(0);

    console.log(`DisplayCount value is ${displayCount}`)

    function expensiveFn() {
        console.log("Function is re-rendering");
        let res = 0;
        for(let i=0; i<100000000; i++){ // Block the UI
            res = count + 1;
        }
        return res;
    }

    useMemo(expensiveFn, [count]);

    return (
        <>
            <h1>UseMemoParent : {count}</h1>
            <h1>UseMemoParent : {displayCount}</h1>
            <button onClick={()=> setCount(count+1)}>Increment Count</button>
            <button onClick={()=> setDisplayCount(displayCount+1)}>Increment DisplayCount</button>
            {/* <UseMemoChild/> */}
        </>
    )
}

export default UseMemoParent