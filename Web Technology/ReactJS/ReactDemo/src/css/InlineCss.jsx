const InlineCss = () => {
    let h1Style = {
        color : "blue",
        fontSize : "100px",
        backgroundColor : "green"
    }

    return (
        <>
            <h1 style={{color:"red"}}>Inline CSS</h1>
            <h1 style={h1Style}>CSS Example 2</h1>
        </>
    )
}

export default InlineCss