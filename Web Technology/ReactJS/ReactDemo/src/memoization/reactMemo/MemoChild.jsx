import React from 'react'

function MemoChild() {
    console.log("child re-render")
  return (
    <>
        <h1>Memo Child</h1>
    </>
  )
}

// export default MemoChild
export default React.memo(MemoChild);