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
public class circle implements Shape{
    private double radius;

    public circle()
    {
        this.radius=5;
        
    }
    public circle(double r)
    {
        this.radius=r;
     
    }
    
    @Override
      public double area()
      {
        double radius =this.radius;

        return (Math.PI*radius*radius);
   
      }
    @Override
      public double perimeter()
      {
        double radius =this.radius;

        return (Math.PI*radius*2);
          
      }
    
}
