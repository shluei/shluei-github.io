    document.addEventListener('DOMContentLoaded', function() {
            const editForm = document.getElementById('editProfileForm');
            const editBtn = document.getElementById('editProfileBtn');
            const cancelBtn = document.getElementById('cancelBtn');
            const profileForm = document.getElementById('profileForm');
            const userNickname = document.getElementById('userNickname');
            const editNickname = document.getElementById('editNickname');
            function loadUserData() {
                const savedNickname = localStorage.getItem('userNickname');
                if (savedNickname) {
                    userNickname.textContent = savedNickname;
                    editNickname.value = savedNickname;
                    // 更新头像显示昵称的第一个字符
                    userAvatar.textContent = savedNickname.charAt(0);
                }
            }
            document.querySelectorAll('.toggle-password').forEach(icon => {
                icon.addEventListener('click', function() {
                    const inputId = this.id.replace('toggle', '').toLowerCase();
                    const input = document.getElementById(inputId);
                    
                    if (input.type === 'password') {
                        input.type = 'text';
                        this.classList.remove('fa-eye');
                        this.classList.add('fa-eye-slash');
                    } else {
                        input.type = 'password';
                        this.classList.remove('fa-eye-slash');
                        this.classList.add('fa-eye');
                    }
                });
            });
            editBtn.addEventListener('click', function() {
                profileCard.classList.add('hidden');
                setTimeout(() => {
                    editForm.classList.add('active');
                }, 10);
            });
            cancelBtn.addEventListener('click', function() {
                editForm.classList.remove('active');
                setTimeout(() => {
                    profileCard.classList.remove('hidden');
                }, 10);
                editNickname.value = userNickname.textContent;
                oldPassword.value = '';
                newPassword.value = '';
                confirmPassword.value = '';
                clearErrors();
            });
            profileForm.addEventListener('submit', function(e) {
                e.preventDefault();
                clearErrors();  
                let isValid = true;
                const nickname = editNickname.value.trim();
                if (nickname.length < 2 || nickname.length > 10) {
                    nicknameError.textContent = '昵称长度需为2-10个字符';
                    isValid = false;
                }
                const newPwd = newPassword.value;
                const oldPwd = oldPassword.value;
                const confirmPwd = confirmPassword.value;
                
                if (newPwd) {
                   
                    if (!oldPwd) {
                        passwordError.textContent = '修改密码必须填写原密码';
                        isValid = false;
                    }
                    if (newPwd.length < 6) {
                        passwordError.textContent = '密码长度至少6位';
                        isValid = false;
                    }
                    if (newPwd !== confirmPwd) {
                        confirmPasswordError.textContent = '两次输入的密码不一致';
                        isValid = false;
                    }
                }
                if (isValid) {
                    userNickname.textContent = nickname;
                    notification.classList.add('show');
                    setTimeout(() => {
                        notification.classList.remove('show');
                    }, 3000);
                    oldPassword.value = '';
                    newPassword.value = '';
                    confirmPassword.value = '';
                    setTimeout(() => {
                        editForm.classList.remove('active');
                        profileCard.classList.remove('hidden');
                    }, 1000);
                }
            });
            function clearErrors() {
                nicknameError.textContent = '';
                passwordError.textContent = '';
                confirmPasswordError.textContent = '';
            }
           
        });