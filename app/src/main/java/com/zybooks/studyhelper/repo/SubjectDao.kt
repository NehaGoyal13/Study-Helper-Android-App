package com.zybooks.studyhelper.repo

import androidx.room.*
import com.zybooks.studyhelper.model.Subject
import androidx.lifecycle.LiveData

@Dao
interface SubjectDao {
    @Query("SELECT * FROM Subject WHERE id = :id")
     fun getSubject(id: Long): LiveData<Subject?>

    @Query("SELECT * FROM Subject ORDER BY text COLLATE NOCASE")
     fun getSubjects(): LiveData<List<Subject>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
     fun addSubject(subject: Subject): Long

    @Update
     fun updateSubject(subject: Subject)

    @Delete
     fun deleteSubject(subject: Subject)


}