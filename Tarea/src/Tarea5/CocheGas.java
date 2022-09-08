package Tarea5;

public class CocheGas extends Vehiculo{
    protected int gasolina;
    public CocheGas(String tipo, String modelo, MotorGas motor) {
        super(tipo, modelo,motor);
        gasolina = 20;
    }
    @Override
    public void arrancar(){
        motor.encender(gasolina);
    }
    @Override
    public void apagar(){
        motor.apagar();
    }
}
