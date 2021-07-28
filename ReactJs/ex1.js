import React from 'react';
import ReactDOM from 'react-dom';
import'./index.css';
class Student extends React.Component{
    render(){
        return<p>This is a training</p>;
    }
}
ReactDOM.render(<Student/>,
    document.getElementById('root'));