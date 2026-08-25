import React, {useState} from 'react'
import MemoChild from './MemoChild';

const MemoParent = () => {
    let [count, setCount] = useState(0);
    return (
        <>
            <h1>MemoParent : {count}</h1>
            <button onClick={() => setCount(count+1)}>Increment</button>

            <MemoChild/>
        </>
    )
}

export default MemoParent