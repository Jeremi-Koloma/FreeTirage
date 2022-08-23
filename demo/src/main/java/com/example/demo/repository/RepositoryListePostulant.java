package com.example.demo.repository;

import com.example.demo.modele.ListePostulant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Modifying;

import javax.transaction.Transactional;

// cette classe va étendre de l'interface JPA Repository; avec (ENTITY, and ID)
@Repository
public interface RepositoryListePostulant extends JpaRepository<ListePostulant, Long> {
    @Modifying
    @Transactional
    @Query(value = "INSERT INTO listpostulant(libelle,date) values(?,?)",nativeQuery = true)
     int find( String lib, String date);

    ListePostulant findByLibelle(String lib);
}
