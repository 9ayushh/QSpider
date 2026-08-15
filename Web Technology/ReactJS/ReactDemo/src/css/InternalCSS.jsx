import React, { Component } from 'react';

const InternalCSS = () => {

    return (
        <>
            <style>
                {
                    `
                        .example1 {
                            color : red;
                            font-size : 100px;
                            background-color : black;
                        }
                    `
                }
            </style>
            <h1 className='example1'>Internal CSS</h1>
        </>
    )
}

export default InternalCSS