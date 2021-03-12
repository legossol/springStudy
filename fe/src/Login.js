import './App.css';

const Login = () =>
    // const butt={
    //     background:"#f1f1f1"
    // }

        <form className="modal-content animate" method="post">
            <div className="imgcontainer">
            <span onclick="document.getElementById('id01').style.display='none'" className="close" title="Close Modal">&times;</span>
            <img src="logo192.png" alt="Avatar" className="avatar"/>
            </div>
    
            <div className="container">
            <label for="uname"><b>Username</b></label>
            <input type="text" placeholder="Enter Username" name="uname" required/>
    
            <label for="psw"><b>Password</b></label>
            <input type="password" placeholder="Enter Password" name="psw" required/>
                
            <button type="submit">Login</button>
            <label>
                <input type="checkbox" checked="checked" name="remember"/> Remember me
          </label>
        </div>
    
        <div className="container" style={{background:"#f1f1f1"}}>
          <button type="button" onclick="document.getElementById('id01').style.display='none'" className="cancelbtn">Cancel</button>
          <span className="psw">Forgot <a href="#">password?</a></span>
        </div>
      </form>

export default Login;