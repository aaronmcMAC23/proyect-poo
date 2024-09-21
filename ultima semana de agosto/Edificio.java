public class Edificio {
    private String materiales;
    private int noPisos;
    private String[] colores;
    private String ubicacion;
    private String diseño;
    private String estilo;
    private String uso;
    private int antiguedad;
    private String estadoObra;

    public void setMateriales(String materiales) {
        this.materiales = materiales;
    }

    public String getMateriles() {
        return materiales;
    }

    public void setNoPisos(int noPisos) {
        this.noPisos = noPisos;
    }

    public int getNoPisos() {
        return noPisos;
    }

    public void setColores(String[] colores) {
        this.colores = colores;
    }

    public String[] getColores() {
        return colores;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setDiseño(String diseño) {
        this.diseño = diseño;
    }

    public String getDiseño() {
        return diseño;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }   

    public String getEstilo() {
        return estilo;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }

    public String getUso() {
        return uso;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setEstadoObra(String estadoObra) {
        this.estadoObra = estadoObra;
    }
    
    public String getEstadoObra() {
        return estadoObra;
    }
    public String mostrarInfoE() {
        String coloresInfo = "";
        for (int i = 0; i < colores.length; i++) {
            coloresInfo += "Color " + (i + 1) + ": " + colores[i] + "\n";
        }
    
        return "Materiales: " + materiales +
               "\nNúmero de pisos: " + noPisos +
               "\nColores:\n" + coloresInfo +
               "Ubicación: " + ubicacion +
               "\nDiseño: " + diseño +
               "\nEstilo: " + estilo +
               "\nUso: " + uso +
               "\nAntigüedad: " + antiguedad +
               "\nEstado de la obra: " + estadoObra;
    }
}
