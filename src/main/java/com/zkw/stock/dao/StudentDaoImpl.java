package com.zkw.stock.dao;

import com.zkw.stock.model.Contact;
import com.zkw.stock.model.Student;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Repository("studentDao")
@Transactional
public class StudentDaoImpl implements StudentDao {

    private SessionFactory sessionFactory;
    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    @Resource(name="sessionFactory")
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    // Other code omitted
    @Transactional(readOnly=true)
    public List<Student> findAll() {
        return sessionFactory.getCurrentSession().
                createQuery("from Student c").list();
    }
}
