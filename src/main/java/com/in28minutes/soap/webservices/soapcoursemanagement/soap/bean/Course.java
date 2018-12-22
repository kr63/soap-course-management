package com.in28minutes.soap.webservices.soapcoursemanagement.soap.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Course {
    private int id;
    private String name;
    private String description;
}
