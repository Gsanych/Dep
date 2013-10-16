package com.aimprosoft.database.model;

import java.util.Date;

/**
 * Date: 10/16/13
 * Time: 11:44 AM
 */
public class Employee {
    private int id;
    private String name;
    private String surname;
    private String email;
    private int age;
    private Date birthday;
    private String department;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id=id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email=email;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age=age;
    }

    public Date getBirthday(){
        return birthday;
    }

    public void setBirthday(Date birthday){
        this.birthday=birthday;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
