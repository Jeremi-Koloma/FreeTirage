package com.example.demo.repository;

import com.example.demo.modele.ShortList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShortRepo extends JpaRepository<ShortList,Long> {
}
