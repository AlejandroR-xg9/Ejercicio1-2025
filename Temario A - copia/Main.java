import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    //Nueva instancia del comprador
    Boletos Boletos2 = new Boletos();
    Boletos2.Espacio();
int accion = -1;

while (accion == -1){
    System.out.println("Elige tu Acción, Comprar Ticket(1), Ver disponibilidad(2), Caja(3), Salir(4)");
    accion = scanner.nextInt();//Variable que controla el while

    

//While para el menú en la consola
while (accion == 1){

System.out.println("Elige tu localidad: 1(Q100),2(Q500) o 3(Q1000)");
    double local = scanner.nextInt();
        Boletos2.setLocalidad(local);
        Boletos2.getLocalidad();
        Boletos2.AsignarPrecio();
        
    if (local == 1){
        Boletos2.setEspacio1(Boletos2.getEspacio1()-1);
    }
    else if (local == 2){
        Boletos2.setEspacio2(Boletos2.getEspacio2()-1);
    }
    else if (local == 3){
        Boletos2.setEspacio3(Boletos2.getEspacio3()-1);
    }
    System.out.println("Compra exitosa por: " + Boletos2.getPrecio());

    accion = -1;//Regresar a estado anterior del While
}
while (accion == 2){
    System.out.println("Elige tu localidad: 1(Q100),2(Q500), 3(Q1000) o 4(Todas)");
    int mlocal = scanner.nextInt();
    if (mlocal == 1){
    System.out.println("Disponibilidad de la localidad 1: " + Boletos2.getEspacio1());
    }
    else if (mlocal == 2){
    System.out.println("Disponibilidad de la localidad 2: " + Boletos2.getEspacio2());
    }
    else if (mlocal == 3){
        Boletos2.setEspacio1(Boletos2.getEspacio3());
    System.out.println("Disponibilidad de la localidad 3: " + Boletos2.getEspacio3());
    }
    else if(mlocal == 4){
    System.out.println("Disponibles en localidad 1: " + Boletos2.getEspacio1());
    System.out.println("Disponibles en localidad 2: " +Boletos2.getEspacio2());
    System.out.println("Disponibles en localidad 3: " +Boletos2.getEspacio3());
    }
    accion = -1;//Parar While
}
while (accion == 3){
Boletos2.setLocalidad(1);
    System.out.println("Ganancia de Localidad 1: ");
    int Ganancia = 100*(20-Boletos2.getEspacio1());
    System.out.println(Ganancia);

Boletos2.setLocalidad(2);
    System.out.println("Ganancia de Localidad 2: ");
    int Ganancia2 = 500*(20-Boletos2.getEspacio2());
    System.out.println(Ganancia2);

Boletos2.setLocalidad(3);
    System.out.println("Ganancia de Localidad 3: ");
    int Ganancia3 = 1000*(20-Boletos2.getEspacio3());
    System.out.println(Ganancia3);
accion = -1;
}
}
if (accion == 4){
    System.out.println("Sistema cerrado");
}
    scanner.close();
}
}