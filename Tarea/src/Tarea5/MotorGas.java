package Tarea5;

public class MotorGas extends Motor {
    public MotorGas(String modelo) {
        super(modelo);
    }

    @Override
    public void encender(int recurso) {
        if(recurso < 1){
            funcionando = false;
            System.out.println("No hay gasolina");
        }else{
            funcionando = true;
            System.out.println("Motor Gas encendido");
        }
    }


    @Override
    public void apagar() {
        if(funcionando = false){
            System.out.println("El motor Gas ya se encuentra apagado");
        }else {
            System.out.println("Motor Gas apagado");
        }
        funcionando = false;
    }


}
