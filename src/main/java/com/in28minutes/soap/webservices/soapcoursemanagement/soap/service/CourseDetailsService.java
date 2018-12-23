package com.in28minutes.soap.webservices.soapcoursemanagement.soap.service;

import com.in28minutes.soap.webservices.soapcoursemanagement.soap.bean.Course;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

@Component
public class CourseDetailsService {

    public enum Status {
        SUCCESS, FAILURE; }

    private static List<Course> courses = new ArrayList<>();

    static {
        Course course1 = new Course(1, "Spring", "10 Steps");
        Course course2 = new Course(2, "Spring MVC", "10 Examples");
        Course course3 = new Course(3, "Spring Boot", "10k students");
        Course course4 = new Course(4, "Maven", "Maven course");
        courses.addAll(Arrays.asList(course1, course2, course3, course4));
    }

    public Course findById(int id) {
        for (Course course: courses) {
            if (course.getId() == id) return course;
        }
        return null;
    }

    public List<Course> findAll() {
        return courses;
    }

    public Status deleteById(int id) {
        Iterator<Course> iterator = courses.iterator();
        while (iterator.hasNext()) {
            Course course = iterator.next();
            if (course.getId() == id) {
                iterator.remove();
                return Status.SUCCESS;
            }
        }
        return Status.FAILURE;
    }
}
