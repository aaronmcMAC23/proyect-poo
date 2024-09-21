
import java.util.ArrayList;

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
                autom = new Automovil();
                llenarAutomovil();
                break;
            case "3":
                JOptionPane.showMessageDialog(null,"Creando objeto Facultad");
                facultades = new Facultad();
                llenarFacultad();
            break;
            case "4":
                JOptionPane.showMessageDialog(null,"Creando objeto edificio");
                defif = new Edificio();
                llenarEdificio();
                break;
            case "5":
                JOptionPane.showMessageDialog(null,"Creando objeto carrera");
                carrera = new Carrera();
                llenarCarrera();
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

    // solicicta la orbita 
    ent = JOptionPane.showInputDialog("Ingrese la orbita del planeta: ");
    pl.setOrbita(ent);

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
    JOptionPane.showMessageDialog(null, "El planeta ha sido creado exitosamente :).");

    JOptionPane.showMessageDialog(null, pl.mostrarInfo(), "Tierra", 1);
}


public static void llenarCarrera(){
    String carr = "";
    int materias = 0;
    carr = JOptionPane.showInputDialog("Cual es tu carrera carnal: \n");
    carrera.setTitulo(carr);
    carr = JOptionPane.showInputDialog("¿Cuántas materias hay en tu carrera?: \n");
    materias = Integer.parseInt(carr);
    
    // Inicializar el arreglo de materias en la carrera
    carrera.setMaterias(new String[materias]);
    
    // Bucle para llenar las materias
    for (int i = 0; i < carrera.getMaterias().length; i++) {
        carr = JOptionPane.showInputDialog("Ingrese el nombre de la materia " + (i + 1) + ": \n");
        carrera.getMaterias()[i] = carr; // Asignar cada materia en el arreglo
    }
    //area de la carrera
    carr = JOptionPane.showInputDialog("¿Cuál es el área de la carrera?");
    carrera.setArea(Integer.parseInt(carr));

    // Solicitar el número del plan de estudios
    carr = JOptionPane.showInputDialog("Ingrese el número de tu plan de estudios:");
    carrera.setClavesPlanes(Integer.parseInt(carr));

    // Solicitar especialidades
    carr = JOptionPane.showInputDialog("Ingrese las especialidades de la carrera (separadas por comas):");
    carrera.setEspecialidades(carr);

    // Solicitar requisitos de ingreso
    int numRequisitos = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos requisitos de ingreso tiene la carrera?"));
    carrera.setRequisitosIngreso(new String[numRequisitos]);

    for (int i = 0; i < numRequisitos; i++) {
        carr = JOptionPane.showInputDialog("Ingrese el requisito de ingreso " + (i + 1) + ": ");
        carrera.getRequisitosIngreso()[i] = carr;
    }

    // Solicitar opciones de titulación
    int numOpciones = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántas opciones de titulación tiene la carrera?"));
    carrera.setOpcionesTitulacion(new String[numOpciones]);

    for (int i = 0; i < numOpciones; i++) {
        carr = JOptionPane.showInputDialog("Ingrese la opción de titulación " + (i + 1) + ": ");
        carrera.getOpcionesTitulacion()[i] = carr;
    }

    // Solicitar la duración de la carrera
    carr = JOptionPane.showInputDialog("¿Cuál es la duración de la carrera (en años)?");
    carrera.setDuracion(Integer.parseInt(carr));

    // Mostrar mensaje de confirmación
    JOptionPane.showMessageDialog(null, "La carrera ha sido creada exitosamente :).");
    JOptionPane.showMessageDialog(null, carrera.mostrarInfoC(), "Carrera", 1);
}
    
