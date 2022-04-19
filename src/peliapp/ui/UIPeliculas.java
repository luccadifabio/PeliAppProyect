package peliapp.ui;

import peliapp.modelo.*;
import javax.swing.JOptionPane;

public class UIPeliculas {

    public static void interfazUsuario() {
        ICatalogoPeliculas peliculas = new ImplementacionCatalogoPelicula();
        Pelicula pelicula;
        CERRAR:
        while (true) {
            String opcion = JOptionPane.showInputDialog(
                    null,
                    "1- Insertar pelicula\n"
                    + "2- Listar pelicula\n"
                    + "3- Buscar pelicula\n"
                    + "4- Salir",
                    "Ingrese una opcion:",
                    3
            );
            
            int intOpcion=0;
            try {
                 intOpcion=Integer.parseInt(opcion);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(
                        null,
                        "Las opciones deben ser numeros enteros.\n",
                        "ERROR",
                        JOptionPane.ERROR_MESSAGE);
            }
           
            
            switch(intOpcion){
                case 1:
                    String nombrePelicula = JOptionPane.showInputDialog(
                            null,
                            "Ingrese el nombre de la pelicula: ",
                            "Entrada",
                            3
                    );
                    pelicula =new Pelicula(nombrePelicula);
                    peliculas.insertarPelicula(pelicula);
                    break;
                case 2:
                    peliculas.listarPelicula();
                    break;
                case 3:
                    nombrePelicula = JOptionPane.showInputDialog(
                            null,
                            "Ingrese el nombre de la pelicula: ",
                            "Ingrese",
                            3
                    );
                    peliculas.buscarPelicula(nombrePelicula);
                    break;
                case 4:
                    break CERRAR;
                default:
                    JOptionPane.showMessageDialog(
                null,
                "OPCION INCORRECTA\n"
                +"ELIGE DEL 1 AL 4\n", 
                "ERROR",
                JOptionPane.ERROR_MESSAGE
                    );
                    
                    
            }

        }
    }
}
