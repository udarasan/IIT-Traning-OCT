package com.example.demo.dto;

/**
 * @TimeStamp 2024-11-07 21:28
 * @ProjectDetails demo
 * @Author udarasan
 */
//DTO - DATA TRANSFER OBJECTS
public class UserDTO {
    private String username;
    private String password;
    private String fName;
    private String sName;
    private String email;

    public UserDTO(String username, String password, String fName, String sName, String email) {
        this.username = username;
        this.password = password;
        this.fName = fName;
        this.sName = sName;
        this.email = email;
    }

    public UserDTO() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
