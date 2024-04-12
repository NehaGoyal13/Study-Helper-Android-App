package com.zybooks.studyhelper.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.zybooks.studyhelper.model.Subject
import com.zybooks.studyhelper.repo.StudyRepository

class SubjectListViewModel(application: Application) : AndroidViewModel(application) {

    private val studyRepo = StudyRepository.getInstance(application.applicationContext)

    val subjectListLiveData: LiveData<List<Subject>> = studyRepo.getSubjects()

    fun addSubject(subject: Subject) = studyRepo.addSubject(subject)

    fun deleteSubject(subject: Subject) = studyRepo.deleteSubject(subject)
}