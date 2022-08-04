public class Main {

    public static int BucleWhile() {
        int numeroWhile = 0;
        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile++;
        }
        return numeroWhile;
    }

    public static int BucleDoWhile()
    {
        int numeroDoWhile = 0;
        do {
        System.out.println(numeroDoWhile);
        numeroDoWhile++;
        } while (numeroDoWhile<=0);
        return numeroDoWhile;
    }

    public  static int BucleFor() {

        int numeroFor;
        for (numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }
        return numeroFor;
    }
    public static String FuncionSegun() {
        String estacion = "verano";

        switch (estacion) {
            case "primavera":
                System.out.println("La estacion es primavera");
                break;
            case "verano":
                System.out.println("La estacion es verano");
                break;
            case "otono":
                System.out.println("La estacion es otono");
                break;
            case "invierno":
                System.out.println("La estacion es invierno");
                break;
            default:
                System.out.println("No es una estacion");
        }
        return estacion;
    }




    public static void main(String[] args) {
        System.out.println("Bucle While");
        BucleWhile();
        System.out.println("Bucle Do While");
        BucleDoWhile();
        System.out.println("Bucle For");
        BucleFor();
        System.out.println("Bloque Segun");
        FuncionSegun();

        }
    }