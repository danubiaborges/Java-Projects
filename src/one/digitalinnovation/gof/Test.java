package one.digitalinnovation.gof;

public class Test {

    public static void main(String[] args) {

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println("\n" + eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
        System.out.println("\n" + holder);
        holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);
        
    }

}
