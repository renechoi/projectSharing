package org.contactManager;

import java.util.ArrayList;
import java.util.List;

public class Manager {

    List<Contact> contacts = new ArrayList<>();

    public Manager() {
    }

    public Manager(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public void add() {
        String name = InputView.getName();
        String phoneNumber = InputView.getPhoneNumber();
        String birth = String.valueOf(InputView.getDobYear());

        contacts.add(new Contact(name,phoneNumber,birth));
        System.out.println("추가되었습니다");
    }

    public void printInfoAll() {
        contacts.forEach(Contact::show);
    }

    public void printInfoByName() {
        String nameRequested = InputView.getName("검색할");

        contacts.stream()
                .filter(contact-> contact.getName().equals(nameRequested))
                .findFirst()
                .orElseThrow(()->new IllegalArgumentException("찾는 이름이 없습니다!"))
                .show();
    }

    public void quit() {
    }

    public List<Contact> getContacts() {
        return contacts;
    }
}
