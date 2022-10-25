package com.example.CRUD.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
    public List<Student> getStudents() {
        return List.of(new Student(1L,
                "Hessah",
                "hessahalhussain@gmail.com",
                LocalDate.of(2000, Month.FEBRUARY, 16),
                22));
    }
}
