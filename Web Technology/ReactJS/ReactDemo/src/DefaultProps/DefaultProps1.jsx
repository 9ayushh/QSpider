const DefaultProps1 = ({abc = "Guest"}) => {
    // let {abc} = props;
    console.log(abc);

    return (
        <>
            <div>DefaultProps1 : {abc}</div>
        </>
    )
}

export default DefaultProps1