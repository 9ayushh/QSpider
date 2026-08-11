const DefaultProps2 = (props) => {
    let {data} = props;
    // console.log(abc);

    return (
        <>
            <div>DefaultProps2 : {data || "Guest"}</div>
        </>
    )
}

export default DefaultProps2