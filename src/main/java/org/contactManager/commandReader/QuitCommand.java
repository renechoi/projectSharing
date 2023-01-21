package org.contactManager.commandReader;

import org.contactManager.Manager;

public class QuitCommand implements Command {
    @Override
    public boolean support(int userInput) {
        return 4 == userInput;
    }

    @Override
    public void processCRUD(int userInput, Manager manager) {
        manager.quit();
    }
}
