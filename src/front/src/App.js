import React, { Component } from 'react';
import logo from './Eat.svg';
import './App.css';

class App extends Component {
  render() {
    return (
      <div className="App">
        <header className="App-header">
          <img src={logo} className="App-logo" alt="logo" />
          <h1 className="App-title">欢迎来到兰州交大食堂</h1>
        </header>
        <p className="App-intro">
          这里是吃货的世界！这里是吃货的天堂！
        </p>
      </div>
    );
  }
}

export default App;
