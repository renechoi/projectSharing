package org.contactManager;

public class InvalidCommandException extends IllegalArgumentException {

    public static final String INVALID_COMMAND= "입력값이 잘못되었습니다. 정확한 숫자를 입력하세요";

    public InvalidCommandException(String s){
        super(s);
    }
}
