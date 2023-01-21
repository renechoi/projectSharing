package org.contactManager.commandReader;

import org.contactManager.Manager;

public class PrintAllCommand implements Command {
    @Override
    public boolean support(int userInput) {
        return 2 == userInput;
    }

    @Override
    public void processCRUD(int userInput, Manager manager) {
        manager.printInfoAll();
    }
}
