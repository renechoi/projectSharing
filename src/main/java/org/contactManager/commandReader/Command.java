package org.contactManager.commandReader;

import org.contactManager.Manager;

public interface Command {
    boolean support(int userInput);

    void processCRUD(int userInput, Manager manager);
}
