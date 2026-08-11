import React, { useState } from 'react';
import { Component } from 'react';

// const Child = (props) => {
const Child = ({data}) => {
    // console.log(props);
    // let {data} = props;
    // console.log(data);

    return (
        <>
            <h1>Child : {data}</h1>
        </>
    )
}

export default Child