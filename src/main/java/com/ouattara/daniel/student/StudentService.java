package com.ouattara.daniel.student;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    @GetMapping
    public List<Student> getStudents() {
        return List.of(
                new Student(1L, "Mariam Jones", "mariamjones@email.com", LocalDate.of(2001, Month.DECEMBER, 15), 22),
                new Student(2L, "John Doe", "johndoe@email.com", LocalDate.of(1970, Month.JANUARY, 1), 53)
        );
    }
}
