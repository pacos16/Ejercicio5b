import java.io.*;
import java.util.Scanner;

public class Ejercicio5b {
    static Scanner lector= new Scanner(System.in);
    public static void main(String[] args) throws IOException {

        File file = new File("fichero.txt");
        if(file.exists()){
            file.delete();
        }

        RandomAccessFile randomAccessFile=new RandomAccessFile(file,"rw");
        int menu;
        menu = Integer.parseInt(lector.nextLine());
        switch (menu){
            case 1:
               guardarInfoAlumno();
        }
    }


    private static boolean guardarInfoAlumno(){

        System.out.println("Dime el nombre del alumno");
        String nombre= lector.nextLine();

        return true;
    }
}
