package poo;

import org.junit.Test;
import org.junit.Assert;


public class TestaTriangulo {
    @Test
    public void testarTriangulo(){
        Triangulo tri = new Triangulo();
        //Assert.assertEquals("10x1x2 não é um triângulo","Não é um triângulo", tri.tipo(10,1,2));
        Assert.assertEquals("6x6x6 é um triângulo equilátero","É um triângulo Equilátero",tri.tipo(6,6,6));
        //Assert.assertEquals("6x4x4 é um triângulo Isósceles","É um triângulo Isósceles",tri.tipo(6,4,4));
        //Assert.assertEquals("4x4x6 é um triângulo Isósceles","É um triângulo Isósceles",tri.tipo(4,4,6));
        //Assert.assertEquals("4x4x6 é um triângulo Isósceles","É um triângulo Isósceles",tri.tipo(4,6,4));
        //Assert.assertEquals("-6x6x6 não é um triângulo","Não insira números negativos",tri.tipo(-6,6,4));

    }

}
