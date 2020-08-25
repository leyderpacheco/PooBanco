import java.util.ArrayList;

public class Banco {
    String nombreBanco;
    ArrayList<Cliente> cliente = new ArrayList<>();

    public Banco(String nombreBanco, ArrayList<Cliente> cliente) {
        this.nombreBanco = nombreBanco;
        this.cliente = cliente;
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public ArrayList<Cliente> getCliente() {

        return cliente;
    }
	
	public void commit(){
    System.out.println("Cambio 1 al commit"):
    }
//comentarios malos
}
