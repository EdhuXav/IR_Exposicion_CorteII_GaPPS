import java.util.Date;

public class AlertaAgua {

            private Date fecha;
    
            private String tipo;
    
            private String estado;
    
            private String accionCorrectiva;
    
            private String responsable;
    

    public AlertaAgua() {}

    
        public Date getFecha() {
            return this.fecha;
        }
    
        public String getTipo() {
            return this.tipo;
        }
    
        public String getEstado() {
            return this.estado;
        }
    
        public String getAccionCorrectiva() {
            return this.accionCorrectiva;
        }
    
        public String getResponsable() {
            return this.responsable;
        }
    
        public void setFecha(Date fecha) {
            this.fecha = fecha;
        }
    
        public void setTipo(String tipo) {
            this.tipo = tipo;
        }
    
        public void setEstado(String estado) {
            this.estado = estado;
        }
    
        public void setAccionCorrectiva(String accionCorrectiva) {
            this.accionCorrectiva = accionCorrectiva;
        }
    
        public void setResponsable(String responsable) {
            this.responsable = responsable;
        }
    
    

}
