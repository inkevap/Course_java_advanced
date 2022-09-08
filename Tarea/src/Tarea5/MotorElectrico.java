package Tarea5;

public class MotorElectrico extends Motor {

    public MotorElectrico(String modelo) {
        super(modelo);
    }

    @Override
    public void encender(int recurso){
        if(recurso < 20 && recurso > 2){
            System.out.println("Bateria al 20%, necesita carga");
            System.out.println("Motor Electrico arrancado");
            funcionando = true;
        } else if (recurso < 2) {
            System.out.println("Insuficiente carga, requiere carga");
            System.out.println("Motor Electrico NO arrancado");
            funcionando = false;
        }else {
            System.out.println("Motor Electrico arrancado");
            funcionando = true;
        }

    }

    public void apagar(){
        if(funcionando = false){
            System.out.println("El motor ya se encuentra apagado");
        }else {
            System.out.println("Motor Electrico apagado");
        }
        funcionando = false;

    }
}
