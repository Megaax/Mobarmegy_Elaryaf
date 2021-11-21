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
public class triangle implements Shape{
    
    private double height;
    private double base;
    private double hyp; 
    public triangle()
    {
        this.base=5;
        this.height=10;
    }
    public triangle(double  h, double b,double hy)
    {
        this.base=b;
        this.height=h;
        this.hyp=hy;
    } 
    
    @Override
      public double area()
      {
        double base =this.base;
        double height =this.height;


        return (base*height/2);
   
      }
    @Override
      public double perimeter()
      {
        double base =this.base;
        double height =this.height;
        double hyp=this.hyp;
        
        return (base+height+hyp);
          
      }
}
