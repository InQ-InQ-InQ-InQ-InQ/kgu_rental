(function () {

  var forms = document.querySelectorAll('.needs-validation')

  Array.prototype.slice.call(forms)
    .forEach(function (form) {
      form.addEventListener('submit', function (event) {
        if (!form.checkValidity()) {
          event.preventDefault()
          event.stopPropagation()
        }

        form.classList.add('was-validated')
      }, false)
    })
})()

function passwordCheck() {
  var p1 = document.getElementById('password1').value;
  var p2 = document.getElementById('password2').value;
  if( p1 != p2 ) {
    alert("비밀번호가 일치 하지 않습니다");
    return false;
  } else{
    alert("정보가 수정되었습니다.");
    return true;
  }

}



function dataRenew(){
//구현하기

}