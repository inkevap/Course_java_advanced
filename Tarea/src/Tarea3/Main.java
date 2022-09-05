package Tarea3;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        try{
           int val = ExceptionLauncher.divisionByZero(4);
        }catch(ArithmeticException e){
            System.out.println("Se ha obtenido un error aritmetico: " + e.getLocalizedMessage());
        }

        try{
            ExceptionLauncher.arrayOutOfBounds();
        }catch (IndexOutOfBoundsException e){
            System.out.println("Se ha obtenido error de indice en array: " + e.getLocalizedMessage());
        }

        try{
            InputStream file = ExceptionLauncher.openFile("/text.txt");
            file.close();
        }catch (FileNotFoundException e){
            System.out.println("Se ha obtenido error abriendo archivo: " + e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
