let signup = document.getElementById('signup');

// 회원가입
signup.addEventListener('click', () => {
    let studentId = document.getElementById('studentId');
    let password = document.getElementById('password');
    let password2 = document.getElementById('password2');
    let username = document.getElementById('username');
    let phoneNumber = document.getElementById('phoneNumber');

    if (studentId.value.length != 9) {
        alert('학번은 9자 이어야 합니다.');
        console.log('학번은 9자 이어야 합니다.')
        studentId.focus();
    } else if (password.value.length < 4) {
        alert('암호는 4자 이상이어야 합니다.');
        console.log('암호는 4자 이상이어야 합니다.')
        password.focus();
    } else if (password.value != password2.value) {
        alert('암호가 일치하지 않습니다.');
        console.log('암호가 일치하지 않습니다.')
        password2.focus();
    } else if (username.value == '') {
        alert('이름을 입력하지 않았습니다.');
        console.log('이름을 입력하지 않았습니다.')
        username.focus();
    } else if (phoneNumber.value.length != 11 || phoneNumber == '') {
        alert('전화번호는 11자 이어야 합니다.');
        console.log('전화번호는 11자 이어야 합니다.')
        phoneNumber.focus();
    } else {
        alert('회원가입 되었습니다.');
    }
});