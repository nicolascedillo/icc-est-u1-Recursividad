public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Tareas deber = new Tareas();

        int sum = deber.sumaEnterosConsecutivos(100);
        System.out.println(sum);

        int potencia = deber.potencia(2, 5);
        System.out.println(potencia);

        int digitos = deber.sumaDeDigitos(6519);
        System.out.println(digitos);

        int fibonacci = deber.fibonaci(9);
        System.out.println(fibonacci);
    }
}
