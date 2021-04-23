import { createSlice } from '@reduxjs/toolkit'
import uuid from 'uuid/v4'
const initialState = [
    {id: 1, text: '리액트 학습', done: true},
    {id: 2, text: '리덕스 학습', done: true},
]
// 기능: addTodo, findTodo, editTodo, remove
const todoReducer = createSlice({
    name: 'todoReducer',
    initialState,
    reducers: {
        addTodo(state, {payload}){ state.push({id: uuid(), text: payload, done: false}) },
        remove(state, {payload}){ state.filter((todo) => todo.id !== payload.id )}
     }})
    //     addTodo(){(state, {payload: input})=>{
    //         state.input = input
    //     }},
    //     findTodo(){(state, action)=>{
    //             const {id, text} = action.payload
    //             state.todos.push({id, text, done: false});
    //         }
    //     },
    //     editTodo(){(state, action)=>{
    //         const todo = state.todos.find(todo => todo.id === action.payload)
    //         if(todo){
    //             todo.done = !todo.done
    //         }
    //     }
    // },
    //     remove(){(state, action)=>{
    //         const {id} = action.payload
    //         const i = state.todos.findIndex(todo => todo.id === id)
    //         state.todos.splice(i, 1)
    //         }
    //     }
    
const { actions, reducer } = todoReducer
export const {addTodo,remove} = actions
export default reducer