import java.util.Scanner;
public class SentenciaSwitch {
    public static void main(String[] args){
        Scanner gato = new Scanner(System.in);

        System.out.print("Introuzca un numero de mes:\n");
        int mes = gato.nextInt();

        String nombreMes;
        switch(mes){
            case 1:
                nombreMes = "Enero";
                break;
            case 2:
                nombreMes = "Febrero";
                break;
            case 3:
                nombreMes = "Marzo";
                break;
            case 4: 
                nombreMes = "Abril";
                break;
            case 5: 
                nombreMes = "Mayo";
                break;
            case 6: 
                nombreMes = "Junio";
                break;
            case 7: 
                nombreMes = "Julio";
                break;
            case 8:
                nombreMes = "Agosto";
            case 9:
                nombreMes = "Septiembre";
                break;
            case 10:
                nombreMes = "Octubre";
                break;
            case 11:
                nombreMes = "Noviembre";
                break;
            case 12: 
                nombreMes = "Diciembre";
                break;
            default: // se ejecuta cuando la variable no coincide con ninguno de los valores de case 
            // la sentencia Switch se usa para crear menus
                nombreMes = "No existe ese mes carnal.";
        }
        System.out.println("El mes numero "+mes + " es el mes de: "+nombreMes);
        gato.close();
    }
}
