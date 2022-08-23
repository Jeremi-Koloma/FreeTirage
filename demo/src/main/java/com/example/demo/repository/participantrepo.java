package com.example.demo.repository;

import com.example.demo.modele.participant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface participantrepo extends JpaRepository<participant,Integer> {
    //@Modifying
    //@Transactional
   // @Query(value = "INSERT INTO participant(nom,prenom,mail) values(?,?,?)",nativeQuery = true)
   // int find( String nom, String prenom, String email);


}
