package com.example.demo.repository;

import com.example.demo.modele.Tirage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryTirage extends JpaRepository<Tirage, Long> {
}
