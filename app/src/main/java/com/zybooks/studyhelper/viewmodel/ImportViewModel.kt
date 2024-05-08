package com.zybooks.studyhelper.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.zybooks.studyhelper.model.Subject
import com.zybooks.studyhelper.repo.StudyRepository


class ImportViewModel(application: Application) : AndroidViewModel(application) {

    private val studyRepo = StudyRepository.getInstance(application)

    var importedSubject = studyRepo.importedSubject
    var fetchedSubjectList = studyRepo.fetchedSubjectList

    fun addSubject(subject: Subject) {
        studyRepo.addSubject(subject)
        studyRepo.fetchQuestions(subject)
    }

    fun fetchSubjects() = studyRepo.fetchSubjects()
}

