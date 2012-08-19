/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techdhoom.socialstudent.database.impl;

import com.techdhoom.socialstudent.common.database.impl.BaseAbstractGenericDao;
import com.techdhoom.socialstudent.database.StudentContactDao;
import com.techdhoom.socialstudent.model.StudentContact;
import java.io.Serializable;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ME
 */
@Repository
public class StudentContactDaoImpl extends BaseAbstractGenericDao<StudentContact,Long> implements StudentContactDao {

    @Override
    public Long createStudentContact(StudentContact studentContact) {
        return super.create(studentContact);
    }
    
}
