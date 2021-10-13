package com.example.learnspringboost.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.learnspringboost.model.Person;

public interface PersonDAO extends JpaRepository<Person, Integer> {
}
