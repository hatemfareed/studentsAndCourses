/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author HP
 */
public class Main {

    public static void main(String[] args) { 

        Course c1 = new Course("MATH", "MATH4332", 3, 'A');
        Course c2 = new Course("PHYS", "PYSH4332", 3, 'A');
        Course c3 = new Course("CHEM", "CHEM4332", 3, 'A');
        Course c4 = new Course("SHAR", "SHAR5332", 3, 'A');

        Student s = new Student();
        s.setCoursesEnrolled(new Course[]{c1, c2, c3, c4});
        s.setNumberOfCourses(4);
        s.sortCourses();

        for (Course c : s.getCoursesEnrolled()) {
            System.out.println(c.getCourseNo());
        }
    }

}
