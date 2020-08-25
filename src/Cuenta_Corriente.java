public class Cuenta_Corriente extends Cuenta {

    long cheque;

    public Cuenta_Corriente(int numeroCuenta, long saldo, Tarjeta[] tarjetas,long cheque) {
        super(numeroCuenta, saldo, tarjetas);
        this.cheque=cheque;

    }

    @Override
    public void retirarDinero(double retiro) {
        super.retirarDinero(retiro);
    }

    @Override
    public void tranferirDinero(long transferencia, Cuenta otracuenta) {
        super.tranferirDinero(transferencia, otracuenta);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
