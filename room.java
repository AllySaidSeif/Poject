
/**
 * Write a description of class room here.
 *
 * @author (Ally,BITA/6/22/061/TZ)
 * @version (a version number or a date)
 */
public class room
{
   private double width;
   private double length;
   private int floor;
   
   public room()
   {
       this.width = 10;
       this.length = 12.5;
       this.floor = 1;
   }
   public void setWidth(double width)
   {
       if(width>0)
       {
           this.width = width;
       }
   }
   public double getWidth()
   {
       return width;
   }
   public void setLength(double length)
   {
      if(length>0)
      {
           this.length = length;
      }
   }
   public double length()
   {
       return length;
   }
   public void setFloor(int floor)
   {
       this.floor = floor;
   }
   public int getFloor()
   {
       return floor;
   }
   public room(double param1,double param2,int floor)
   {
       setLength(Math.max(param1,param2));
       setWidth(Math.min(param1,param2));
       this.floor = floor;
   }
   public String toString()
   {
       return length + "x" +width+ ",floor" + floor;
   }
}