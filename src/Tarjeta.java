public class Tarjeta {
    String titular;
    private String fechaVencimiento;
    private long numero;
    private int cvc;

    public Tarjeta(String titular, String fechaVencimiento, long numero, int cvc) {
        this.titular = titular;
        this.fechaVencimiento = fechaVencimiento;
        this.numero = numero;
        this.cvc = cvc;
    }

    public double pagar(double saldo){
        return 0;
    }


}
