package com.zkw.stock.dao;

import com.zkw.stock.model.Contact;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

// Import statements omitted
@Repository("contactDao")
@Transactional
public class ContactDaoImpl implements ContactDao {
    // Other code omitted
    //private Log log = LogFactory.getLog(ContactDaoImpl.class);
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
    public List<Contact> findAll() {
        return sessionFactory.getCurrentSession().
                createQuery("from Contact c").list();
    }
}
