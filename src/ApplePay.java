public class ApplePay implements MetodosPago{
    @Override
    public void pagar(){
        System.out.println("Acabas de pagar tu pedido a través de Apple Pay.");
    }
}
