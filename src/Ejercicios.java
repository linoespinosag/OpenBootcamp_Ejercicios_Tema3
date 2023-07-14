public class Ejercicios {

    public static void main(String[] args) {

        triple_suma(2,3,4);


        Coche miCoche = new Coche();
        miCoche.add_door();
        System.out.println(miCoche.puertas);




    }

    public static void triple_suma (int a, int b, int c) {
        int resultado = a + b + c;
        System.out.println("Si sumas " + a + ", " + b + " y " + c + " obtienes " + resultado);
    }
}

class Coche {
    public int puertas=3;

    public void add_door() {
        this.puertas++;
    }

}
