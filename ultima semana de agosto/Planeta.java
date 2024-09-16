public class Planeta {
    private double tamaño; // tamaño
    private float[] posicion; // posiciones
    private String orbita;  // órbita                          
    private String color; // color
    private int numeroAnillos; // número de anillos 
    private String composicionQuimica; // composición química
    private boolean atmosfera; // atmósfera
    private double campoMagnetico =-1;  // campo magnético             

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setPosicion(float[] posicion) {
        this.posicion = posicion;
    }

    public float[] getPosicion() {
        return posicion;
    }

    public void setOrbita(String orbita) {
        this.orbita = orbita;
    }

    public String getOrbita() {
        return orbita;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setNumeroAnillos(int numeroAnillos) {
        this.numeroAnillos = numeroAnillos;
    }

    public int getNumeroAnillos() {
        return numeroAnillos;
    }

    public void setComposicionQuimica(String composicionQuimica) {
        this.composicionQuimica = composicionQuimica;
    }

    public String getComposicionQuimica() {
        return composicionQuimica;
    }

    public void setAtmosfera(boolean atmosfera) {
        this.atmosfera = atmosfera;
    }

    public boolean getAtmosfera() {
        return atmosfera;
    }

    public void setCampoMagnetico(Double campoMagnetico) {
        this.campoMagnetico = campoMagnetico;
    }

    public Double getCampoMagnetico() {
        return campoMagnetico;
    }

    public String mostrarInfo() {
        String posiciones = "";
        for(int i = 0; i < posicion.length; i++) {
            posiciones += "Posición " + (i+1) + ": " + posicion[i] + "\n";
        }

        return "Tipo de órbita: " + orbita +
               "\n" + posiciones +
               "Color: " + color +
               "\nNúmero de anillos: " + numeroAnillos +
               "\nComposición química: " + composicionQuimica +
               "\nAtmósfera: " + atmosfera +
               "\nCampo magnético: " + campoMagnetico;
    }
}

