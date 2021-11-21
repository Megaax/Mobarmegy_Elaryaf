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
public class rectangle implements Shape{
      private double height;
    private double width;

    public rectangle()
    {
        this.height=this.width=10;
        
    }
    public rectangle(double h, double w)
    {
        this.height=h;
        this.width=w;
    }
    
    @Override
      public double area()
      {
        double h =this.height;
        double w =this.width;

       double area=h*w;
       return area;
          
      }
    @Override
      public double perimeter()
      {
        double h =this.height;
        double w =this.width;

       double premiter=2*(h + w);
       return premiter;
          
      }

}
