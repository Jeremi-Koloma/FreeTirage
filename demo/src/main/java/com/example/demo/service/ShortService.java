package com.example.demo.service;

import com.example.demo.modele.participant;
import com.example.demo.repository.participantrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ShortService {
   @Autowired
    participantrepo r;


  /*  public List<participant> rr(Integer o) {
        List<participant>l1=r.findAll();
        List<participant> e = new ArrayList<>();
        for (int i = 0; i < o; i++) {
            int randomIndex = (int) (Math.random() * l1.size());
            e.add(l1.get(randomIndex));
        }

        return e;
    }*/
}
