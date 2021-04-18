import Home from 'common/component/Home'
import {ArticleList, ArticleWrite, ArticleDetail, ArticleUpdate} from 'article/index' 
import {Login,SignUp,UserDetail} from 'user/index'
import {News,SeoulCCTV} from 'board/index'
import { Route } from 'react-router-dom'
import address
const App = () => {
  return (
    <div className="App">
      <Route exact path='/' component={ Home } />
      <Route exact path='/article/article-list' component={ ArticleList } />
      <Route exact path='/article/article-write' component={ ArticleWrite } />
      <Route exact path='/article/article-detail' component={ ArticleDetail } />
      <Route exact path='/article/article-update' component={ ArticleUpdate } />
      <Route exact path='/board/news' component={ News } />
      <Route exact path='/user/login' component={Login} />
      <Route exact path='/user/signUp' component={SignUp} />
      <Route exact path='/user/user-detail' component={UserDetail} />
      <Route exact path='/board/component/seoul-cctv' component={SeoulCCTV}/>
  </div>
  );
}

export default App;
