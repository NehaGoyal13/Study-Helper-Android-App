package com.zybooks.studyhelper.repo

import androidx.lifecycle.LiveData
import androidx.room.*
import com.zybooks.studyhelper.model.Question

@Dao
interface QuestionDao {
    @Query("SELECT * FROM Question WHERE id = :id")
    fun getQuestion(id: Long): LiveData<Question?>

    @Query("SELECT * FROM Question WHERE subject_id = :subjectId ORDER BY id")
    fun getQuestions(subjectId: Long): LiveData<List<Question>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addQuestion(question: Question): Long

    @Update
    fun updateQuestion(question: Question)

    @Delete
    fun deleteQuestion(question: Question)
    }