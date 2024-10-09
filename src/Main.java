public class Main {
    public static void main(String[] args) {
        MetodosPago tarjetaCredito = new TarjetasCredito();
        MetodosPago payPal = new PayPal();
        MetodosPago applePay = new ApplePay();

        Pedidos ropa = new Ropa(tarjetaCredito);
        ropa.seleccionarProducto("camisa");
        ropa.precioProducto(25.95);
        ropa.datosDestinatario("nombre_destinatario_ropa", "apellidos_destinatario_ropa", 612345678, "direccion_destinatario_ropa");
        Pedidos tecnologia = new Tecnologia(payPal);
        tecnologia.seleccionarProducto("portatil");
        tecnologia.precioProducto(1500.00);
        tecnologia.datosDestinatario("nombre_destinatario_tecnologia", "apellidos_destinatario_tecnologia", 645876543, "direccion_destinatario_tecnologia");
        Pedidos alimento = new Alimentos(applePay);
        alimento.seleccionarProducto("caja de barritas energéticas");
        alimento.precioProducto(29.00);
        alimento.datosDestinatario("nombre_destinatario_alimento", "apellidos_destinatario_alimento", 678901234, "direccion_destinatario_alimento");
    }
}