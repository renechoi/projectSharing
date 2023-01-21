package contactManger;

import camp.nextstep.edu.missionutils.test.NsTest;
import org.contactManager.Main;
import org.junit.jupiter.api.Test;

import static camp.nextstep.edu.missionutils.test.Assertions.assertSimpleTest;

import static org.assertj.core.api.Assertions.*;

public class MainTest extends NsTest {

    @Test
    void MainTest() {
        assertSimpleTest(() -> {
            run("1", "홍길동", "010-1234-1234", "2000",
                    "1", "김길동", "010-2234-2234", "1995",
                    "2",
                    "3", "홍길동",
                    "4");
            assertThat(output()).contains(
                    """
                            <전화번호부>
                            이름: 홍길동
                            전화번호: 010-1234-1234
                            생년월일: 2000
                                    """
            );
        });
    }

    @Override
    protected void runMain() {
        try {
            Main.main(new String[]{});
        } catch (Exception ignored) {
        }

    }
}
