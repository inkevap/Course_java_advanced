package Tarea3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class ExceptionLauncher {
    private static final ArrayList<Integer> array = new ArrayList<Integer>();

    public static int divisionByZero(int valorA) throws ArithmeticException{
        return valorA/0;
    }

    public static void arrayOutOfBounds() throws IndexOutOfBoundsException{
        for(int i = 0; i < 6;i++){
            array.add(i);
        }
        array.get(9);
    }

    public static FileInputStream openFile(String filepath) throws FileNotFoundException {
        return new FileInputStream(filepath);
    }
}
