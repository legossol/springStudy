import React,{useState} from 'react';
import {Link} from 'react-router-dom';

const Home =() =>{
    
    return(
        <>
        <div style={{width:200,margin:"0 auto"}}>
        <h1>Home</h1>
        <Link to={"/Counter"}>Counter</Link><br/>
        <Link to={"/Login"}>Login</Link><br/>
        <Link to={"/SignUp"}>Sign Up</Link><br/>
        </div>
        </>

    )
}
export default Home;