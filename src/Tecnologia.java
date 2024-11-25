public class Tecnologia extends Pedidos{
    public Tecnologia(MetodosPago metodosPago){
        super(metodosPago);
    }
    @Override
    public void seleccionarProducto(String producto){
        System.out.println("El/La " + producto + " ha sido seleccionado/a correctamente.");
    }
    @Override
    public void precioProducto(double precio){
        System.out.println("El precio del aparato es " + precio + " €.");
    }
    @Override
    public void datosDestinatario(String nombre, String apellidos, int telefono, String direccion){
        System.out.println("Destinatario del aparato:" + "\n- Nombre: " + nombre + "\n- Apellidos: " + apellidos + "\n- Teléfono: " + telefono + "\n- Dirección: " + direccion);
    }
}
