package org.contactManager;

import java.util.Scanner;

public class InputView {

    public static final String PHONE_NUMBER_REGEX = "(01\\d)-(\\d{3,4})-(\\d{4})";
    private static Scanner scanner = new Scanner(System.in);

    // TODO : transfer print function to outputView

    private enum ConsoleMessage {
        REQUEST_GENERAL_COMMAND("\n명령을 입력하세요(1.추가 2.전체 조회 3.검색 4.수정 5.삭제 6.정렬 7.파일저장 8.파일불러오기 9.종료): "),
        REQUEST_SORT_COMMAND("\n정렬 기준을 어떻게 할까요?(1.타입 2.이름 3.전화번호 4.생년월일): "),
        REQUEST_NAME_WITH_OPTIONAL("%s 이름을 입력하세요: "),
        REQUEST_NAME("이름을 입력하세요: "),
        REQUEST_NUMBER("전화번호를 입력하세요(010-XXXX-XXXX): "),
        REQUEST_DOB_YEAR("생년월일을 차례로 입력하세요(년): "),
        REQUEST_DOB_MONTH("생년월일을 차례로 입력하세요(월): "),
        REQUEST_DOB_DATE("생년월일을 차례로 입력하세요(일): "),
        REQUEST_TYPE("타입을 입력하세요(일반, 동창, 직장): "),
        REQUEST_MAJOR("전공을 입력하세요: "),
        REQUEST_STUDENT_ID("학번을 입력하세요: ");

        private final String message;

        ConsoleMessage(String message) {
            this.message = message;
        }
    }

    public InputView() {
        scanner = new Scanner(System.in);
    }

    public static int getGeneralCommand() {
        System.out.print(ConsoleMessage.REQUEST_GENERAL_COMMAND.message);
        return validateNumber(scanner.nextLine());
    }

    public static int getSortCommand() {
        System.out.print(ConsoleMessage.REQUEST_SORT_COMMAND.message);
        return validateNumber(scanner.nextLine());
    }

    public static  String getName(String optionalMessage) {
        System.out.printf(ConsoleMessage.REQUEST_NAME_WITH_OPTIONAL.message, optionalMessage);
        return scanner.nextLine();
    }

    public static  String getName() {
        System.out.print(ConsoleMessage.REQUEST_NAME.message);
        return scanner.nextLine();
    }

    public static String getPhoneNumber() {
        System.out.print(ConsoleMessage.REQUEST_NUMBER.message);
        return validatePhoneNumber(scanner.nextLine());
    }

    public static int getDobYear() {
        System.out.print(ConsoleMessage.REQUEST_DOB_YEAR.message);
        return validateNumber(scanner.nextLine());
    }

    public static int getDobMonth() {
        System.out.print(ConsoleMessage.REQUEST_DOB_MONTH.message);
        return validateNumber(scanner.nextLine());
    }

    public static int getDobDate() {
        System.out.print(ConsoleMessage.REQUEST_DOB_DATE.message);
        return validateNumber(scanner.nextLine());
    }

    public static String getType() {
        System.out.print(ConsoleMessage.REQUEST_TYPE.message);
        return scanner.nextLine();
    }

    public static String getMajor() {
        System.out.print(ConsoleMessage.REQUEST_MAJOR.message);
        return scanner.nextLine();
    }

    public static String getStudentId() {
        System.out.print(ConsoleMessage.REQUEST_STUDENT_ID.message);
        return scanner.nextLine();
    }

    public static int validateNumber(String userInput) {
        try {
            return Integer.parseInt(userInput);
        } catch (NumberFormatException e) {
            throw new InvalidNumberInputException(InvalidNumberInputException.INVALID_COMMAND);
        }
    }

    public static String validatePhoneNumber(String phoneNumber){
        if (phoneNumber.matches(PHONE_NUMBER_REGEX)){
            return phoneNumber;
        }
        throw new InvalidNumberInputException(InvalidNumberInputException.INVALID_PHONE_NUMBER_EXCEPTION);
    }
}

