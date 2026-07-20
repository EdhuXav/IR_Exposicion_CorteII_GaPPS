import java.util.Date;

public class MovimientoInventario {

            private Date fecha;
    
            private String tipo;
    
            private double cantidad;
    

    public MovimientoInventario() {}

    
        public Date getFecha() {
            return this.fecha;
        }
    
        public String getTipo() {
            return this.tipo;
        }
    
        public double getCantidad() {
            return this.cantidad;
        }
    
        public void setFecha(Date fecha) {
            this.fecha = fecha;
        }
    
        public void setTipo(String tipo) {
            this.tipo = tipo;
        }
    
        public void setCantidad(double cantidad) {
            this.cantidad = cantidad;
        }
    
    

}
