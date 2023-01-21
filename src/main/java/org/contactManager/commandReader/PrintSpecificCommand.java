package org.contactManager.commandReader;

import org.contactManager.Manager;

public class PrintSpecificCommand implements Command {
    @Override
    public boolean support(int userInput) {
        return 3 == userInput;
    }

    @Override
    public void processCRUD(int userInput, Manager manager) {
        manager.printInfoByName();
    }
}
