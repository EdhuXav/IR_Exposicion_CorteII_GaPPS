import java.util.Date;

public class Grameo {

            private Date fecha;
    
            private double pesoPromedio;
    
            private String observaciones;
    

    public Grameo() {}

    
        public Date getFecha() {
            return this.fecha;
        }
    
        public double getPesoPromedio() {
            return this.pesoPromedio;
        }
    
        public String getObservaciones() {
            return this.observaciones;
        }
    
        public void setFecha(Date fecha) {
            this.fecha = fecha;
        }
    
        public void setPesoPromedio(double pesoPromedio) {
            this.pesoPromedio = pesoPromedio;
        }
    
        public void setObservaciones(String observaciones) {
            this.observaciones = observaciones;
        }
    
    

}
