public class Cuenta {
    int numeroCuenta;
    long saldo;
    Tarjeta tarjetas[];

    public Cuenta(int numeroCuenta, long saldo, Tarjeta[] tarjetas) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tarjetas = tarjetas;
    }

    public void consignarDinero(double cantidad){
        saldo+=cantidad;
    }

    public void retirarDinero(double retiro){
        if (saldo<retiro){
            System.out.println("Saldos insuficientes");
        }else {
            saldo-=retiro;
            System.out.println("Retiro de :"+retiro+"saldo total :"+saldo+" pesos");
        }
    }

    public void tranferirDinero(long transferencia, Cuenta otracuenta){
        if (transferencia<saldo) {
            System.out.println("Transferencia no valida, saldos insuficientes");
        }else{
                otracuenta.consignarDinero(transferencia);
            System.out.println("Transferencia realizada a la cuenta :"+otracuenta.toString());
        }
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "numeroCuenta=" + numeroCuenta +
                ", tiene un saldo de=" + saldo +
                '}';
    }
//comentario 1
}
