import java.util.Date;

public class Insumo {

            private String nombre;
    
            private String tipo;
    
            private double stockActual;
    
            private double stockMinimo;
    

    public Insumo() {}

    
        public String getNombre() {
            return this.nombre;
        }
    
        public String getTipo() {
            return this.tipo;
        }
    
        public double getStockActual() {
            return this.stockActual;
        }
    
        public double getStockMinimo() {
            return this.stockMinimo;
        }
    
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    
        public void setTipo(String tipo) {
            this.tipo = tipo;
        }
    
        public void setStockActual(double stockActual) {
            this.stockActual = stockActual;
        }
    
        public void setStockMinimo(double stockMinimo) {
            this.stockMinimo = stockMinimo;
        }
    
    

}
