import React from 'react'  
import counterReducer, {increase, decrease} from './Counter.reducer'

const App = ({number, increase, decrease}) =>{
    return(<>
    <h2 style={{color:'black'}}>카운터</h2>
    <div>
        <div>
            <button aria-label="+"onClick={increase}>
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

export default App