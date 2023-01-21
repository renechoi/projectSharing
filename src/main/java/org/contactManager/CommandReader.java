package org.contactManager;

import org.contactManager.commandReader.Command;

import java.util.ArrayList;
import java.util.List;

public class CommandReader {

    List<Command> commands = new ArrayList<>();

    public CommandReader(Command... commands) {
        this.commands.addAll(List.of(commands));
    }

    public void executeCommand(int userInput, Manager manager) {
        Command command = commands.stream()
                .filter(c -> c.support(userInput))
                .findFirst()
                .orElseThrow(() -> new InvalidCommandException(InvalidCommandException.INVALID_COMMAND));

        command.processCRUD(userInput, manager);
    }
}
