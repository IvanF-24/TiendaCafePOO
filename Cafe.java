public class Cafe {
    private String nombre;
    private String region;
    private float precioPorKilo;
    private float cantidadEnKilos;

    public Cafe(String nombre, String region, float precioPorKilo, float cantidadEnKilos) {
        this.nombre = nombre;
        this.region = region;
        this.precioPorKilo = precioPorKilo;
        this.cantidadEnKilos = cantidadEnKilos;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Región: " + region);
        System.out.println("Precio por kilo: " + precioPorKilo + " COP");
        System.out.println("Cantidad disponible: " + cantidadEnKilos + " kg");
        System.out.println("-------------------------");
    }

    public float calcularPrecioTotal() {
        return precioPorKilo * cantidadEnKilos;
    }

    public void actualizarCantidad(float nuevaCantidad) {
        this.cantidadEnKilos = nuevaCantidad;
    }

    //Nuevo método solicitado
    public void aplicarDescuento(double porcentaje) {
        if (porcentaje < 0 || porcentaje > 100) {
            System.out.println("Porcentaje inválido.");
            return;
        }

        double descuento = precioPorKilo * (porcentaje / 100);
        precioPorKilo -= descuento;

        System.out.println("Descuento aplicado: " + porcentaje + "%");
        System.out.println("Nuevo precio por kilo: " + precioPorKilo + " COP");
    }
}
