public class TiendaCafe {
    public static void main(String[] args) {

        Cafe cafe1 = new Cafe("Café de Nariño", "Nariño", 45000f, 10f);
        Cafe cafe2 = new Cafe("Café de Antioquia", "Antioquia", 38000f, 8f);
        Cafe cafe3 = new Cafe("Café del Huila", "Huila", 42000f, 12f);

        cafe1.mostrarInformacion();
        cafe2.mostrarInformacion();
        cafe3.mostrarInformacion();

        System.out.println("Precio total café 1: " + cafe1.calcularPrecioTotal() + " COP");
        System.out.println("Precio total café 2: " + cafe2.calcularPrecioTotal() + " COP");
        System.out.println("Precio total café 3: " + cafe3.calcularPrecioTotal() + " COP");
        System.out.println("-------------------------");

        cafe2.actualizarCantidad(5f);

        System.out.println("Información actualizada del café 2:");
        cafe2.mostrarInformacion();
    }
}
