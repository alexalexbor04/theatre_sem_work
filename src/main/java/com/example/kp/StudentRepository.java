package com.example.kp;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StudentRepository extends JpaRepository<Theatre, Integer> {
    @Query("SELECT p FROM Theatre p WHERE  CONCAT(p.name, '', p.troupe, '', p.date, '', p.total_tickets, '', p.free_tickets) LIKE %?1%")
    List<Theatre> search(String keyword);

    @Query("SELECT p FROM Theatre p WHERE DATE(p.date) = ?1")
    List<Theatre> findByDate(java.sql.Date date);

    @Query("SELECT DATE(date), COUNT(date) FROM Theatre GROUP BY DATE(date) ORDER BY DATE(date)")
    List<Object[]> countByDayChart();
}
