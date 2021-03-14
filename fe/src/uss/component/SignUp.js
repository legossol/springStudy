import './Signup.css'

const SignUp = () =>
(
  <form className="modal-content">
    <div className="container" >
      <h1>Sign Up</h1>
      <p>Please fill in this form to create an account.</p>
      <hr/>
      <label for="email"><b>Email</b></label>
      <input type="text" placeholder="Enter Email" name="email" required/>

      <label for="psw"><b>Password</b></label>
      <input type="password" placeholder="Enter Password" name="psw" required/>

      <label for="psw-repeat"><b>Repeat Password</b></label>
      <input type="password" placeholder="Repeat Password" name="psw-repeat" required/>
      
      <label>
        <input type="checkbox" checked="checked" name="remember"/> Remember me
      </label>

      <p>By creating an account you agree to our <a href="#" style={{color:"dodgerblue"}}>Terms Privacy</a>.</p>

      <div className="clearfix">
        <button type="button" onclick="document.getElementById('id01').style.display='none'" className="cancelbtn">Cancel</button>
        <button type="submit" className="signupbtn">Sign Up</button>
      </div>
    </div>
  </form>
)

export default SignUp;
