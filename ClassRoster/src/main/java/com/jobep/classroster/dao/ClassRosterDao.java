/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jobep.classroster.dao;

/**
 *
 * @author powel
 */
import com.jobep.classroster.dto.Student;
import java.util.List;

public interface ClassRosterDao {
    Student addStudent(String studentId, Student student);
    
    List<Student> getAllStudents();
    
    Student getStudent(String studentId);
    
    Student removeStudent(String studentId);
    
}
