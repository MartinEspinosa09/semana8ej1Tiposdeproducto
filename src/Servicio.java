public class Servicio extends Producto {
    private int horas;

    public Servicio(String codigo, String nombre, double precio, int horas) {
        super(codigo, nombre, precio);
        this.horas = horas;
    }

    public int getHoras() {
        return horas;
    }

    @Override
    public double calcularCostoAdicional() {
        return horas * 15.00;
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() + String.format(" | Tipo: Servicio (%d h)", horas);
    }
}