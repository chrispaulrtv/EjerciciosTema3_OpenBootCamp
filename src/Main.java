public class Main {
    public static void main(String[] args) {
        // Ejercicio 1
        int resultado = 0;
        resultado = suma(4,2, 5);
        System.out.println("Suma de 3 valores: "+resultado);

        //Ejercicio 2
        Coche miCoche = new Coche();
        miCoche.AgregarPuerta();
        System.out.println("\nPuertas en mi coche: "+ miCoche.puertas);
    }

    public static int suma(int a, int b, int c){
        return a+b+c;
    }
}

class Coche{
    public int puertas = 0;

    public void AgregarPuerta(){
        this.puertas++;
    }
}
