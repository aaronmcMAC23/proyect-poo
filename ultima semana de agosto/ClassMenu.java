
import javax.swing.JOptionPane;

public class ClassMenu {
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
}