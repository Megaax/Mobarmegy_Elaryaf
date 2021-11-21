/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14;

/**
 *
 * @author MEGAA
 */
public class JavaApplication14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Shape circle   = new circle(5);
        Shape recagle  = new rectangle(10, 20);
        Shape triangle = new triangle(15, 10, 5);
        
        System.out.println("Area of circle = "+circle.area());
        System.out.println("Area of rectangle = "+recagle.area());
        System.out.println("Area of triangle = "+triangle.area());
        
        System.out.println("perimeter of circle = "+circle.perimeter());
        System.out.println("perimeter of rectangle = "+recagle.perimeter());
        System.out.println("perimeter of triangle = "+triangle.perimeter());
    }
    
}
