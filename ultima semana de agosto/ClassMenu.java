
import javax.swing.JOptionPane;

public class ClassMenu {
    static Planeta pl;
    static Edificio defif;
    static Carrera carrera;
    static Facultad facultades;
    static Automovil autom;
    public static void main(String[] args) {
        menu();

    }

    public static void menu() {
        String opcion = "";
        do{
            opcion = JOptionPane.showInputDialog("1. Crea objetos \n" + "2. Imprimir objetos\n" + "3. Salir");
            switch(opcion){
                case "1":
                    submenu1();
                    break;
                case "2":
                    submenu2();
                    break;
                case "3":
                    JOptionPane.showMessageDialog(null,"Adios !");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción incorrecta carnal :(.");
                    break;
            }
        
        }while(!opcion.equals("3"));
}

public static void submenu1(){
    String opcion2;
    do{
        opcion2 = JOptionPane.showInputDialog("1. Planeta\n" + "2. Atomóvil\n" + "3. Facultad\n" + "4. Edicio\n" + "5. Carrera\n" + "6. Regresar");

        switch(opcion2){
            case "1":
                JOptionPane.showMessageDialog(null,"Creando aobjeto planeta");
                pl = new Planeta();
                llenarPlaneta();
                break;
            case "2":
                JOptionPane.showMessageDialog(null,"Creando objeto automóvil");
                break;
            case "3":
                JOptionPane.showMessageDialog(null,"Creando objeto Facultad");
            break;
            case "4":
                JOptionPane.showMessageDialog(null,"Creando objeto edificio");
                break;
            case "5":
                JOptionPane.showMessageDialog(null,"Creando objeto carrera");
                break;
            case "6":
                JOptionPane.showMessageDialog(null,"Regresando.....");
                break;
            default:
                JOptionPane.showMessageDialog(null,"Opción incorrecta carnal :(.");
            break;
        }
    } while (!opcion2.equals("6"));
}

public static void submenu2(){
    String opcion2;
    do{
        opcion2 = JOptionPane.showInputDialog("1. Planeta\n" + "2. Automóvil\n" + "3. Facultad\n" + "4. Edicio\n" + "5. Carrera\n" + "6. Regresar");
        
        switch(opcion2){
            case "1":
                JOptionPane.showMessageDialog(null,"Imprimiendo objeto planeta");
                break;
            case "2":
                JOptionPane.showMessageDialog(null,"Imprimiendo objeto automóvil");
                break;
            case "3":
                JOptionPane.showMessageDialog(null,"Imprimiendo objeto Facultad");
                break;
            case "4":
                JOptionPane.showMessageDialog(null,"Imprimiendo objeto edificio");
                break;
            case "5":
                JOptionPane.showMessageDialog(null,"Imprimiendo objeto carrera");
                break;
            case "6":
                JOptionPane.showMessageDialog(null,"Regresando.....");
                break;
            default:
                JOptionPane.showMessageDialog(null,"Opción incorrecta carnal :(.");
        }
    }while(!opcion2.equals("6"));
}
public static void llenarPlaneta() {
    String ent = "";
    float n = 0.0f;
    int ni = 0;

    // Solicitar tamaño del planeta
    ent = JOptionPane.showInputDialog("Ingrese el tamaño del planeta: ");
    n = Float.parseFloat(ent);
    pl.setTamaño(n);

    // Solicitar la posición
    ent = JOptionPane.showInputDialog("Ingrese el número de posiciones: ");
    ni = Integer.parseInt(ent);
    pl.setPosicion(new float[ni]);

    // Llenar posiciones del planeta
    for (int i = 0; i < pl.getPosicion().length; i++) {
        ent = JOptionPane.showInputDialog("Ingrese el valor de la posición " + (i + 1) + ": ");
        n = Float.parseFloat(ent);
        pl.getPosicion()[i] = n;
    }

    // Solicitar si tiene atmósfera
    ent = JOptionPane.showInputDialog("¿Tiene atmósfera? (si/no)");
    boolean tieneAtm = ent.equalsIgnoreCase("si");
    pl.setAtmosfera(tieneAtm);

    // Solicitar el color del planeta
    ent = JOptionPane.showInputDialog("Ingrese el color del planeta: ");
    pl.setColor(ent);

    // Solicitar número de anillos
    ent = JOptionPane.showInputDialog("Ingrese el número de anillos del planeta: ");
    ni = Integer.parseInt(ent);
    pl.setNumeroAnillos(ni);

    // Solicitar composición química
    ent = JOptionPane.showInputDialog("Ingrese la composición química del planeta: ");
    pl.setComposicionQuimica(ent);

    // Solicitar campo magnético (opcional)
    ent = JOptionPane.showInputDialog("Ingrese el valor del campo magnético del planeta (deje en blanco si no aplica): ");
    if (ent.isEmpty()) {
        pl.setCampoMagnetico(null);
    } else {
        double campoMagnetico = Double.parseDouble(ent);
        pl.setCampoMagnetico(campoMagnetico);
    }
    // Mostrar mensaje de confirmación
    JOptionPane.showMessageDialog(null, "El planeta ha sido creado exitosamente.");
}

        
public static void llenarCarrera(){
    JOptionPane.showInputDialog("Cual es su titulo:");
}
public static void llenarAutomovil(){

}
public static void llenarEdificio(){

}
public static void llenarFacultad(){

}
} // end class