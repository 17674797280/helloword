package com.yidu.ssmdemo007.bean;

public class Stuident2 {
   private Integer stuId;
   private  String stuName;
   private String stuSex;
   private int stuAge;
   private String stuEmail;
   private String stuAddress;
   private int  classId;


    public Stuident2() {
    }

    public Stuident2(Integer stuId, String stuName, String stuSex, int stuAge, String stuEmail, String stuAddress, int classId) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.stuSex = stuSex;
        this.stuAge = stuAge;
        this.stuEmail = stuEmail;
        this.stuAddress = stuAddress;
        this.classId = classId;
    }

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuSex() {
        return stuSex;
    }

    public void setStuSex(String stuSex) {
        this.stuSex = stuSex;
    }

    public int getStuAge() {
        return stuAge;
    }

    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }

    public String getStuEmail() {
        return stuEmail;
    }

    public void setStuEmail(String stuEmail) {
        this.stuEmail = stuEmail;
    }

    public String getStuAddress() {
        return stuAddress;
    }

    public void setStuAddress(String stuAddress) {
        this.stuAddress = stuAddress;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    @Override
    public String toString() {
        return "Stuident2{" +
                "stuId=" + stuId +
                ", stuName='" + stuName + '\'' +
                ", stuSex='" + stuSex + '\'' +
                ", stuAge=" + stuAge +
                ", stuEmail='" + stuEmail + '\'' +
                ", stuAddress='" + stuAddress + '\'' +
                ", classId=" + classId +
                '}';
    }
}
