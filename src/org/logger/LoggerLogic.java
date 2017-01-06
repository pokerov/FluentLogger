package org.logger;

public abstract class LoggerLogic<T extends LoggerLogic> implements Logger {

    public T log(Class clazz, Constants type, String message) {
        if ( type == Constants.STDERR ) {
            System.err.println(delimiter() + "\n"
                               + "Class name and method: " + Thread.currentThread().getStackTrace()[2] + "\n"
                               + "Message: " + message + "\n"
                               + delimiter());
        }
        return (T) this;
    }

    private String delimiter() {
        return "*************";
    }

}
