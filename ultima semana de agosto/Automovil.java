
public class Automovil {
    private String tamanio;
    private String condicion;
    private float precio;
    private String color;
    private int apariencia;
    private String marca;
    private String traccion;
    private String modelo;


    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
    }   

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setApariencia(int apariencia) {
        this.apariencia = apariencia;
    }   

    public int getApariencia() {
        return apariencia;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }

    public String getTraccion() {
        return traccion;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }
    public String mostrarinfoA(){
        return "Tamaño: " + tamanio +
        "\nCondición: " + condicion +
        "\nPrecio: $" + precio +
        "\nColor: " + color +
        "\nApariencia (1-10): " + apariencia +
        "\nMarca: " + marca +
        "\nTracción: " + traccion +
        "\nModelo: " + modelo;
    }
    
}
