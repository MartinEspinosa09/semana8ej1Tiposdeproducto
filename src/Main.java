import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Producto f1 = new ProductoFisico("FIS-01", "Teclado Mecánico", 65.00, 1.2);
        Producto f2 = new ProductoFisico("FIS-02", "Monitor 24\"", 180.00, 4.5);

        Producto d1 = new ProductoDigital("DIG-01", "Plantilla UI Kit", 29.00, 350.0);
        Producto d2 = new ProductoDigital("DIG-02", "Curso Edición Video", 49.00, 1800.0);

        Producto s1 = new Servicio("SRV-01", "Auditoría SEO", 120.00, 4);
        Producto s2 = new Servicio("SRV-02", "Configuración Tienda", 90.00, 3);

        ArrayList<Producto> catalogo = new ArrayList<>();
        catalogo.add(f1);
        catalogo.add(f2);
        catalogo.add(d1);
        catalogo.add(d2);
        catalogo.add(s1);
        catalogo.add(s2);

        System.out.println("=== CATÁLOGO DE PRODUCTOS (POLIMORFISMO) ===");
        for (Producto p : catalogo) {
            System.out.println(p.mostrarInformacion());
        }

        double totalGeneral = 0.0;
        double totalAdicionales = 0.0;
        for (Producto p : catalogo) {
            totalAdicionales += p.calcularCostoAdicional();
            totalGeneral += p.calcularPrecioFinal();
        }

        System.out.println("\n=== RESUMEN DE COSTOS ===");
        System.out.printf("Total costos adicionales: $%.2f%n", totalAdicionales);
        System.out.printf("Total general del catálogo: $%.2f%n", totalGeneral);
    }
}