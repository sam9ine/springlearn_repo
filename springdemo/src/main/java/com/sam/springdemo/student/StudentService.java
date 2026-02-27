package com.sam.springdemo.student;


import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    public List<Student> findAllStudents(){        return List.of(
            new Student("harry",
                    "potty",
                    LocalDate.now(),
                    "hp78@gmail.com",
                    18),


            new Student("jerry",
                    "potter",
                    LocalDate.now(),
                    "jp78@gmail.com",
                    19)


        );

    }

}
