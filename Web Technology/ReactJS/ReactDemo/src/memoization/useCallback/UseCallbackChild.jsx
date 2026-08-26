import React from 'react'

const UseCallbackChild = () => {
    console.log("Child re-render");
    
  return (
    <>
        <h1>UseCallback Child</h1>
    </>
  )
}

export default React.memo(UseCallbackChild)