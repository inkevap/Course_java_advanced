package Tarea5;

public class main {
    public static void main(String[] args) {
        Vehiculo Tesla = new CocheElectrico("Clasico", "2020",new MotorElectrico("TXL") );
        Tesla.retroceder(5);
        Tesla.arrancar();
        Tesla.avanzar(100);

        Tesla = new CocheGas("Clasico", "2020",new MotorGas("TXL") );
        Tesla.retroceder(5);
        Tesla.arrancar();
        Tesla.avanzar(100);


    }
}
