package DP_singleton;

// Lazy loading Singleton
public class LoggerSingleton2 {
    private static LoggerSingleton2 instance = null;

    private LoggerSingleton2() {
    }

    public static LoggerSingleton2 getInstance() {
        if (instance == null) {
            instance = new LoggerSingleton2();
        }
        return instance;
    }
}
