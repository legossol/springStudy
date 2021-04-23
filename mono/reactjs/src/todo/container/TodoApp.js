import 'todo/style/TodoStyle.css'
import { Navi } from 'common/index'
import { useDispatch, useSelector } from 'react-redux'
import { Todos } from 'todo/index'
import { addTodo } from 'todo/reducer/todo.reducer'
import { AddTodo } from 'todo/index'

const TodoApp = () => {
    
    const todos = useSelector(state => (state.todoReducer))
  

    return (<div >
        <Navi/>
        <div style={{marginTop:100}}>
    <AddTodo addTodo={addTodo} />
    <Todos todos={todos}/>
    </div>
</div>)
}
export default TodoApp