abstract class Pedidos {
    private MetodosPago metodosPago;
    public Pedidos(MetodosPago metodosPago){
        this.metodosPago = metodosPago;
    }
    public abstract void seleccionarProducto(String producto);
    public abstract void precioProducto(double precio);
    public abstract void datosDestinatario(String nombre, String apellidos, int telefono, String direccion);
}
