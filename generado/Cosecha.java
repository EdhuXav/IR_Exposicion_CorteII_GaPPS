import java.util.Date;

public class Cosecha {

            private Date fecha;
    
            private double pesoTotal;
    
            private double tallaPromedio;
    
            private double rendimiento;
    
            private double costoProduccion;
    

    public Cosecha() {}

    
        public Date getFecha() {
            return this.fecha;
        }
    
        public double getPesoTotal() {
            return this.pesoTotal;
        }
    
        public double getTallaPromedio() {
            return this.tallaPromedio;
        }
    
        public double getRendimiento() {
            return this.rendimiento;
        }
    
        public double getCostoProduccion() {
            return this.costoProduccion;
        }
    
        public void setFecha(Date fecha) {
            this.fecha = fecha;
        }
    
        public void setPesoTotal(double pesoTotal) {
            this.pesoTotal = pesoTotal;
        }
    
        public void setTallaPromedio(double tallaPromedio) {
            this.tallaPromedio = tallaPromedio;
        }
    
        public void setRendimiento(double rendimiento) {
            this.rendimiento = rendimiento;
        }
    
        public void setCostoProduccion(double costoProduccion) {
            this.costoProduccion = costoProduccion;
        }
    
    

}
