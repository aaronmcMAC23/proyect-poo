public class SentenciaIf {
    /* La sentencia id permite la ejecución de una sereie de insttrucciones en función del resultado
     * de una expreción logica 
     */
    public static void main(String[] args){
        String miFruta = "Naranja";
        if ("Naranja".equals(miFruta)){  // realiza la comaparacion con el String 
            System.out.println("Son iguales."); // si son iguales manda este mensaje 
        }else {
            System.out.println("No son iguales carnal."); // de no cumplirse muestra este mensaje
        }
    }
    
}
