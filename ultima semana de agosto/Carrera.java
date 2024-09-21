public class Carrera {
    private String titulo;
    private String [] materias;
    private int area;
    private int clavesPlanes;
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

    public void setClavesPlanes(int clavesPlanes) {
        this.clavesPlanes = clavesPlanes;
    }
    
    public int getClavesPlanes() {
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
    public String mostrarInfoC() {
        String materiasStr = "";
    for (int i = 0; i < materias.length; i++) {
        materiasStr += "Materia " + (i + 1) + ": " + materias[i] + "\n";
    }

    String requisitosStr = "";
    for (int i = 0; i < requisitosIngreso.length; i++) {
        requisitosStr += "Requisito " + (i + 1) + ": " + requisitosIngreso[i] + "\n";
    }

    String opcionesStr = "";
    for (int i = 0; i < opcionesTitulacion.length; i++) {
        opcionesStr += "Opción de titulación " + (i + 1) + ": " + opcionesTitulacion[i] + "\n";
    }

    return "Nombre de la carrera: " + titulo +
           "\nÁrea de la carrera: " + area +
           "\nClaves de planes de estudio: " + clavesPlanes +
           "\nEspecialidades: " + especialidades +
           "\nMaterias:\n" + materiasStr +
           "\nRequisitos de ingreso:\n" + requisitosStr +
           "\nOpciones de titulación:\n" + opcionesStr +
           "\nDuración: " + duracion + " años";
    }
}
