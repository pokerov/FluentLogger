package org.tasks;

import org.logger.LoggerLogic;
import org.logger.Constants;

public class Task1 extends LoggerLogic {

    public Task1 () {
        execute();
    }

    private void execute() {
        log(Task1.class, Constants.STDERR, "Task1 started working");
    }
}
