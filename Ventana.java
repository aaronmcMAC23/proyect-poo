

import javax.swing.JFrame;
public class Ventana extends JFrame{
    public Ventana(){ // costructor
        this.setSize(500, 500); //ancho, largo Tamaño de la ventana estabece su tamaño
        setDefaultCloseOperation(EXIT_ON_CLOSE); // despues de cerrrar nuestra ventana el progrma deja de ejecutarse
        setTitle("El mejor titulo"); //establecer titulo de la ventana
    }
    
}
