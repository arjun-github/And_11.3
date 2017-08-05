package com.acadgild.assignment_113;
import android.graphics.Bitmap;


public class Student {
    public String stuName;
    public String stuAge;
    public Bitmap employeePhoto;


    public Student() {}
    public Student(String stuName, String stuAge, Bitmap employeePhoto) {
        this.stuName = stuName;
        this.stuAge = stuAge;
        this.employeePhoto = employeePhoto;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuAge() {
        return stuAge;
    }

    public void setStuAge(String stuAge) {
        this.stuAge = stuAge;
    }

    public Bitmap getEmployeePhoto() {
        return employeePhoto;
    }
    public void setEmployeePhoto(Bitmap employeePhoto) {
        this.employeePhoto = employeePhoto;
    }

}