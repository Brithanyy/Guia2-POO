public class cajeroAutomatico {
    private Cuenta[] cuentas;
    private int validos;
    public cajeroAutomatico(){
        this.cuentas = new Cuenta[10]; ///EN EL CONSTRUCTOR LE DEFINIMOS LA DIMENSION DEL ARREGLO Y LOS VALIDOS
        this.validos = 0;
    }

    public Cuenta[] getCuentas() {
        return cuentas;
    }

    public void setCuentas(Cuenta[] cuentas) {
        this.cuentas = cuentas;
    }


   public void  agregarcuentaSinSaldo(String nombre, String apellido, int dni){
        cuentas[validos] = new Cuenta(0,nombre, apellido, dni); ///CREAMOS EL OBJETO E LO INICIALIZAMOS
       ///SIN LA LINEA DE ARRIBA NOS DARIA ERROR O DIRECTAMENTE BASURA YA QUE EL OBJETO NO ESTARIA CREADO.
        this.validos++;
   }
    public void  agregarcuentaConSaldo(String nombre, String apellido, int dni, int saldo){
        cuentas[validos] = new Cuenta(saldo,nombre,apellido,dni); ///CREAMOS EL OBJETO E LO INICIALIZAMOS
        this.validos++;
    }

    public int buscarCuenta(int dni){
        int pos = -1;
        for(int i = 0; i < validos; i++){
            if(cuentas[i].getInfoCliente().getDni() == dni) pos = i;
            else if (pos == -1) System.out.println("No se encontró la cuenta.");
        }
        return pos;
    }

    public void depositarDinero(int pos, int dinero){
        if(dinero > 0){
            cuentas[pos].setSaldo(dinero);
        }else System.out.println("El monto ingresado es incorrecto.");
    }

    public void retirarDinero(int pos, int dinero){
        int dineroCuenta;
        int dineroActual;
        if(dinero < cuentas[pos].getSaldo()){
            dineroCuenta = cuentas[pos].getSaldo();
            dineroActual = dineroCuenta - dinero;
            cuentas[pos].setSaldo(dineroActual);
        }
    }

    public void verCuenta(int pos){
        System.out.println("Nombre: " + cuentas[pos].getInfoCliente().getNombre());
        System.out.println("Apellido: " + cuentas[pos].getInfoCliente().getApellido());
        System.out.println("DNI: " + cuentas[pos].getInfoCliente().getDni());
        System.out.println("Saldo Actual: " + cuentas[pos].getSaldo());
    }


}
