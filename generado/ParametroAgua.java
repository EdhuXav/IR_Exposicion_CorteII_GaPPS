import java.util.Date;

public class ParametroAgua {

            private Date fecha;
    
            private String tipo;
    
            private double valor;
    
            private String origen;
    

    public ParametroAgua() {}

    
        public Date getFecha() {
            return this.fecha;
        }
    
        public String getTipo() {
            return this.tipo;
        }
    
        public double getValor() {
            return this.valor;
        }
    
        public String getOrigen() {
            return this.origen;
        }
    
        public void setFecha(Date fecha) {
            this.fecha = fecha;
        }
    
        public void setTipo(String tipo) {
            this.tipo = tipo;
        }
    
        public void setValor(double valor) {
            this.valor = valor;
        }
    
        public void setOrigen(String origen) {
            this.origen = origen;
        }
    
    

}
