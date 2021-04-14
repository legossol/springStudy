import React,{ useState } from 'react';

const Randa = () => {
    
    const [count,setCount] = useState(0)
    const decrease = () => {setCount(count-1)}
    const increase = () => setCount(count+1)
    
    return(
        <>
        <h1>초깃값 : </h1>
        <button onClick={decrease}>-</button>
        <button onClick={increase}>+</button>
        </>
    )

}

export default Randa;