package Tarea5;

public class CocheElectrico extends Vehiculo{
    protected int bateria;
    public CocheElectrico(String tipo, String modelo, MotorElectrico motor) {
        super(tipo, modelo,motor);
        bateria = 100;
    }
    @Override
    public void arrancar(){
        motor.encender(bateria);
    }
    @Override
    public void apagar(){
        motor.apagar();
    }
}
