public class MainDescuento {
    public static void main(String[] args) {
        Descuento D1 = new Descuento();
        Descuento D2 = new Descuento();
        Descuento D3 = new Descuento();
        D1.codigo = "Super2026";
        D1.porcentajedeldescuento = 25;
        D1.descripcion = "Clientes Super";
        D1.activo = true;
        D2.codigo = "Ultra2026";
        D2.porcentajedeldescuento = 50;
        D2.descripcion = "Clientes Ultra";
        D2.activo = true;
        D3.codigo = "Master2026";
        D3.porcentajedeldescuento = 75;
        D3.descripcion = "Clientes Masters";
        D3.activo = false;
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
