import Parent from "./Parent";
import React from 'react';

const GrandParent = () => {
    
    let name = "Raj";

    let skills = ("Java", "React");

    let state = {
        marks : 80
    }

    return (
        <>
            <h1>GrandParent : {name}</h1>
            <Parent str = {name}/>
        </>
    )
}

export default GrandParent