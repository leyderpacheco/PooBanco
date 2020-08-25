public class Cliente {

    int identificacion;
    String nombre;
    String apeliido;
    Cuenta[] cuentas;

    public Cliente(int identificacion, String nombre, String apeliido, Tarjeta[] tarjetas, Cuenta[] cuentas) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.apeliido = apeliido;
        this.cuentas = cuentas;
    }


    public int getIdentificacion() {
        return identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApeliido() {
        return apeliido;
    }

    public void asesoramientoPedir(){
        System.out.println("Te estamos asesorando");
    }
}
