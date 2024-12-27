package com.teachermanagement.model;
/**
 *
 * @author SuyogShrestha23048669
 */
public class TeacherModel {
    // Attributes
    private int teacherId;
    private String teacherName;
    private double salary;
    private String email;
    private String phoneNumber;
    private String address;
    private String qualification;
    private String specialization;

    // Constructor
    public TeacherModel(int teacherId, String teacherName, int par2, String email, String phoneNumber, String address, String mSc, String math) {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.salary = salary;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.qualification = qualification;
        this.specialization = specialization;
    }

    // Getters and Setters
    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
