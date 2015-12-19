
package aplicativo;

import java.util.Scanner;


public class Main {
    public static void main(String[] argumentos){
        Scanner teclado = new Scanner(System.in);
        
        
        Banco banco = new Banco();
        System.out.println("************************");
        System.out.println("Bienvenido...");
        System.out.println("Ingresa tu numero de cuenta:");
        int cuenta = teclado.nextInt();
        
        switch(cuenta){
            case 1:
                System.out.println("Bienvenido" + banco.getPersona1().getNombre());
                System.out.println("Ingrese la operacion  realizar: ");
                System.out.println("A.- Depositar");
                System.out.println("B.- Retirar");
                String operacion = teclado.next();
                if (operacion.equals("A")  || operacion.equals("a")){
                    System.out.println("********************");
                    System.out.println("Ingrese el monto a depositar: ");
                    double monto = teclado.nextDouble();
                    double montoAnterior = banco.getPersona1().getMonto();
                    banco.getPersona1().setMonto(montoAnterior + monto);
                    System.out.println("El monto final es: " + banco.getPersona1().getMonto());
                }else if(operacion.equals("B")  || operacion.equals("b")){
                    System.out.println("****************");
                    System.out.println("Ingresa el monto a retirar: ");
                    double montoRetiro = teclado.nextDouble();
                    double anterior = banco.getPersona1().getMonto();
                    banco.getPersona1().setMonto(anterior - montoRetiro);
                    System.out.println("El monto restante es: "+ banco.getPersona1().getMonto());
                }
                break;
            case 2:
                System.out.println("Bienvenido" + banco.getPersona2().getNombre());
                System.out.println("Ingrese la operacion  realizar: ");
                System.out.println("A.- Depositar");
                System.out.println("B.- Retirar");
                String operacionp2 = teclado.next();
                if (operacionp2.equals("A") || operacionp2.equals("a")){
                    System.out.println("********************");
                    System.out.println("Ingrese el monto a depositar: ");
                    double monto = teclado.nextDouble();
                    double montoAnterior = banco.getPersona2().getMonto();
                    banco.getPersona2().setMonto(montoAnterior + monto);
                    System.out.println("El monto final es: " + banco.getPersona2().getMonto());
                }else if(operacionp2.equals("B") || operacionp2.equals("b")){
                    System.out.println("****************");
                    System.out.println("Ingresa el monto a retirar: ");
                    double montoRetiro = teclado.nextDouble();
                    double anterior = banco.getPersona2().getMonto();
                    banco.getPersona2().setMonto(anterior - montoRetiro);
                    System.out.println("El monto restante es: "+ banco.getPersona2().getMonto());
                }
                break;
            case 3:
                System.out.println("Bienvenido" + banco.getPersona3().getNombre());
                System.out.println("Ingrese la operacion  realizar: ");
                System.out.println("A.- Depositar");
                System.out.println("B.- Retirar");
                String operacionp3 = teclado.next();
                if (operacionp3.equals("A") || operacionp3.equals("a")){
                    System.out.println("********************");
                    System.out.println("Ingrese el monto a depositar: ");
                    double monto = teclado.nextDouble();
                    double montoAnterior = banco.getPersona3().getMonto();
                    banco.getPersona3().setMonto(montoAnterior + monto);
                    System.out.println("El monto final es: " + banco.getPersona3().getMonto());
                }else if(operacionp3.equals("B") || operacionp3.equals("b")){
                    System.out.println("****************");
                    System.out.println("Ingresa el monto a retirar: ");
                    double montoRetiro = teclado.nextDouble();
                    double anterior = banco.getPersona3().getMonto();
                    banco.getPersona3().setMonto(anterior - montoRetiro);
                    System.out.println("El monto restante es: "+ banco.getPersona3().getMonto());
                }
                break;
            default:
                System.out.println("Cuenta no registrada");
                System.exit(0);
        }

    }
}
