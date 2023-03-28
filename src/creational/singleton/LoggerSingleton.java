package DP_singleton;

//Basic Singleton
public class LoggerSingleton {
    private static LoggerSingleton instance = new LoggerSingleton();

    private LoggerSingleton() {
    }

    public static LoggerSingleton getInstance() {
        return instance;
    }
}
