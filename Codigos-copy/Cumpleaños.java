import java.util.Date;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.text.ParseException;

public class Cumpleaños
{
    public static void main(String [] args){
        Date fechaNacimiento = null;
        String anio = " ";
        String fechaNac = " ";
        int resultAnn;
        String anioActual;
        int anioInt;
       
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        fechaNac = JOptionPane.showInputDialog(null,"Ingresa la fecha de nacimiento pana: (en formato DDMMYYYY)");
       
        try {
            fechaNacimiento = sdf.parse(fechaNac);
        } catch (ParseException pe) {
            pe.printStackTrace();
        }
        anio = fechaNac.substring(4,8);
        resultAnn = Integer.parseInt(anio);
        
        anioActual = new SimpleDateFormat("yyyy").format(new Date());
        anioInt = Integer.parseInt(anioActual);
        
        JOptionPane.showMessageDialog(null,"Tu edad es: "+(anioInt - resultAnn));
    }
}
