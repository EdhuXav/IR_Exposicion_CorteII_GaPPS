import java.util.Date;

public class Estanque {

            private String id;
    
            private String nombreCodigo;
    
            private double superficieHa;
    
            private String estado;
    
            private int capacidadMaxLarvas;
    
            private double profundidadM;
    

    public Estanque() {}

    
        public String getId() {
            return this.id;
        }
    
        public String getNombreCodigo() {
            return this.nombreCodigo;
        }
    
        public double getSuperficieHa() {
            return this.superficieHa;
        }
    
        public String getEstado() {
            return this.estado;
        }
    
        public int getCapacidadMaxLarvas() {
            return this.capacidadMaxLarvas;
        }
    
        public double getProfundidadM() {
            return this.profundidadM;
        }
    
        public void setId(String id) {
            this.id = id;
        }
    
        public void setNombreCodigo(String nombreCodigo) {
            this.nombreCodigo = nombreCodigo;
        }
    
        public void setSuperficieHa(double superficieHa) {
            this.superficieHa = superficieHa;
        }
    
        public void setEstado(String estado) {
            this.estado = estado;
        }
    
        public void setCapacidadMaxLarvas(int capacidadMaxLarvas) {
            this.capacidadMaxLarvas = capacidadMaxLarvas;
        }
    
        public void setProfundidadM(double profundidadM) {
            this.profundidadM = profundidadM;
        }
    
    

}
