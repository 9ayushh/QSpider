import React, { useState } from 'react'
import Cbc from "./Components/Cbc";
import Fbc from "./Components/Fbc"
import StateInFbc from './states/StateInFbc';
import StateInCbc from './states/StateInCbc';
import GrandParent from './propsDrilling/GrandParent';
import ParentProp from './propsInReact/ParentProp';
import DefaultComponent from './DefaultProps/DefaultComponent';
import LifeCycleInCbc from './LifeCycle/LifeCycleInCbc';
import LifeCycleInFbc from './LifeCycle/LifeCycleInFbc';
import ApplicationOfUseEffect from './useEffect/ApplicationOfUseEffect';

const App = () => {
    let [toggle, setToggle] = useState(false);
    // console.log(toggle);

    return (
        <div>
            {/* 
            <h1>App</h1>
            <Fbc/>
            <Cbc/> 
            */}
            {/* <StateInFbc/>
            <StateInCbc/>
            <GrandParent/>
            <ParentProp/>
            <DefaultComponent/> */}
            {/* <LifeCycleInCbc/> */}
            
            <br />
            <button onClick={() => setToggle(!toggle)}>Toggle</button>
            {/* {toggle ? <LifeCycleInCbc/> :  <h2>No-Component</h2>} */}
            {/* {toggle ? <LifeCycleInFbc/> :  <h2>No-Component</h2>} */}
            {toggle ? <ApplicationOfUseEffect/> :  <h2>No-Component</h2>}

        </div>
    )
}

export default App