import java.util.Date;

public class RegistroAlimentacion {

            private Date fecha;
    
            private String tipoBalanceado;
    
            private double cantidad;
    
            private Date horario;
    
            private String tipoPrediccion;
    

    public RegistroAlimentacion() {}

    
        public Date getFecha() {
            return this.fecha;
        }
    
        public String getTipoBalanceado() {
            return this.tipoBalanceado;
        }
    
        public double getCantidad() {
            return this.cantidad;
        }
    
        public Date getHorario() {
            return this.horario;
        }
    
        public String getTipoPrediccion() {
            return this.tipoPrediccion;
        }
    
        public void setFecha(Date fecha) {
            this.fecha = fecha;
        }
    
        public void setTipoBalanceado(String tipoBalanceado) {
            this.tipoBalanceado = tipoBalanceado;
        }
    
        public void setCantidad(double cantidad) {
            this.cantidad = cantidad;
        }
    
        public void setHorario(Date horario) {
            this.horario = horario;
        }
    
        public void setTipoPrediccion(String tipoPrediccion) {
            this.tipoPrediccion = tipoPrediccion;
        }
    
    

}
