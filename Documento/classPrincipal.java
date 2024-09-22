package Documento;

import javax.swing.JOptionPane;

public class classPrincipal {
    public static void main(String[] args){
        documento doc = new documento();

        doc.setTitulo(JOptionPane.showInputDialog("Ingresa el titulo "));
        doc.setNombreDoc(JOptionPane.showInputDialog("Ingrea el nombre del documento"));
        doc.setContenido(JOptionPane.showInputDialog("Inngresa el contenido"));
        doc.setRuta(JOptionPane.showInputDialog("Ingresa la ruta"));

        doc.CalcularCaracteres();
        doc.CalcularPaginas();
        doc.CalcularParrafos();
        doc.CalcularRenglones();
    }
}

