import React from 'react'
import Cbc from "./Components/Cbc";
import Fbc from "./Components/Fbc"
import StateInFbc from './states/StateInFbc';
import StateInCbc from './states/StateInCbc';
import GrandParent from './propsDrilling/GrandParent';
import ParentProp from './propsInReact/ParentProp';
import DefaultComponent from './DefaultProps/DefaultComponent';

const App = () => {
    return (
        <div>
            {/* 
            <h1>App</h1>
            <Fbc/>
            <Cbc/> 
            */}
            <StateInFbc/>
            <StateInCbc/>
            <GrandParent/>
            <ParentProp/>
            <DefaultComponent/>

        </div>
    )
}

export default App