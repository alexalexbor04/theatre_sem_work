package com.example.kp;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    @Query("SELECT p FROM Student p WHERE  CONCAT(p.first, '', p.last, '', p.num, '', p.av) LIKE %?1%")
    List<Student> search(String keyword);
}
