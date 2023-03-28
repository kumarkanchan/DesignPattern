package DP_singleton;

//Thread Safety
public class LoggerSingleton3 {
    private static volatile LoggerSingleton3 instance = null;

    private LoggerSingleton3() {
        if (instance != null) {
            throw new RuntimeException("Exceptions --");
        }
    }
    public static LoggerSingleton3 getInstance() {
        if (instance == null) {
            instance = new LoggerSingleton3();
        }
        return instance;
    }
}