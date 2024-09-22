package Documento;
import java.util.Date;
public class documento {
        private String titulo;
        private Date fecha;
        private String nombreDoc;
        private String ruta;
        private int caracteres;
        private int renglones;
        private int parrafos;
        private int paginas;
        private String contenido;

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }
        
        public String getTitulo() {
            return titulo;
        }
        
        public void setFecha(Date fecha) {
            this.fecha = fecha;
        }
        
        public Date getFecha() {
            return fecha;
        }
        
        public void setNombreDoc(String nombreDoc) {
            this.nombreDoc = nombreDoc;
        }
        
        public String getNombreDoc() {
            return nombreDoc;
        }
        
        public void setRuta(String ruta) {
            this.ruta = ruta;
        }
        
        public String getRuta() {
            return ruta;
        }
        
        public void setCaracteres(int caracteres) {
            this.caracteres = caracteres;
        }
        
        public int getCaracteres() {
            return caracteres;
        }
        
        public void setRenglones(int renglones) {
            this.renglones = renglones;
        }
        
        public int getRenglones() {
            return renglones;
        }
        
        public void setParrafos(int parrafos) {
            this.parrafos = parrafos;
        }
        
        public int getParrafos() {
            return parrafos;
        }
        
        public void setPaginas(int paginas) {
            this.paginas = paginas;
        }
        
        public int getPaginas() {
            return paginas;
        }
        
        public void setContenido(String contenido) {
            this.contenido = contenido;
        }
        
        public String getContenido() {
            return contenido;
        }
public void CalcularCaracteres(){

}

public void CalcularRenglones(){

}

public void CalcularParrafos(){

}

public void CalcularPaginas(){
    paginas = caracteres / 1000;
}
}
