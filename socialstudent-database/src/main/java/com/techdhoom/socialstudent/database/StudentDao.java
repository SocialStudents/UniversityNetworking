/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.database;

import com.techdhoom.socialstudent.common.database.GenericDao;
import com.techdhoom.socialstudent.model.Student;
import java.io.Serializable;

/**
 *
 * @author ME
 */
public interface StudentDao extends GenericDao<Student, Long> {

    public Long createStudent(Student student);
}
