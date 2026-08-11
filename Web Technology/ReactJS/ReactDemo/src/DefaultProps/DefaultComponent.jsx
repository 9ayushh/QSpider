import DefaultProps1 from "./DefaultProps1"
import DefaultProps2 from "./DefaultProps2"

const DefaultComponent = () => {

    let data = "user1";

    return (
        <>
            <h1>Default Component</h1>
            <DefaultProps1 abc = {data}/>
            <DefaultProps1/>

            <DefaultProps2/>

        </>
    )
}

export default DefaultComponent