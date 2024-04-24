package com.example.Case.Study.repository;
import com.example.Case.Study.model.Standard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface StandardRepository extends JpaRepository<Standard, Integer> {
    List<Standard> findAllByOrderByIssueDateDesc();
}
