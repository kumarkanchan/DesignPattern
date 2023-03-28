package DP_singleton;

//Thread Safety
public class LoggerSingleton4 {
    private static volatile LoggerSingleton4 instance = null;

    private LoggerSingleton4() {
        if (instance != null) {
            throw new RuntimeException("Exceptions --");
        }
    }

    public static LoggerSingleton4 getInstance() {
        if (instance == null) {
            synchronized (LoggerSingleton4.class) {
                if (instance == null) {
                    instance = new LoggerSingleton4();
                }
            }
        }
        return instance;
    }
}