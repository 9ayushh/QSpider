import { useRef } from "react";

const Uncontrolled = () => {

    let userNameRef = useRef()
    let passwordRef = useRef()
    // ^ useRef is a react hook which persists value or it is used ot access DOM Elements without causing a component re-rendering.
    // ^ It returns an object : {current : value}

    function handleSubmit(e) {
        e.preventDefault();
        console.log("form Submitted");
        // console.log(userNameRef.current, passwordRef)

        let formData =  {
            userName : userNameRef.current.value,
            password : passwordRef.current.value
        }

        console.log(formData);
    }

    return (
        <>
            <h1>Uncontrolled Component</h1>
            <form onSubmit={handleSubmit}>
                <input type="text" placeholder="Enter Username" ref={userNameRef}/>
                <input type="password" placeholder="Enter Username" ref={passwordRef}/>
                <button>Submit</button>
            </form>
        </>
    )
}

export default Uncontrolled