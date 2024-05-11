package com.nehru.demo.Controller;

import com.nehru.demo.Entity.Student;
import com.nehru.demo.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;
    @PostMapping("/addStudent")
    public Student postDetails(@RequestBody Student student){
        return studentService.saveDetails(student);
    }

}
