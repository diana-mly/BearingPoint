package com.jwt.hibernate.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class Users {
	
	@Id
	//@GeneratedValue
	//@Column(name = "UserID")
    private int UserID;
	
	//@Column(name = "UserName")
    private String UserName;
	
	//@Column(name = "UserSurname")
    private String UserSurname;
	
	//@Column(name = "UserEmail")
    private String UserEmail;
	
	//@Column(name = "UserPass")
    private String UserPass;
	
	//@Column(name = "UserCreated")
    private String DateCreated;
	
	//@Column(name = "UserType")
    private int UserType; 

    
	
	public int getUserID() {
        return UserID;
    }

    public void setUserId(int UserID) {
        this.UserID = UserID;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getUserSurname() {
        return UserSurname;
    }

    public void setUserSurname(String UserSurname) {
        this.UserSurname = UserSurname;
    }
    
    public String getUserEmail() {
        return UserEmail;
    }

    public void setUserEmail(String UserEmail) {
        this.UserEmail = UserEmail;
    }
    
    public String getUserPass() {
        return UserPass;
    }

    public void setUserPass(String UserPass) {
        this.UserPass = UserPass;
    }
    
    public String getDateCreated() {
        return DateCreated;
    }

    public void setDateCreated(String DateCreated) {
        this.DateCreated = DateCreated;
    }
    
    public int getUserType() {
        return UserType;
    }
    
    public void setUserType(int UserType) {
        this.UserType = UserType;
    }
}
