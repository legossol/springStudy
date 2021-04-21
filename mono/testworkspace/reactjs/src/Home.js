import React from 'react'  

const Home = ({number, increase, decrease}) =>{
    return(<>
    <h2 style={{color:'black'}}>카운터</h2>
    <div>
        <div>
            <button aria-label="+"onClick={ increase}>
                +
            </button>
            <span style={{color: 'black', width: 100}}>{number}</span>
            <button aria-label="-"onClick={decrease}>
                -
            </button>
        </div>
    </div>
    </>
    )
    
}

export default Home