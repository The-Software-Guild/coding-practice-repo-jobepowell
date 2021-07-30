/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jobep.classroster.service;

import com.jobep.classroster.dao.ClassRosterPersistenceException;
import com.jobep.classroster.dto.Student;
import java.util.List;

/**
 *
 * @author powel
 */

public interface ClassRosterServiceLayer {
    
    void createStudent(Student student) throws ClassRosterDuplicateIdException,ClassRosterDataValidationException,ClassRosterPersistenceException;
    
    List<Student> getAllStudents() throws ClassRosterPersistenceException;
    
    Student getStudent(String studentId) throws ClassRosterPersistenceException;
    
    Student removeStudent(String studentId) throws ClassRosterPersistenceException;
}