public static void llenarAutomovil(){
    String auto = "";
    float precioAuto = 0;

    // Solicitar el tamaño del automóvil
    auto = JOptionPane.showInputDialog("¿Cuál es el tamaño del automóvil?: \n");
    autom.setTamanio(auto);

    // Solicitar la condición del automóvil
    auto = JOptionPane.showInputDialog("¿Cuál es la condición del automóvil (Nuevo/Usado)?: \n");
    autom.setCondicion(auto);

    // Solicitar el precio del automóvil
    auto = JOptionPane.showInputDialog("¿Cuál es el precio del automóvil?: \n");
    precioAuto = Float.parseFloat(auto);
    autom.setPrecio(precioAuto);

    // Solicitar el color del automóvil
    auto = JOptionPane.showInputDialog("¿Cuál es el color del automóvil?: \n");
    autom.setColor(auto);

    // Solicitar la apariencia del automóvil (del 1 al 10)
    auto = JOptionPane.showInputDialog("Califique la apariencia del automóvil del 1 al 10: \n");
    autom.setApariencia(Integer.parseInt(auto));

    // Solicitar la marca del automóvil
    auto = JOptionPane.showInputDialog("¿Cuál es la marca del automóvil?: \n");
    autom.setMarca(auto);

    // Solicitar la tracción del automóvil
    auto = JOptionPane.showInputDialog("¿Cuál es el tipo de tracción del automóvil (FWD, RWD, AWD)?: \n");
    autom.setTraccion(auto);

    // Solicitar el modelo del automóvil
    auto = JOptionPane.showInputDialog("¿Cuál es el modelo del automóvil?: \n");
    autom.setModelo(auto);

    // Mostrar mensaje de confirmación
    JOptionPane.showMessageDialog(null, "El automóvil ha sido creado exitosamente.");
    JOptionPane.showMessageDialog(null, autom.mostrarinfoA(), "Automóvil", 1);

}
public static void llenarEdificio(){
    String input = "";
    
    // Materiales
    input = JOptionPane.showInputDialog("Ingrese los materiales del edificio:");
    defif.setMateriales(input);
    
    // Número de pisos
    input = JOptionPane.showInputDialog("¿Cuántos pisos tiene el edificio?");
    defif.setNoPisos(Integer.parseInt(input));
    
    // Colores
    int numColores = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos colores tiene el edificio?"));
    defif.setColores(new String[numColores]);
    for (int i = 0; i < numColores; i++) {
        input = JOptionPane.showInputDialog("Ingrese el color " + (i + 1) + ":");
        defif.getColores()[i] = input;
    }
    
    // Ubicación
    input = JOptionPane.showInputDialog("¿Cuál es la ubicación del edificio?");
    defif.setUbicacion(input);
    
    // Diseño
    input = JOptionPane.showInputDialog("Ingrese el diseño del edificio:");
    defif.setDiseño(input);
    
    // Estilo
    input = JOptionPane.showInputDialog("Ingrese el estilo del edificio:");
    defif.setEstilo(input);
    
    // Uso
    input = JOptionPane.showInputDialog("¿Cuál es el uso del edificio?");
    defif.setUso(input);
    
    // Antigüedad
    input = JOptionPane.showInputDialog("Ingrese la antigüedad del edificio (en años):");
    defif.setAntiguedad(Integer.parseInt(input));
    
    // Estado de la obra
    input = JOptionPane.showInputDialog("¿Cuál es el estado de la obra?");
    defif.setEstadoObra(input);
    
    // Confirmación
    JOptionPane.showMessageDialog(null, "El edificio ha sido creado exitosamente.");
    JOptionPane.showMessageDialog(null, defif.mostrarInfoE(), "Edificio", 1);
}
public static void llenarFacultad(){
    String input = "";

    // Carreras
    input = JOptionPane.showInputDialog("Ingrese las carreras que ofrece la facultad:");
    facultades.setCarreras(input);

    // Ubicación
    input = JOptionPane.showInputDialog("Ingrese la ubicación de la facultad:");
    facultades.setUbicacion(input);

    // Afiliación
    input = JOptionPane.showInputDialog("Ingrese la afiliación de la facultad:");
    facultades.setAfiliacion(input);

    // Número de estudiantes
    input = JOptionPane.showInputDialog("Ingrese el número de estudiantes en la facultad:");
    facultades.setNoEstudiantes(Integer.parseInt(input));

    // Número de edificios
    input = JOptionPane.showInputDialog("Ingrese el número de edificios en la facultad:");
    facultades.setNoEdificios(Integer.parseInt(input));

    // Año de inauguración
    input = JOptionPane.showInputDialog("Ingrese el año de inauguración de la facultad:");
    facultades.setAnioInaguracion(Integer.parseInt(input));

    // Área del terreno
    input = JOptionPane.showInputDialog("Ingrese el área del terreno de la facultad (en hectáreas):");
    facultades.setAreaTerreno(Float.parseFloat(input));

    // Confirmación
    JOptionPane.showMessageDialog(null, "La facultad ha sido creada exitosamente.");
    JOptionPane.showMessageDialog(null, facultades.mostrarInfoF(), "Facultad", 1);
}
} // end class