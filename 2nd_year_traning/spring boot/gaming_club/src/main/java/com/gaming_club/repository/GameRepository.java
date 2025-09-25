package com.gaming_club.repository;


import com.gaming_club.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;


public interface GameRepository extends JpaRepository<Game, Integer> {
   
}
