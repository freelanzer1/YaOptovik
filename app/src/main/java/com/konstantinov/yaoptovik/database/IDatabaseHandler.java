package com.konstantinov.yaoptovik.database;

import com.konstantinov.yaoptovik.database.Contact;

import java.util.List;

public interface IDatabaseHandler {
    public  void addContact(Contact contact); // позволяет сохранять в базу данных новые компании;
    Contact getContact(int id); // позволяет получить контакты по id (ИНН);
    public List getAllContacts(); // позволяет получить все контакты с БД;
    public int getContactsCount(); // позволяет получить количество контактов находящиеся в БД;
    public int updateContact(Contact contact); // позволяет обновить контакт;
    public void deleteContact(Contact contact);// позволяет удалить контакт;
    public  void deleteAll(); // позволяет удалить все контакты.
}
