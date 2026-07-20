import java.util.Date;

public class TareaDiaria {

            private String descripcion;
    
            private String area;
    
            private Date fecha;
    
            private String estadoCumplimiento;
    

    public TareaDiaria() {}

    
        public String getDescripcion() {
            return this.descripcion;
        }
    
        public String getArea() {
            return this.area;
        }
    
        public Date getFecha() {
            return this.fecha;
        }
    
        public String getEstadoCumplimiento() {
            return this.estadoCumplimiento;
        }
    
        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }
    
        public void setArea(String area) {
            this.area = area;
        }
    
        public void setFecha(Date fecha) {
            this.fecha = fecha;
        }
    
        public void setEstadoCumplimiento(String estadoCumplimiento) {
            this.estadoCumplimiento = estadoCumplimiento;
        }
    
    

}
