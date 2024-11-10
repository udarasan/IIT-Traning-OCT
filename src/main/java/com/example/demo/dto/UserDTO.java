package com.example.demo.dto;

/**
 * @TimeStamp 2024-11-07 21:28
 * @ProjectDetails demo
 * @Author udarasan
 */
//DTO - DATA TRANSFER OBJECTS
public class UserDTO {
    private int id;
    private String username;
    private String password;
    private String fName;
    private String sName;
    private String email;

    public UserDTO(int id, String username, String password, String fName, String sName, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.fName = fName;
        this.sName = sName;
        this.email = email;
    }

    public UserDTO() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "UserDTO{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", fName='" + fName + '\'' +
                ", sName='" + sName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
