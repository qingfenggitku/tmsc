function checkForm(){
    var nametip = checkUserName();
    var passtip = checkPassword();
    var conpasstip = ConfirmPassword();
    var phonetip = checkPhone();
    var eamil = checkEmail();
    return nametip && passtip && conpasstip && phonetip && eamil;
}
//验证用户名
function checkUserName(){
    var username = document.getElementById('userName');
    var errname = document.getElementById('nameErr');


    var pattern = /^[\da-zA-Z_\u4e00-\u9f5a]{2,16}$/;  //用户名格式正则表达式：用户名要至少2位
    if(username.value.length == 0){
        errname.innerHTML="用户名不能为空"
        errname.className="error"
        return false;
    }
    if(!pattern.test(username.value)){
        errname.innerHTML="用户名不合规范"
        errname.className="error"
        return false;
    }
    else{
        errname.innerHTML="OK"
        errname.className="success";
        return true;
    }
}
/*function checkNickName(){
    var nickName = document.getElementById('nickName');
    var errnickName = document.getElementById('nickNameErr');
    var pattern = /^\w{2,8}$/;  //用户名格式正则表达式：用户名要至少三位
    if(nickName.value.length == 0){
        errnickName.innerHTML="昵称不能为空"
        errnickName.className="error"
        return false;
    }
    if(!pattern.test(nickName.value)){
        errnickName.innerHTML="用户名不合规范"
        errnickName.className="error"
        return false;
    }
    else{
        errnickName.innerHTML="OK"
        errnickName.className="success";
        return true;
    }
}*/
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
//验证手机号
function checkPhone(){
    var userphone = document.getElementById('phoneNumber');
    var phonrErr = document.getElementById('phoneErr');
    var pattern = /^1[34578]\d{9}$/; //验证手机号正则表达式
    if(!pattern.test(userphone.value)){
        phonrErr.innerHTML="手机号码不合规范"
        phonrErr.className="error"
        return false;
    }
    else{
        phonrErr.innerHTML="OK"
        phonrErr.className="success";
        return true;
    }
}
//验证邮箱
function checkEmail(){
    var userEmail = document.getElementById('eamil');
    var eamilErr = document.getElementById('eamilErr');
    var pattern = /^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-]){2,4}(.([a-zA-Z0-9_-]){2,5}){1,2}/; //验证邮箱号正则表达式
    if(!pattern.test(userEmail.value)){
        eamilErr.innerHTML="邮箱格式不合规范"
        eamilErr.className="error"
        return false;
    }
    else{
        eamilErr.innerHTML="OK"
        eamilErr.className="success";
        return true;
    }
}
