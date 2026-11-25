public class ProductoDigital extends Producto {
    private double tamanioMB;

    public ProductoDigital(String codigo, String nombre, double precio, double tamanioMB) {
        super(codigo, nombre, precio);
        this.tamanioMB = tamanioMB;
    }

    public double getTamanioMB() {
        return tamanioMB;
    }

    @Override
    public double calcularCostoAdicional() {
        return tamanioMB * 0.01;
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() + String.format(" | Tipo: Digital (%.1f MB)", tamanioMB);
    }
}