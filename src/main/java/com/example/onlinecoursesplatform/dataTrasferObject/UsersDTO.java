package com.example.onlinecoursesplatform.dataTrasferObject;

import com.example.onlinecoursesplatform.model.Role;

public class UsersDTO {
    private Long userId;
    private String userName;
    private String password;
    private Role role;

    public UsersDTO() {
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
