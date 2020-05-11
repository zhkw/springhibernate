package com.zkw.stock.dao;

import com.zkw.stock.model.Contact;

import java.util.List;

public interface ContactDao {
    // Find all contacts
    public List<Contact> findAll();

//// Find a contact with details by id
//    public Contact findById(Long id);
//    // Insert or update a contact
//    public Contact save(Contact contact);
//    // Delete a contact
//    public void delete(Contact contact);
}
