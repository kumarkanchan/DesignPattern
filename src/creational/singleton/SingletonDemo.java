package DP_singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        System.out.println("SINGLETON 1 : BASIC SINGLETON :");
        LoggerSingleton loggerSingleton = LoggerSingleton.getInstance();
        System.out.println("Singleton Object-1  " + loggerSingleton);

        LoggerSingleton loggerSingleton2 = LoggerSingleton.getInstance();
        System.out.println("Singleton Object-2  " + loggerSingleton2);
        System.out.println(loggerSingleton2 == loggerSingleton);

        System.out.println("SINGLETON 3 : LAZY LOADING SINGLETON");
        LoggerSingleton2 loggerSingleton11 = LoggerSingleton2.getInstance();
        System.out.println("Singleton2 Object-1  " + loggerSingleton);

        LoggerSingleton2 loggerSingleton22 = LoggerSingleton2.getInstance();
        System.out.println("Singleton2 Object-2  " + loggerSingleton2);
        System.out.println(loggerSingleton22 == loggerSingleton11);

        System.out.println("SINGLETON 3 : THREAD SAFETY SINGLETON Using null check in private constructor to avoid from reflection API");
        LoggerSingleton3 loggerSingleton31 = LoggerSingleton3.getInstance();
        System.out.println("Singleton2 Object-1  " + loggerSingleton31);

        LoggerSingleton3 loggerSingleton32 = LoggerSingleton3.getInstance();
        System.out.println("Singleton2 Object-2  " + loggerSingleton32);
        System.out.println(loggerSingleton31 == loggerSingleton32);

        System.out.println("SINGLETON 4 : THREAD SAFETY SINGLETON Using double null check and used synchronized");
        LoggerSingleton4 loggerSingleton4 = LoggerSingleton4.getInstance();
        System.out.println("Singleton4 Object-1  " + loggerSingleton4);

        LoggerSingleton4 loggerSingleton41 = LoggerSingleton4.getInstance();
        System.out.println("Singleton4 Object-2  " + loggerSingleton41);
        System.out.println(loggerSingleton4 == loggerSingleton41);
    }
}
