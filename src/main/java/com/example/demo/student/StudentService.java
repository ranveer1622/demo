package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents() {
        Student student = new Student(1,
                "Ran",
                "raneerv@426gmail.com",
                LocalDate.of(1994, Month.APRIL, 5),
                23);
        return List.of(student);
    }
}
