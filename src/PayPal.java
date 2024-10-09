public class PayPal implements MetodosPago{
    @Override
    public void pagar(){
        System.out.println("Acabas de pagar tu pedido con tu cuenta de Paypal.");
    }
}
