import java.util.Date;

public class Empleado {

            private String cedula;
    
            private String nombre;
    
            private String cargo;
    
            private String rol;
    
            private Date fechaIngreso;
    

    public Empleado() {}

    
        public String getCedula() {
            return this.cedula;
        }
    
        public String getNombre() {
            return this.nombre;
        }
    
        public String getCargo() {
            return this.cargo;
        }
    
        public String getRol() {
            return this.rol;
        }
    
        public Date getFechaIngreso() {
            return this.fechaIngreso;
        }
    
        public void setCedula(String cedula) {
            this.cedula = cedula;
        }
    
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    
        public void setCargo(String cargo) {
            this.cargo = cargo;
        }
    
        public void setRol(String rol) {
            this.rol = rol;
        }
    
        public void setFechaIngreso(Date fechaIngreso) {
            this.fechaIngreso = fechaIngreso;
        }
    
    

}
