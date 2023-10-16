package com.example.kadem.repositories;


import com.example.kadem.entities.Equipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipeRepository  extends JpaRepository<Equipe, Integer> {
}
