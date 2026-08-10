import React from 'react'
import Cbc from "./Components/Cbc";
import Fbc from "./Components/Fbc"
import StateInFbc from './states/StateInFbc';
import StateInCbc from './states/StateInCbc';
import GrandParent from './props/GrandParent';

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
        </div>
    )
}

export default App