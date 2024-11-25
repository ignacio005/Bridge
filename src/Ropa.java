public class Ropa extends Pedidos{
    public Ropa(MetodosPago metodosPago){
        super(metodosPago);
    }
    @Override
    public void seleccionarProducto(String producto){
        System.out.println("El/La " + producto + " ha sido seleccionado/a correctamente.");
    }
    @Override
    public void precioProducto(double precio){
        System.out.println("El precio de la ropa es " + precio + " €.");
    }
    @Override
    public void datosDestinatario(String nombre, String apellidos, int telefono, String direccion){
        System.out.println("Destinatario de la ropa:" + "\n- Nombre: " + nombre + "\n- Apellidos: " + apellidos + "\n- Teléfono: " + telefono + "\n- Dirección: " + direccion);
    }
}
