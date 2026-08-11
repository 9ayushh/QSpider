import ChildProps from "./ChildProps"

const ParentProp = () => {
    
    let str = "abcd";
    let skills = ["HTML", "CSS", "JS"];
    let obj =  {
        id : 1,
        objName : "abcde",
        address : {
            pin : 567,
            street : "xyz"
        }
    }

    return (
        <>
            <h1>ParentProp</h1>
            <ChildProps data1={str} data2={skills} data3={obj} />
        </>
    )
}

export default ParentProp