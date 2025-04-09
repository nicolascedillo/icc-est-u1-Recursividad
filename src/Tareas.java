public class Tareas{

    public int sumaEnterosConsecutivos (int n){
        if (n == 1){
            return 1;
        } 
        return n + sumaEnterosConsecutivos(n-1);
    }

    public int potencia (int base, int exponente){
        if (exponente == 0){
            return 1;
        } else if( exponente == 1){
            return base;
        }
        return base * potencia(base, exponente-1);
    }

    public int sumaDeDigitos (int n){
        if (n < 10){
            return n;
        }
        int ultimo = n % 10;
        return ultimo + sumaDeDigitos(n/10);
    }

    public int llamadasRecursivas = 1;
    public int sumaConsecutivosProfe(int n){

        int idActual = llamadasRecursivas++;
        System.out.println("Llamada a " + idActual + " con número n = "+ n);
        if (n == 1){
            System.out.println("LLamada a " + idActual + " caso alcanzado n = 1");
            return 1;
        }
        System.out.println("LLamada a " + idActual + " llamado recursivamente con n= " + (n-1));
        int resultadoParcial = sumaConsecutivosProfe(n-1);

        int resultado = n + resultadoParcial;
        System.out.println("Llamada a " + idActual + " sumando " + n + " al resultado de " + resultadoParcial + " = " + resultado);
        System.out.println("LLamada a " + idActual + " retono " + resultado);
        return resultado;
    }

    public int fibonaci (int n){
        if (n==0 || n==1){
            return n;
        }
        return fibonaci(n-1) + fibonaci(n-2);
    }
}