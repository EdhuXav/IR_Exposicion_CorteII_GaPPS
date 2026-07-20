import java.util.Date;

public class PrediccionIA {

            private Date fecha;
    
            private String resultado;
    
            private double nivelConfianza;
    

    public PrediccionIA() {}

    
        public Date getFecha() {
            return this.fecha;
        }
    
        public String getResultado() {
            return this.resultado;
        }
    
        public double getNivelConfianza() {
            return this.nivelConfianza;
        }
    
        public void setFecha(Date fecha) {
            this.fecha = fecha;
        }
    
        public void setResultado(String resultado) {
            this.resultado = resultado;
        }
    
        public void setNivelConfianza(double nivelConfianza) {
            this.nivelConfianza = nivelConfianza;
        }
    
    

}
