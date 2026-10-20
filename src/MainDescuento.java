public class MainDescuento {
    public static void main(String[] args) {
        Descuento D1 = new Descuento();
        Descuento D2 = new Descuento();
        Descuento D3 = new Descuento();
        D1.setCodigo("Super2026");
        D1.setPorcentajedeldescuento(25);
        D1.setDescripcion("Clientes Super");
        D1.setActivo(true);

        D2.setCodigo("Ultra2026");
        D2.setPorcentajedeldescuento(50);
        D2.setDescripcion("Clientes Ultra");
        D2.setActivo(true);

        D3.setCodigo("Master2026");
        D3.setPorcentajedeldescuento(75);
        D3.setDescripcion("Clientes Masters");
        D3.setActivo(false);

        D1.desactivado();
        D1.mostrarinformacion();
        D2.mostrarinformacion();
        D3.activado();
        D3.mostrarinformacion();

        System.out.println("RESUMEN");
        D1.mostrarresumen();
        D2.mostrarresumen();
        D3.mostrarresumen();
    }
}
