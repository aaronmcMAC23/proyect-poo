public class Carrera {
    private String titulo;
    private String [] materias;
    private int area;
    private int[] clavesPlanes;
    private String especialidades;
    private String[]requisitosIngreso;
    private String[] opcionesTitulacion;
    private int duracion;
    

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }
    
    public void setMaterias(String [] materias) {
        this.materias = materias;
    }

    public String[] getMaterias() {
        return materias;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getArea() {
        return area;
    }

    public void setClavesPlanes(int[] clavesPlanes) {
        this.clavesPlanes = clavesPlanes;
    }
    
    public int[] getClavesPlanes() {
        return clavesPlanes;
    }

    public void setEspecialidades(String especialidades) {
        this.especialidades = especialidades;
    }

    public String getEspecialidades() {
        return especialidades;
    }

    public void setRequisitosIngreso(String[] requisitosIngreso) {
        this.requisitosIngreso = requisitosIngreso;
    }

    public String[] getRequisitosIngreso() {
        return requisitosIngreso;
    }

    public void setOpcionesTitulacion(String[] opcionesTitulacion) {
        this.opcionesTitulacion = opcionesTitulacion;
    }

    public String[] getOpcionesTitulacion() {
        return opcionesTitulacion;
    }
    
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getDuracion() {
        return duracion;
    }
}
