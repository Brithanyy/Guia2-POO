public class Cuenta {
    private int saldo;
    private Titular infoCliente;

    public Cuenta(int saldo, String nombre, String apellido, int dni){ ///MODIFICAMOS Y A INFO CLIENTE LO DESGLOSAMOS PARA  OBTENER SUS ATRIBUTOS Y PONERLO EN EL PARAMETRO.
        this.saldo = saldo;
        this.infoCliente = new Titular(nombre, apellido, dni); ///CREAMOS EL OBJETO INFOCLIENTE DENTRO DEL CONSTRUCTOR.
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public Titular getInfoCliente() {
        return infoCliente;
    }

    public void setInfoCliente(Titular infoCliente) {
        this.infoCliente = infoCliente;
    }

}
