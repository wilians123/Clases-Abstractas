/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal;

/**
 *
 * @author HUAWEI
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Llamar figura = new Llamar ();
        
        
        //FIGURAS PLANAS
        System.out.println("***FIGURAS PLANAS***");
        System.out.println("La altura del triangulo es: "+(figura.triangulo(12, 23)));
        System.out.println("El area del rectangulo es: "+(figura.rectangulo(12, 11)));
        System.out.println("El volumen del cono es: "+(figura.cuadrado(4)));
        
        System.out.println("");
        
        
        //FIGURAS VOLUMETRICAS
        System.out.println("***FIGURAS VOLUMETRICAS***");
        System.out.println("El volumen del cono es: "+(figura.cubo(23)));
        System.out.println("El area del cilindro es: "+(figura.cilindro(10, 13)));
        System.out.println("El volumen del cono es: "+(figura.cono(1, 22)));
        
    }
    
}
