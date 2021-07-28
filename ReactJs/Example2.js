import React from'react';
import ReactDOM from'react-dom';
import'./index.css';
var element=React.createElements('h1',{className:'greeting'},'hello world!');
ReactDOM.render(element,document.getElementById('root'));
