import React,{useState} from 'react';
import Counter from './cmm/container/Counter';
import Login from './sec/container/Login';
import SignUp from './uss/container/SignUp'
import Home from "./cmm/container/Home";
import { Route } from "react-router-dom";
//react에서 React컴포넌트안에있는 useState를 쓴다 
// var pow = function(x) {return x*x;};

const App =( )=>{

  return(
    <>
    <Route path="" component={Home}/>
    <Route path="/Counter"component={Counter}/>
    <Route path="/Login"component={Login}/>
    <Route path="/SignUp"component={SignUp}/>
    </>
  )
}

export default App;
