document.addEventListener("DOMContentLoaded", function () {
    const idInput = document.getElementById("id");
    const passwordInput = document.getElementById("password");
    const passwordConfirmInput = document.getElementById("passwordConfirm");
    const sendSMSBtn = document.getElementById("sendSMSBtn");
    const phoneNumberInput = document.getElementById("phoneNumber");
    const verificationCodeInput = document.getElementById("verificationCode");
    const agreeCheckbox = document.getElementById("agree");

    const checkIdMsg = document.getElementById("check-id-msg");
    const checkPwMsg = document.getElementById("check-pw-msg");
    const checkPwConfirmMsg = document.getElementById("check-pw-confirm-msg");
    const verificationStatus = document.getElementById("verification-status");

    // 아이디 중복 검사
    idInput.addEventListener("change", function () {
        const memberId = idInput.value.trim();
        if (memberId === "") {
            checkIdMsg.textContent = "아이디를 입력해주세요.";
            checkIdMsg.style.color = "red";
            return;
        }

        fetch(`/member/checkIdOk.me?memberId=${encodeURIComponent(memberId)}`)
            .then(response => {
                if (!response.ok) throw new Error(`HTTP 오류! 상태 코드: ${response.status}`);
                return response.json();
            })
            .then(data => {
                if (data.available) {
                    checkIdMsg.textContent = "사용 가능한 아이디입니다.";
                    checkIdMsg.style.color = "green";
                } else {
                    checkIdMsg.textContent = "이미 사용 중인 아이디입니다.";
                    checkIdMsg.style.color = "red";
                }
            })
            .catch(error => {
                console.error("아이디 중복 검사 오류:", error);
                checkIdMsg.textContent = "아이디 중복 검사 중 오류가 발생했습니다.";
                checkIdMsg.style.color = "red";
            });
    });

    // 비밀번호 유효성 검사
    const passwordRegex = /^(?=.*[a-zA-Z])(?=.*\d)(?=.*[!@#$%^&*])[A-Za-z\d!@#$%^&*]{8,}$/;

    passwordInput.addEventListener("blur", function () {
        const password = passwordInput.value.trim();
        if (passwordRegex.test(password)) {
            checkPwMsg.textContent = "사용 가능한 비밀번호입니다.";
            checkPwMsg.style.color = "green";
        } else {
            checkPwMsg.textContent = "비밀번호는 영문, 숫자, 특수문자를 포함하여 8자 이상 입력해야 합니다.";
            checkPwMsg.style.color = "red";
        }
    });

    passwordConfirmInput.addEventListener("blur", function () {
        const password = passwordInput.value.trim();
        const confirmPassword = passwordConfirmInput.value.trim();

        if (password === confirmPassword && password !== "") {
            checkPwConfirmMsg.textContent = "비밀번호가 일치합니다.";
            checkPwConfirmMsg.style.color = "green";
        } else {
            checkPwConfirmMsg.textContent = "비밀번호가 일치하지 않습니다.";
            checkPwConfirmMsg.style.color = "red";
        }
    });

    // SMS 인증번호 발송
    sendSMSBtn.addEventListener("click", function () {
        const phoneNumber = phoneNumberInput.value.trim();
        if (phoneNumber === "") {
            alert("핸드폰 번호를 입력해주세요.");
            return;
        }

        fetch("/member/sendSMS.me", {
            method: "POST",
            headers: { "Content-Type": "application/json" },
            body: JSON.stringify({ phoneNumber: phoneNumber })
        })
         .then(response => {
                 if (!response.ok) throw new Error(`HTTP 오류! 상태 코드: ${response.status}`);
             })
         .then(() => {
            console.log("발송 성공");
            console.log(verificationCodeInput.disabled);
            verificationCodeInput.disabled = false;
            console.log(verificationCodeInput.disabled);
            
            
         })
            .catch(error => {
                console.error("SMS 발송 오류:", error);
                alert("인증번호 발송 중 오류가 발생했습니다.");
            });
    });

    // 인증번호 확인
    verificationCodeInput.addEventListener("blur", function () {
        const verificationCode = verificationCodeInput.value.trim();
        if (verificationCode === "") {
            verificationStatus.textContent = "인증번호를 입력해주세요."; 
            verificationStatus.style.color = "red";
            return;
        }

        fetch("/member/verifyCode.me", {
            method: "POST",
            headers: { "Content-Type": "application/json" },
            body: JSON.stringify({ code: verificationCode })
        })
            .then(response => {
                if (!response.ok) throw new Error(`HTTP 오류! 상태 코드: ${response.status}`);
                return response.json();
            })
            .then(data => {
            console.log(data);
                if (data.success) {
                    verificationStatus.textContent = "인증에 성공했습니다.";
                    verificationStatus.style.color = "green";
                } else {
                    verificationStatus.textContent = "인증번호가 일치하지 않습니다.";
                    verificationStatus.style.color = "red";
                }
            })
            .catch(error => {
                console.error("인증 확인 오류:", error);
                verificationStatus.textContent = "인증 처리 중 오류가 발생했습니다.";
                verificationStatus.style.color = "red";
            });
    });

    // 폼 제출 전 약관 확인
    document.querySelector("form").addEventListener("submit", function (e) {
        if (!agreeCheckbox.checked) {
            e.preventDefault();
            alert("약관에 동의해주세요.");
        }
    });
});