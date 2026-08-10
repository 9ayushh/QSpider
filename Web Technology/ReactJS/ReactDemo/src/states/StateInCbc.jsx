import { Component } from "react";

export default class StateInCbc extends Component {
    
    state = {
        count : 0
    }

    Increment = () => {
        // console.log("function is called");
        this.setState({count : this.state.count + 1});
    }

    render() {
        // console.log(this);
        // console.log(this.state);
        // console.log(this.state.count);

        return (
            <>
                {/* to display the content on your webpage */}
                <h1>State In Class Based Component : {this.state.count}</h1>
                <button onClick={this.Increment}>Increment</button>
                <button onClick={() => this.setState({count : this.state.count - 1})}>Decrement</button>
                <button onClick={() => this.setState({count : 0})}>Reset</button>
            </>
        )
    }
}