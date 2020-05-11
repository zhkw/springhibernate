package com.zkw.stock;

import static org.junit.Assert.assertTrue;

import com.zkw.stock.dao.ContactDao;
import com.zkw.stock.model.Contact;
import org.junit.Test;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void testContact(){
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:app-context.xml");
        ctx.refresh();
        ContactDao contactDao = ctx.getBean("contactDao", ContactDao.class);
        List<Contact> contacts = contactDao.findAll();
        System.out.println("contacts ->"+contacts);
        System.out.println("Listing contacts without details:");
        for (Contact contact: contacts) {
            System.out.println(contact);
        }

    }
}
