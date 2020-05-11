package com.zkw.stock;

import static org.junit.Assert.assertTrue;

import com.zkw.stock.dao.ContactDao;
import com.zkw.stock.model.Contact;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    public static Log log= LogFactory.getLog(AppTest.class);

    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void testContact(){
//        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
//        ctx.load("classpath:app-context.xml");
//        ctx.refresh();

        ApplicationContext ctx = new ClassPathXmlApplicationContext("app-context.xml");

        ContactDao contactDao = ctx.getBean("contactDao", ContactDao.class);
        List<Contact> contacts = contactDao.findAll();

        log.info("this is log->"+contacts);

        System.out.println("contacts ->"+contacts);
        System.out.println("Listing contacts without details:");
        for (Contact contact: contacts) {
            System.out.println(contact);
        }

    }
}
