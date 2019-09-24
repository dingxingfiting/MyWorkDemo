package computerTest.singleton;

//静态内部类单例模式
public class StaticSingleton {
    private StaticSingleton() {
    }

    private static class SingletonHolder {
        private static StaticSingleton INSTANCE = new StaticSingleton();
    }

    public static StaticSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

}