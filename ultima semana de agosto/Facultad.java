public class Facultad {
    private String carreras; 
    private String ubicacion; 
    private String afiliacion;
    private int noEstudiantes;
    private int noEdificios;
    private int anioInaguracion;
    private float areaTerreno;

    public void setCarreras(String carreras){
        this.carreras = carreras;
    }
    
    public String getCarreras(){
        return carreras;
    }

    public void setUbicacion(String ubicacion){
        this.ubicacion = ubicacion;
    }

    public String getUbicacion(){
        return ubicacion;
    }

    public void setAfiliacion(String afiliacion){
        this.afiliacion = afiliacion;
    }

    public String getAfiliacion(){
        return afiliacion;
    }

    public void setNoEstudiantes(int noEstudiantes){
        this.noEstudiantes = noEstudiantes;
    }

    public int getNoEstudiantes(){
        return noEstudiantes;
    }

    public void setNoEdificios(int noEdificios){
        this.noEdificios = noEdificios;
    }

    public int getNoEdificios(){
        return noEdificios;
    }

    public void setAnioInaguracion(int anioInaguracion){
        this.anioInaguracion = anioInaguracion;
    }

    public int getAnioInaguracion(){
        return anioInaguracion;
    }

    public void setAreaTerreno(float areaTerreno){
        this.areaTerreno = areaTerreno;
    }

    public float getAreaTerreno(){
        return areaTerreno;
    }
}
