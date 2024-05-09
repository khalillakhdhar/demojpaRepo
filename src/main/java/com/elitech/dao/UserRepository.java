package com.elitech.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elitech.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {
List<User> findByNom(String nom);
List<User> findByNomOrPrenom(String nom, String prenom);
List<User> findByNomAndPrenom(String nom, String prenom);
List<User> findByAgeGreaterThan(int age);
}
