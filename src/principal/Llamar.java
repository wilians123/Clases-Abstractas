/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author HUAWEI
 */
public class Llamar extends Planas{

    @Override
    public double triangulo(double area, double base) {
        return 2*(area/base);   
    }

    @Override
    public double rectangulo(double ancho, double largo) {
        return ancho*largo;   
    }

    @Override
    public double cuadrado(double lados) {
        return lados*lados;    
    }

    @Override
    public double cubo(double arista) {
        return Math.pow(arista, 2);   
    }

    @Override
    public double cilindro(double base, double altura) {
        return Math.PI*Math.pow(base, altura);   
    }

    @Override
    public double cono(double base, double altura) {
        return (1.0/3.0)*base*altura;   
    }
    
}
