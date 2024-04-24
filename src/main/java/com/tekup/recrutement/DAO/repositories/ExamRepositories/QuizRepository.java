package com.tekup.recrutement.DAO.repositories.ExamRepositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tekup.recrutement.DAO.entities.ExamEntities.Quiz;

public interface QuizRepository extends JpaRepository<Quiz, Long>{

}
