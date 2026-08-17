import React from 'react';
import ContextChild1 from './ContextChild1';
import MyContext from './MyContext';

const ContextParent = () => {

    let data1 = "Global Data";


    return (
        <>
            <h1>Context Parent</h1>

            <MyContext.Provider value={data1}>
                <ContextChild1/>
            </MyContext.Provider>

            {/* <ContextChild1/> */}
        </>
    )
}

export default ContextParent