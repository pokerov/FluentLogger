package org;

import org.logger.Constants;
import org.tasks.Task1;

public class Test {

    public static void main(String[] args) {
        new Task1();
        new Task1().log(Test.class, Constants.STDERR, "Pre-constructor invocation");
    }
}
