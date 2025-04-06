package com.notes.spring_boot_crash_course.database.repository

import com.notes.spring_boot_crash_course.database.models.Note
import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository

// object Ids also have a timestamp
interface NoteRepository: MongoRepository<Note, ObjectId> {
    fun findByOwnerId(owner: ObjectId): List<Note>
//    Rest-controller - a unit that accepts HTTP requests and returns HTTP responses
}

// This is a temporary function to test the repository
