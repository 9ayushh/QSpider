import Child from "./Child";
import React from 'react';

const Parent = (props) => {

    // console.log(props);

    let {str} = props;

    return (
        <>
            <h1>Parent</h1>
            <Child data = {str}/>
        </>
    )
}

export default Parent