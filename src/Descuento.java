public class Descuento {
    private String codigo;
    private double porcentajedeldescuento;
    private String descripcion;
    private boolean activo;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPorcentajedeldescuento() {
        return porcentajedeldescuento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    public void setPorcentajedeldescuento(double porcentajedeldescuento) {
        this.porcentajedeldescuento = porcentajedeldescuento;
    }

    public void mostrarinformacion(){
        System.out.println("Cupon: "+ getCodigo()+ "\nPorcentaje del Descuento: "+ getPorcentajedeldescuento() + "%" +"\nDescripcion: "+ getDescripcion()+"\nactivo: "+ activo);
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