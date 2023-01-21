package org.contactManager;

import org.contactManager.commandReader.AddCommand;
import org.contactManager.commandReader.PrintAllCommand;
import org.contactManager.commandReader.PrintSpecificCommand;
import org.contactManager.commandReader.QuitCommand;

public class Main {
    //1. 해당 클래스 구현해서 객체를 생성 사용해보자
    //2. 키보드로 부터 메뉴를 입력 받아 케이스 선택하도록 (1.추가 2.전체조회 3.특정조회 4.종료)
    //3. Manager 클래스를 생성해서 각각의 기능(1, 2)을 구현하도록 하자 -> 키보드로부터 이름, 전화번호, 생년월일 입력
    //4. 검색 기능 구현
    //5. 수정, 삭제 구현
    //6. 정렬 구현


    public static void main(String[] args) {

        Manager manager = new Manager();

        while(true){

            int userInput = InputView.getGeneralCommand();
            if (userInput==4){
                break;
            }

            CommandReader commandReader = new CommandReader(
                    new AddCommand(),
                    new PrintAllCommand(),
                    new PrintSpecificCommand(),
                    new QuitCommand());

            commandReader.executeCommand(userInput, manager);

        }
    }
}