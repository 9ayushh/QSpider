import { useState } from "react";

function StateInFbc() {
    
    // let count = 0; // static variable

    // console.log(useState);
    // console.log(useState(0));
    // console.log(useState("abc"));

    let [count, setCount] = useState(0);
    // console.log(count);
    // console.log(setCount);

    function increment(){
        console.log(count);
        setCount(count + 1);
    }

    function decrement(){
        console.log(count);
        setCount(count - 1);
    }

    // function reset(){
    //     console.log(count);
    //     setCount(0);
    // }

    return (
        <>
            {/* to display the content on your webpage */}
            <h1>State In Function Based Component : {count}</h1>
            <button onClick={increment}>Increment</button>
            <button onClick={decrement}>Decrement</button>
            <button onClick={() => setCount(0)}>Reset</button>
        </>
    )
}

export default StateInFbc