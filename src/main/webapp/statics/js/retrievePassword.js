function checkForm(){

    var passtip = checkPassword();
    var conpasstip = ConfirmPassword();

    return  passtip && conpasstip;
}
//验证密码
function checkPassword(){
    var userpasswd = document.getElementById('pwd');
    var errPasswd = document.getElementById('passwordErr');
    var pattern = /^\w{4,16}$/; //密码要在4-8位
    if(!pattern.test(userpasswd.value)){
        errPasswd.innerHTML="密码不合规范"
        errPasswd.className="error"
        return false;
    }
    else{
        errPasswd.innerHTML="OK"
        errPasswd.className="success";
        return true;
    }
}
//确认密码
function ConfirmPassword(){
    var userpasswd = document.getElementById('pwd');
    var userConPassword = document.getElementById('userConfirmPasword');
    var errConPasswd = document.getElementById('conPasswordErr');
    if((userpasswd.value)!=(userConPassword.value) || userConPassword.value.length == 0){
        errConPasswd.innerHTML="上下密码不一致"
        errConPasswd.className="error"
        return false;
    }
    else{
        errConPasswd.innerHTML="OK"
        errConPasswd.className="success";
        return true;
    }
}