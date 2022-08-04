import java.util.Scanner;
//Libreria necesaria para leer datos por teclado
public class Main {
    public static void main(String[] args) {
        Scanner numero = new Scanner (System.in);

        System.out.println("Escribe un numero y te dire si es positivo o negativo: ");
        int num = numero.nextInt();
        if(num>=0){
            System.out.println("Su numero es: positivo");
        }else {
            System.out.println("Su numero es: negativo");
        }
    }
}