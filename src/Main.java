public class Main {

    public static int suma(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println("Resultado de la suma: " + suma(1, 2, 3));
        Coche miCoche = new Coche();
        miCoche.IncrementaPuertas(1);
        System.out.println("El total de puertas de mi coche es " + miCoche.numeroPuertas);
    }

}