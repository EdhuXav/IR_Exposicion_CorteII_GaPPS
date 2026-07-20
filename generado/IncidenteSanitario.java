import java.util.Date;

public class IncidenteSanitario {

            private Date fecha;
    
            private String sintomas;
    
            private String diagnostico;
    
            private String tratamiento;
    

    public IncidenteSanitario() {}

    
        public Date getFecha() {
            return this.fecha;
        }
    
        public String getSintomas() {
            return this.sintomas;
        }
    
        public String getDiagnostico() {
            return this.diagnostico;
        }
    
        public String getTratamiento() {
            return this.tratamiento;
        }
    
        public void setFecha(Date fecha) {
            this.fecha = fecha;
        }
    
        public void setSintomas(String sintomas) {
            this.sintomas = sintomas;
        }
    
        public void setDiagnostico(String diagnostico) {
            this.diagnostico = diagnostico;
        }
    
        public void setTratamiento(String tratamiento) {
            this.tratamiento = tratamiento;
        }
    
    

}
