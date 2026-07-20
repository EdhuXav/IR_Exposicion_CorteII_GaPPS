import java.util.Date;

public class OrdenMantenimiento {

            private String equipo;
    
            private String tipo;
    
            private Date fecha;
    
            private String estado;
    

    public OrdenMantenimiento() {}

    
        public String getEquipo() {
            return this.equipo;
        }
    
        public String getTipo() {
            return this.tipo;
        }
    
        public Date getFecha() {
            return this.fecha;
        }
    
        public String getEstado() {
            return this.estado;
        }
    
        public void setEquipo(String equipo) {
            this.equipo = equipo;
        }
    
        public void setTipo(String tipo) {
            this.tipo = tipo;
        }
    
        public void setFecha(Date fecha) {
            this.fecha = fecha;
        }
    
        public void setEstado(String estado) {
            this.estado = estado;
        }
    
    

}
