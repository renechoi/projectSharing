package org.contactManager;

import java.util.Arrays;

public enum EnumCommandReader {
    ADDITION(1) {
        @Override
        public void processCRUD(Manager manager) {
            manager.add();
        }
    },
    PRINT_ALL(2) {
        @Override
        public void processCRUD(Manager manager) {
            manager.printInfoAll();
        }
    },
    PRINT_SPECIFIC(3) {
        @Override
        public void processCRUD(Manager manager) {
            manager.printInfoByName();
        }
    },
    QUIT(4) {
        @Override
        public void processCRUD(Manager manager) {
            manager.quit();
        }
    };

    private final int commandNumber;

    EnumCommandReader(int commandNumber) {
        this.commandNumber = commandNumber;
    }

    public abstract void processCRUD(Manager manager);

    public static void processCRUD(int commandNumberRequested, Manager manager) {
        EnumCommandReader enumCommandReader = Arrays.stream(values())
                .filter(v -> v.commandNumber == commandNumberRequested)
                .findFirst()
                .orElseThrow(() -> new InvalidCommandException(InvalidCommandException.INVALID_COMMAND));

        enumCommandReader.processCRUD(manager);
    }
}
