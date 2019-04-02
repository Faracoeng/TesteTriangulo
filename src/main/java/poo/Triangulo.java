package poo;

public class Triangulo {
    private int aux = 0;
    public String tipo(int a, int b, int c){

        //--------------------------------------------
        // Verificando se é um triângulo

        if(a <=0  || b <=0 || c <= 0){
            return "Não é um triângulo";
        }

        else if (a > (b + c)){
                return "Não é um triângulo";
        }
        else if (b > (c + a)){
            return "Não é um triângulo";
        }
        else if (c > (a + b)){
            return "Não é um triângulo";
        }


        //------------------------------------------------
        //Equilátero e Escaleno

        else if(a == b && b == c){
            return "É um triângulo Equilátero";
        }

        else if(a != b && b != c && c !=a ){
            return "É um triângulo Escaleno";
        }
        //-------------------------------------------------
        //Se não for nenhum dos anteriores será  Isósceles

        return "É um triângulo Isósceles";

    }
}
