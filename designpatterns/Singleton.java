package designpatterns;

public class Singleton {

    private final String data;

    private static volatile Singleton instance;

    private Singleton(String data) {
        this.data = data;
    }

    public static Singleton getInstance(String data) {
        Singleton result = instance;
        if (result == null) {
            synchronized (Singleton.class) {
                result = instance;
                if (result == null) {
                    instance = result = new Singleton(data);
                }
            }
        }
        return result;
    }

    public String getData() {
        return data;
    }

    public static class Main {
        public static void main(String[] args) {
            System.out.println(getInstance("Geekific"));
            Singleton singleton = getInstance("Singleton");
            System.out.println(singleton);
            System.out.println(singleton.getData());
        }
    }
}