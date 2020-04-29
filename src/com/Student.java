package com;

import java.util.ArrayList;
import java.util.Comparator;

public class Student extends Person {

    int studentId;
    int numberOfCourses;
    boolean isTuitionPaid;
    char[] courseGrades;
    Course[] coursesEnrolled;

    public Student() {
    }

    public Student(int studentId, int numberOfCourses, Boolean isTuitionPaid, char[] courseGrades, Course[] coursesEnrolled) {
        this.studentId = studentId;
        this.numberOfCourses = numberOfCourses;
        this.isTuitionPaid = isTuitionPaid;
        this.courseGrades = courseGrades;
        this.coursesEnrolled = coursesEnrolled;
    }

    public void setInfo(String courseName, String CourseNo, int studentId, int numberOfCourses,
            boolean isTuitionPaid, Course[] coursesEnrolled, char[] courseGrades) {
//        this.courseGrades =
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int StudentId) {
        this.studentId = StudentId;
    }

    public int getNumberOfCourses() {
        return numberOfCourses;
    }

    public void setNumberOfCourses(int numberOfCourses) {
        this.numberOfCourses = numberOfCourses;
    }

    public Boolean getIsTuitionPaid() {
        return isTuitionPaid;
    }

    public void setIsTuitionPaid(boolean isTuitionPaid) {
        this.isTuitionPaid = isTuitionPaid;
    }

    public char[] getGrades(int i) {
        return this.courseGrades;
    }

    public void setCourseGrades(char[] courseGrades) {
        this.courseGrades = courseGrades;
    }

    public Course getCourse(int courseId) {
        return this.coursesEnrolled[courseId];
    }

    public void setCoursesEnrolled(Course[] coursesEnrolled) {
        this.coursesEnrolled = coursesEnrolled;
    }

    public boolean isIsTuitionPaid() {
        return isTuitionPaid;
    }

    public char[] getCourseGrades() {
        return courseGrades;
    }

    public Course[] getCoursesEnrolled() {
        return coursesEnrolled;
    }

    public int getHoursEnrolled() {
        int hoursEnrolled = 0;
        for (Course c : coursesEnrolled) {
            hoursEnrolled += c.getCourseCredits();
        }
        return hoursEnrolled;
    }

    public double getGpa() {
        int sum = 0;
        char grade;
        for (int i = 0; i < this.numberOfCourses; i++) {
            grade = coursesEnrolled[i].getCourseGrade();
            switch (grade) {
                case 'A':
                    sum += 4;
                case 'B':
                    sum += 3;
                case 'C':
                    sum += 2;
                case 'D':
                    sum += 1;
                case 'F':
                    sum += 0;
                default:
                    System.out.println(" Grade error ");
            }
        }
        return sum / numberOfCourses;
    }

    public double billingAmount(double hourPrice) {
        int sum =0 ;
        for (int i=0;i<numberOfCourses;i++){
          sum +=  this.coursesEnrolled[i].courseCredits ;
        }
        return sum*hourPrice ;
    }

    public void sortCourses() {

        ArrayList<Course> a = new ArrayList<Course>();
        for (Course course : this.coursesEnrolled) {
            a.add(course);
        }

        a.sort(new Comparator<Course>() {
            @Override
            public int compare(Course o1, Course o2) {
                return o1.courseNo.compareTo(o2.courseNo);
            }
        });
        coursesEnrolled = new Course[numberOfCourses]; 
        for (int i = 0; i < numberOfCourses; i++) {
            coursesEnrolled[i] = a.get(i);
        }
    }
}
