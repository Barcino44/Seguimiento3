import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Circular_List list = new Circular_List();
        Scanner reader = new Scanner(System.in);
        int option;
        do {
            System.out.println("Opciones");
            System.out.println("1. Dar turno ");
            System.out.println("2.Mostrar turno actual");
            System.out.println("3. Pasar turno");
            System.out.println("4. Seguir");
            System.out.println("0.Exit program");
            option = reader.nextInt();
            if(option==1){
                list.addNode();
            }
            else if(option==2){
                list.printActualTurn();
            }
            else if(option==3){
                list.pasarTurno();
            }
            else if (option==4){
                list.seguir();
            }
        } while (option!=0);
    }
}