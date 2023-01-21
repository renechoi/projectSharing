package contactManger;

import org.contactManager.Contact;
import org.contactManager.Manager;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThatCode;

public class ManagerTest {

    @DisplayName("매니저 객체의 contacts 생성을 확인한다")
    @Test
    void createTest() {
        assertThatCode(()->new Manager(Arrays.asList(
                new Contact("홍길동", "010-1234-1234", "2002"),
                new Contact("김길동", "010-1234-1234", "2000")
        ))).doesNotThrowAnyException();
    }

//    @Test
//    void validate_add() {
//        Manager manager = new Manager();
//
//        String name = "홍길동";
//        String phoneNumber = "1234";
//        String birth = "1234";
//        manager.add();
//        List<Contact> contacts = manager.getContacts();
//
//        assertThatCode(()->contacts.stream().filter(contact -> contact.getName().equals("홍길동"))
//                .findFirst().get()).doesNotThrowAnyException();
//
//    }


}
