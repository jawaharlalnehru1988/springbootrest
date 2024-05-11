package com.nehru.demo.Service;

import com.nehru.demo.Entity.Student;
import com.nehru.demo.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    public  Student saveDetails(Student student){
        return studentRepo.save(student);
    }
}
