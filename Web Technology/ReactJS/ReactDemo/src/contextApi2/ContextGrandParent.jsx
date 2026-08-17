import React, { createContext } from 'react';
import ContextParent from './ContextParent';

// ! Step 1
export let MyContext2 = createContext();

const ContextGrandParent = () => {

    let data1 = "Global Data 1";
    let data2 = "Global Data 2";
    let data3 = "Global Data 3";

    return (
        <>
            <h1>Context Grand Parent</h1>

            <MyContext2.Provider value={{data1, data2, data3}}>
                <ContextParent />
            </MyContext2.Provider>
        </>
    )
}

export default ContextGrandParent