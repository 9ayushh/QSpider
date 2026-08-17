import React, { useContext } from 'react';
import { MyContext2 } from './ContextGrandParent';

const ContextChild = () => {

    let {data1, data2, data3} = useContext(MyContext2)
    console.log(data1);

    return (
        <>
            <h1>Context Child : {data1}</h1>
            <h1>Context Child : {data2}</h1>
            <h1>Context Child : {data3}</h1>
        </>
    )
}

export default ContextChild