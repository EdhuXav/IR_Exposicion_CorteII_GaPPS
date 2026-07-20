import java.util.Date;

public class Siembra {

            private Date fechaInicio;
    
            private int cantidadLarvas;
    
            private String tipoLarva;
    
            private String laboratorioOrigen;
    

    public Siembra() {}

    
        public Date getFechaInicio() {
            return this.fechaInicio;
        }
    
        public int getCantidadLarvas() {
            return this.cantidadLarvas;
        }
    
        public String getTipoLarva() {
            return this.tipoLarva;
        }
    
        public String getLaboratorioOrigen() {
            return this.laboratorioOrigen;
        }
    
        public void setFechaInicio(Date fechaInicio) {
            this.fechaInicio = fechaInicio;
        }
    
        public void setCantidadLarvas(int cantidadLarvas) {
            this.cantidadLarvas = cantidadLarvas;
        }
    
        public void setTipoLarva(String tipoLarva) {
            this.tipoLarva = tipoLarva;
        }
    
        public void setLaboratorioOrigen(String laboratorioOrigen) {
            this.laboratorioOrigen = laboratorioOrigen;
        }
    
    

}
