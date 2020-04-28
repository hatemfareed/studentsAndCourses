package com;

public class Course {

    String courseName;
    String courseNo;
    int courseCredits;
    char courseGrade;

    public Course() {
    }

    public Course(String CourseName, String CourseNo, int courseCredits, char courseGrade) {
        this.courseName = CourseName;
        this.courseNo = CourseNo;
        this.courseCredits = courseCredits;
        this.courseGrade = courseGrade;
    }

    public void setCourseName(String CourseName) {
        this.courseName = CourseName;
    }

    public void setCourseNo(String CourseNo) {
        this.courseNo = CourseNo;
    }

    public void setCourseCredits(int courseCredits) {
        this.courseCredits = courseCredits;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseNo() {
        return courseNo;
    }

    public int getCourseCredits() {
        return courseCredits;
    }

    public char getCourseGrade() {
        return courseGrade;
    }

    public void setCourseGrade(char courseGrade) {
        this.courseGrade = courseGrade;
    }

    public void setCourseInfo(String CourseName, String CourseNo, int courseCredits, char courseGrade) {
        this.courseName = CourseName;
        this.courseNo = CourseNo;
        this.courseCredits = courseCredits;
        this.courseGrade = courseGrade;
    }

    public void copyCourseInfo(Course course) { 
        this.courseCredits = course.courseCredits;
        this.courseName = course.courseName;
        this.courseNo = course.courseNo;
        this.courseGrade = course.courseGrade;
    }

    @Override
    public String toString() {
        return "";
    }

}
