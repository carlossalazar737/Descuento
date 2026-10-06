public class Descuento {
    public String codigo;
    public double porcentajedeldescuento;
    String descripcion;
    boolean activo;
    public void mostrarinformacion(){
        System.out.println("Cupon: "+ codigo+ "\nPorcentaje del Descuento: "+ porcentajedeldescuento+ "%" +"\nDescripcion: "+ descripcion+"\nactivo: "+ activo);
    }
    public void activado(){
        activo=true;
    }
    void desactivado(){
        activo=false;
    }
    public void mostrardescuento() {
        System.out.println("Descuento: "+ porcentajedeldescuento+"%");
    }
    void mostrarresumen(){
        System.out.println("Cupon: "+ codigo+"-"+ "Descuento: "+porcentajedeldescuento);
    }
}