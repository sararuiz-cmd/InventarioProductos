package Main;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Product {
    public static void main(String[] args) {
        int opcion=0;
        String producto="";
        String respuesta="";
        List<String>Inventario=new ArrayList<>();
        do {
            while (true){
                try{
                    opcion=Integer.parseInt(JOptionPane.showInputDialog("Menú de opciones\n" +
                            "1. Ingresar producto\n" +
                            "2. Ver valor del inventario\n" +
                            "3. Ver valor acumulado del inventario\n" +
                            "4. Salir"));
                    switch (opcion){
                        case 1:
                            while (respuesta.toLowerCase()=="si"||respuesta.toLowerCase()=="sí"){
                                producto=JOptionPane.showInputDialog("Ingrese el nombre de un producto: ");
                                respuesta=JOptionPane.showInputDialog("Desea continuar agregando? ");
                                if (respuesta.toLowerCase()=="no"){
                                    break;
                                }
                            }
                    }
                }catch (NumberFormatException e){
                    JOptionPane.showMessageDialog(null,"Solo numeros");
                }
            }
        }while (opcion!=4);
    }
}
