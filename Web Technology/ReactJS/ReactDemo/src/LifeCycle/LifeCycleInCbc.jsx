import React, { Component } from 'react';

export default class LifeCycleInCbc extends Component {

    state = {
        count : 0
    }

    componentDidMount() {
        console.log("Mounting Phase");
    }

    componentDidUpdate(){
        console.log("Updation Phase");
    }
    
    componentWillUnmount() {
        console.log("Unmounting Phase");
    }

    Increment = () => {
        this.setState({count : this.state.count + 1});
    }

    render() {
        return (
            <>
                <h1>LifeCycleInCbc : {this.state.count}</h1>
                <button onClick={this.Increment}>Increment</button>
            </>
        )
    }
}