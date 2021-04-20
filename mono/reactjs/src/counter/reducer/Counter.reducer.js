import {createAction} from 'redux-actions'

const INCREASE = 'counter/INCREASE'
const DECREASE = 'counter/DECREASE'                 

const increase =createAction(INCREASE)
const decrease = crerateAction(DECREASE)   
        // action  = 변화
const initialState = {number:0}
        //state = 보관

const counterReducer = handdleAction({
                                //분무기에 내용물은 바뀌지 않았다 다만 내용물의 양이 바뀌었을뿐
    INCREASE : (state,action) =>({number : state.number +1}),
    DECREASE : (state,action) =>({number : state.number -1})    //json =  action은 객체 이므로 json(객체)를 리턴한다는 것을 알려준다
})
        //reducer = 변화

        //so 전체적으로 store