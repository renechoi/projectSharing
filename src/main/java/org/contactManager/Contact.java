package org.contactManager;

public class Contact {
    private String name;
    private String phoneNumber;
    private String birth;

    public Contact(String name, String phoneNumber, String birth) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birth = birth;
    }

    public boolean matches(String nameRequested) {
        return this.name.equals(nameRequested);
    }

    public void show() {
        System.out.printf(String.format("""
                <전화번호부>
                이름: %s 
                전화번호: %s 
                생년월일: %s
                        """, name, phoneNumber, birth)
        );
    }

    public String getName() {
        return name;
    }
}
