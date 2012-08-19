/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.database.impl;

import com.techdhoom.socialstudent.common.database.impl.BaseAbstractGenericDao;
import com.techdhoom.socialstudent.database.StudentDao;
import com.techdhoom.socialstudent.model.Student;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ME
 */
@Repository
public class StudentDaoImpl extends BaseAbstractGenericDao<Student, Long> implements StudentDao {

    @Override
    public Long createStudent(Student student) {
        return super.create(student);
    }
}
