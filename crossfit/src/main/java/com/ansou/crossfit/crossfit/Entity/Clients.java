package com.ansou.crossfit.crossfit.Entity;

import com.ansou.crossfit.crossfit.Interface.Users;

import javax.persistence.*;
import java.util.List;

/*
    Clients
 */

@Entity(name = "clients")
public class Clients implements Users {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "username")
    private String username;

    @Column(name = "firstname")
    private String firstname;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "email")
    private String email;

    @Column(name = "phonenumber")
    private String phonenumber;

    @Column(name = "related_users")
    private List<Users> relatedUsers;

    public Clients() {
    }

    public Clients(String username, String firstname, String lastname, String email, String phonenumber, List<Users> relatedUsers) {
        this.username = username;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.phonenumber = phonenumber;
        this.relatedUsers = relatedUsers;
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

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public List<Users> getRelatedUsers() {
        return relatedUsers;
    }

    public void setRelatedUsers(List<Users> relatedUsers) {
        this.relatedUsers = relatedUsers;
    }

    @Override
    public String toString() {
        return "Clients{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ", relatedUsers=" + relatedUsers +
                '}';
    }
}
