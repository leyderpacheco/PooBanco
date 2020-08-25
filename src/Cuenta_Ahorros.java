public class Cuenta_Ahorros extends Cuenta{
    public Cuenta_Ahorros(int numeroCuenta, long saldo, Tarjeta[] tarjetas) {
        super(numeroCuenta, saldo, tarjetas);
    }

    @Override
    public void consignarDinero(double cantidad) {
        super.consignarDinero(cantidad);
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
