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
}