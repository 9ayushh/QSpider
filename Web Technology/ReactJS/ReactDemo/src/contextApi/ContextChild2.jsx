import React, { useContext } from 'react';
import MyContext from './MyContext';

const ContextChild2 = () => {

    let globalData = useContext(MyContext)

    return (
        <>
            <h1>Child 2 : {globalData} </h1>
        </>
    )
}

export default ContextChild2