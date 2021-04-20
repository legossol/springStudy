import React, { useCallback } from 'react'
import App from './App'
import {useSelector} from 'react-redux'
import { decrease } from './Counter.reducer'

const CounterContainer = () =>{
    const number = useSelector(state => (state.App.number))
    const dispatch = useDispatch()
    const onIncrease = useCallback(() => dispatch(increase()),[dispatch]))
    const onDecrease = useCallback(() => dispatch(decrease()),[dispatch]))
    return(<>
        <App number={} increase={} decrease={}>
        </App>
    
    </>)
}
export default CounterContainer
