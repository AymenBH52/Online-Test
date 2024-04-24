package com.tekup.recrutement.Business.services.ExamServices;

import java.util.Set;

import com.tekup.recrutement.DAO.entities.ExamEntities.Quiz;

public interface QuizService {

    public Quiz addQuiz (Quiz quiz);

    public Quiz updateQuiz (Quiz quiz);

    public Set <Quiz> getQuizzes();

    public Quiz getQuiz (Long quizId);

    public void deleteQuiz (Long quizId);



}
