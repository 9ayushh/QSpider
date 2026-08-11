const ChildProps = (props) => {
    let {data1, data2, data3} = props;

    console.log(data1);
    console.log(data2);
    console.log(data3);

    return (
        <>
            <h1>ChildProps</h1>
            <h2>String : {data1}</h2>
            <h2>Array : {data2}</h2>
            <h3>Object_Id : {data3.id}</h3>
            <h3>Object_Name : {data3.objName}</h3>
        </>
    )
}

export default ChildProps