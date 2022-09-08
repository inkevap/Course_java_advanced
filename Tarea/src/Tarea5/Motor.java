package Tarea5;

abstract public class Motor {
    private final String modelo;
    protected Boolean funcionando = false;

    public Motor(String modelo){
        this.modelo = modelo;
    }

    public abstract void encender(int recurso);
    public abstract void apagar();

    public String getModelo(){
        return modelo;
    }

    public Boolean estaFuncinando(){
        return funcionando;
    }

}
