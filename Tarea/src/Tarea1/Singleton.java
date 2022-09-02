package Tarea1;

public class Singleton {
    String text;
    private static Singleton singleton;
    private Singleton(String text){
        this.text = text;
    }

    public static Singleton getInstance(String text){
        if (singleton == null) {
            singleton = new Singleton(text);
            return singleton;
        }else{
            return singleton;
        }
    }

    public void AmIEqualTo(Singleton singleton){
        if(singleton == Singleton.singleton){
            System.out.println("La instancia es la misma");
        }else {
            System.out.println("La instancia es nueva");
        }
    }
}

