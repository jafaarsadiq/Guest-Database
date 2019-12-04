package net.javaguides.springboot.tutorial.entity;


import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Entity
public class Student {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotBlank(message = "Name is mandatory")
    @Column(name = "name")
    private String name;

    @NotBlank(message = "Email is mandatory")
    @Column(name = "Email")
    private String email;

    @NotBlank(message = "passportNum is mandatory")
    @Column(name = "passportNum")
    private String passportNum;

    @NotBlank(message = "amanatNum is mandatory")
    @Column(name = "amanatNum")
    private String amanatNum;

    @Column(name = "phone_no")
    private long phoneNo;

    @Column(name = "address")
    private String address ;

    @Column(name = "Arrivel date")
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date arrivelDate ;

    public Student() {
    }

    public Student(String name, String email, String passportNum, String amanatNum, String address, Date arrivelDate) {
        this.name = name;
        this.email = email;
        this.passportNum = passportNum;
        this.amanatNum = amanatNum;
        this.address = address;
        this.arrivelDate = arrivelDate;

    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassportNum(String passportNum) {
        this.passportNum = passportNum;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAmanatNum(String amanatNum) {
        this.amanatNum = amanatNum;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAmanatNum() {
        return amanatNum;
    }

    public String getPassportNum() {
        return passportNum;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getAddress(){ return address;
    }

    public void setAddress (String address) {
        this.address = address;
    }

    public Date getArrivelDate(){ return arrivelDate;
    }

    public void setArrivelDate (Date arrivelDate) {
        this.arrivelDate = arrivelDate;
    }

}