package org.contactManager;

public class InvalidNumberInputException extends IllegalArgumentException{
    public static final String INVALID_COMMAND= "입력값이 잘못되었습니다. 숫자만 입력하세요";
    public static final String INVALID_PHONE_NUMBER_EXCEPTION= "전화번호 형식을 지켜서 입력해주세요!";

    public InvalidNumberInputException(String message){
        super(message);
    }
}
