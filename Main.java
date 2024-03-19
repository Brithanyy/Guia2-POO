import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        cajeroAutomatico cajero = new cajeroAutomatico();
        int eleccion;
        do{
            System.out.println("1. Crear cuenta vacía");
            System.out.println("2.Crear cuenta saldo inicial");
            System.out.println("3.Ingresar dinero");
            System.out.println("4. Sacar dinero");
            System.out.println("5. Ver saldo");
            System.out.println("6. Salir");
            eleccion = datos.nextInt();

            switch (eleccion){
                case 1:
                    String nombre;
                    System.out.println("Ingrese su nombre: ");
                    nombre = datos.nextLine();
                    String apellido;
                    System.out.println("Ingrese su apellido: ");
                    apellido = datos.nextLine();
                    int dni;
                    System.out.println("ingrese su DNI: ");
                    dni = datos.nextInt();
                    cajero.agregarcuentaSinSaldo(nombre,apellido,dni);
                    datos.nextInt();
                    break;
                case 2:
                    datos.nextLine();
                    System.out.println("Ingrese su nombre: ");
                    nombre = datos.nextLine();
                    System.out.println("Ingrese su apellido: ");
                    apellido = datos.nextLine();
                    System.out.println("ingrese su DNI: ");
                    dni = datos.nextInt();
                    int saldo;
                    System.out.println("Ingrese su saldo: ");
                    saldo = datos.nextInt();
                    cajero.agregarcuentaConSaldo(nombre,apellido,dni,saldo);
                    break;
                case 3:
                    int dniBuscar;
                    System.out.println("Ingrese su DNI para buscar su cuenta: ");
                    dniBuscar = datos.nextInt();
                    int pos = cajero.buscarCuenta(dniBuscar);
                    int montoDepositar;
                    System.out.println("Ingrese el monto a depositar: ");
                    montoDepositar = datos.nextInt();
                    cajero.depositarDinero(pos,montoDepositar);
                    break;
                case 4:
                    System.out.println("Ingrese su DNI para buscar su cuenta: ");
                    dniBuscar = datos.nextInt();
                    pos = cajero.buscarCuenta(dniBuscar);
                    int montoExtraer;
                    System.out.println("Ingrese el monto a extraer: ");
                    montoExtraer = datos.nextInt();
                    cajero.retirarDinero(pos,montoExtraer);
                    break;
                case 5:
                    System.out.println("Ingrese su DNI para buscar su cuenta: ");
                    dniBuscar = datos.nextInt();
                    pos = cajero.buscarCuenta(dniBuscar);
                    cajero.verCuenta(pos);
                    break;
            }
        }while(eleccion != 6);
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

    }

}