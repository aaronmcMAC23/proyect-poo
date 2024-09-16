import javax.swing.*;

public class PruebaPlaneta {
    public static void main(String[] args) {
        double tamañoTierra;
        Double[] posicionTierra = null;
        int numPosiciones;
        double valorPosicion;
        String orbitaTierra;
        String colorTierra;
        int numeroAnillosTierra;
        String composicionQuimicaTierra;
        int atmosferaTierra;
        Double campoMagneticoTierra;
        Planeta tierra = new Planeta();

        JOptionPane.showMessageDialog(null, "Ingrese los datos solicitados para el planeta Tierra.");
        
        // Tamaño de la Tierra
        tamañoTierra = Double.parseDouble(JOptionPane.showInputDialog(null, "Tamaño:"));
        tierra.setTamaño(tamañoTierra);

        // Posición de la Tierra
        numPosiciones = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el número de posiciones:"));
        tierra.setPosicion(new float[numPosiciones]);

        for(int i = 0; i < tierra.getPosicion().length; i++) {
            valorPosicion = Float.parseFloat(JOptionPane.showInputDialog(null,"Valor de la posición " + (i+1) + ": "));
            tierra.getPosicion()[i] = 0;
        }

        // Órbita de la Tierra
        orbitaTierra = JOptionPane.showInputDialog("Tipo de órbita:");
        tierra.setOrbita(orbitaTierra);

        // Color de la Tierra
        colorTierra = JOptionPane.showInputDialog("Color:");
        tierra.setColor(colorTierra);

        // Número de anillos de la Tierra
        numeroAnillosTierra = Integer.parseInt(JOptionPane.showInputDialog(null, "Número de anillos:"));
        tierra.setNumeroAnillos(numeroAnillosTierra);

        // Composición química de la Tierra
        composicionQuimicaTierra = JOptionPane.showInputDialog(null, "Composición química:");
        tierra.setComposicionQuimica(composicionQuimicaTierra);

        // Atmósfera de la Tierra
        atmosferaTierra = Integer.parseInt(JOptionPane.showInputDialog(null, "Tiene atmósfera\n0)No 1)Sí:"));
        tierra.setAtmosfera(atmosferaTierra);

        // Campo magnético de la Tierra
        campoMagneticoTierra = Double.parseDouble(JOptionPane.showInputDialog(null, "Campo magnético:"));
        tierra.setCampoMagnetico(campoMagneticoTierra);

        JOptionPane.showMessageDialog(null, tierra.mostrarInfo(), "Tierra", 1);
    }
}
