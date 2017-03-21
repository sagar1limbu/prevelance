package com.privilance.model;

import javax.persistence.*;

/**
 * Created by reddevil on 3/20/2017.
 */

@Entity
@Table(name = "eligiblePatient")
public class EligiblePatient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    private String firstName;
    private String lastName;
    private int age;
    private String sex;
    private int district;
    private String vdcMun;
    private int wardNo;
    private String attendStatus;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getDistrict() {
        return district;
    }

    public void setDistrict(int district) {
        this.district = district;
    }

    public String getVdcMun() {
        return vdcMun;
    }

    public void setVdcMun(String vdcMun) {
        this.vdcMun = vdcMun;
    }

    public int getWardNo() {
        return wardNo;
    }

    public void setWardNo(int wardNo) {
        this.wardNo = wardNo;
    }

    public String getAttendStatus() {
        return attendStatus;
    }

    public void setAttendStatus(String attendStatus) {
        this.attendStatus = attendStatus;
    }
}
