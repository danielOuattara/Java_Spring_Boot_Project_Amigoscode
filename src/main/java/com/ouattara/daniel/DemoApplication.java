package com.ouattara.daniel;

import com.ouattara.daniel.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }


    @GetMapping
    public List<Student> hello() {
        return List.of(
                new Student(1L, "Mariam Jones", "mariamjones@email.com", LocalDate.of(2001, Month.DECEMBER, 15), 22),
                new Student(2L, "John Doe", "johndoe@email.com", LocalDate.of(1970, Month.JANUARY, 1), 53)
        );
    }

}
