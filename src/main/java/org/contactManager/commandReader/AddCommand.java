package org.contactManager.commandReader;

import org.contactManager.Manager;

public class AddCommand implements Command {
    @Override
    public boolean support(int userInput) {
        return 1 == userInput;
    }

    @Override
    public void processCRUD(int userInput, Manager manager) {
        manager.add();
    }
}
