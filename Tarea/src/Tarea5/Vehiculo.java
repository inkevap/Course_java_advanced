package Tarea5;

abstract public class Vehiculo {
    protected String tipo;
    protected String modelo;
    protected Motor motor;

    public Vehiculo(String tipo, String modelo, Motor motor){
        this.motor = motor;
        this.tipo = tipo;
        this.modelo = modelo;
    }

    public abstract void arrancar();
    public abstract void apagar();

    public void avanzar(int km){
        if(motor.estaFuncinando()){
            System.out.println("Avance "+ km +"km.");
        }else {
            System.out.println("El motor esta apagado");
        }
    }
    public void retroceder(int km){
        if(motor.estaFuncinando()){
            System.out.println("retrocedi "+ km +"km.");
        }else {
            System.out.println("El motor esta apagado");
        }
    }

}
