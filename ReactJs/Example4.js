import React from 'react';
import ReactDOM from 'react-dom';
class Clock extends React.component{
    constructor(props){
        super(props);
        this.state={date:new Date()};

    }
    render(){
        return(
        <div>
            <h1>Hello,World!</h1>
            <h2>It is{this.state.date.toLocaleTimeString()}.</h2>
            </div>
            );
        }
    }
    ReactDOM.render(
        <clock />,
        document.getElementById('root')

    );

    export default Clock;