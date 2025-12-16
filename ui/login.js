function login() {
        let email = document.getElementById("email").value;
        console.log(email);
        let pass = document.getElementById("password").value;
        console.log(pass);
        if (email === "" || password === "") {
            alert("Please fill all fields");
        } else {
            alert("Login successful!");
        }
    }

    function togglePassword() {
        let pwd = document.getElementById("password");
        pwd.type = pwd.type === "password" ? "text" : "password";
    }

function checkCookies() {
  let text = "";
  if (navigator.cookieEnabled == true) {
    text = "Cookies are enabled.";
    console.log("Cookies are enabled");
  } else {
    text = "Cookies are not enabled.";
  }
  document.getElementById("demo").innerHTML = text;
}

function mOver(obj) {
  obj.innerHTML = "Thank You"
}

function mOut(obj) {
  obj.innerHTML = "Mouse Over Me"
}

function mDown(obj) {
  obj.style.backgroundColor = "#1ec5e5";
  obj.innerHTML = "Release Me";
}

function mUp(obj) {
  obj.style.backgroundColor="#D94A38";
  obj.innerHTML="Thank You";
}

function focusing(obj){
    obj.style.backgroundColor = "yellow";
}

document.getElementById("id02").innerHTML = document.getElementById("id01").childNodes[0].nodeValue;