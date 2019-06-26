package com.ansou.crossfit.crossfit.Entity;

import com.ansou.crossfit.crossfit.Interface.Users;

import javax.persistence.*;
import java.util.List;

/*
    Course
 */

@Entity
public class Courses {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "user_list")
    private List<Users> usersList;

    public Courses() {
    }

    public Courses(List<Users> usersList) {
        this.usersList = usersList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Users> getUsersList() {
        return usersList;
    }

    public void setUsersList(List<Users> usersList) {
        this.usersList = usersList;
    }

    @Override
    public String toString() {
        return "Courses{" +
                "id=" + id +
                ", usersList=" + usersList +
                '}';
    }
}
