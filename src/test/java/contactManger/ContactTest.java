package contactManger;

import org.contactManager.Contact;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatCode;

public class ContactTest {

    @DisplayName("연락처 객체를 생성한다")
    @Test
    void createTest() {
        assertThatCode( () -> new Contact("홍길동", "010-1234-1234", "2002") )
                .doesNotThrowAnyException();
    }
}
