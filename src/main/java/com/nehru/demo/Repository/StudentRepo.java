package com.nehru.demo.Repository;


//import com.nehru.demo.Entity.Student;
import com.nehru.demo.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Integer> {

}
