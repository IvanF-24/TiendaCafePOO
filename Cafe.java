
class Cafe {
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
}