package com.ouattara.daniel.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {


    @GetMapping
    public List<Student> hello() {
        return List.of(
                new Student(1L, "Mariam Jones", "mariamjones@email.com", LocalDate.of(2001, Month.DECEMBER, 15), 22),
                new Student(2L, "John Doe", "johndoe@email.com", LocalDate.of(1970, Month.JANUARY, 1), 53)
        );
    }
}
