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
    
}
