let login = document.getElementById('login');
let logout = document.getElementById('logout');
let user = {

}
// 로그인
login.addEventListener('click', () => {
    let studentId = document.getElementById('studentId');
    let password = document.getElementById('password');

    if (studentId.value == user.studentId && password.value == user.password) {
            alert('로그인 되었습니다.');
            console.log('로그인 되었습니다.');
    } else {
        alert('아이디 또는 암호가 올바르지 않습니다.');
        console.log('아이디 또는 암호가 올바르지 않습니다.');
    }
});
// 로그아웃
logout.addEventListener('click', () => {
    alert('로그아웃 되었습니다.');
})