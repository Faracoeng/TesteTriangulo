package poo;

public class Triangulo {
    private int aux = 0;
    public String tipo(int a, int b, int c){

        if(a <=0  || b <=0 || c <= 0){
            return "Não é um triângulo";
        }

        if (a > (b + c)){
                return "Não é um triângulo";
        }


       //------------------------------------------

        if(a == b && b == c){
            return "É um triângulo Equilátero";
        }

        else if(a != b && b != c && c !=a ){
            return "É um triângulo Escaleno";
        }
        //-----------------------------------------

        return "É um triângulo Isósceles";

    }
}
