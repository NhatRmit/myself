var pwd = document.getElementById("pwd"),
    cpwd = document.getElementById("cpwd");

function validatePassword() {
    if (pwd.value != cpwd.value) {
        cpwd.setCustomValidity("Passwords Don't Match");
    } else {
        cpwd.setCustomValidity('');
    }
}

pwd.onchange = validatePassword;
cpwd.onkeyup = validatePassword;