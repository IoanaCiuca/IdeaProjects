public class Singleton {

    private static Singleton instance = null;

    public static Singleton getInstance(){
        if(instance==null)
            instance = new Singleton();

        return instance;

    }

    private Singleton(){
        System.out.println("s-a creat");
    }

    public void afisare(String text){
        System.out.println(text);
    }
}
