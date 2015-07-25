import java.awt.*;
public class Ball extends Polkadot
   {
      private double dx;       // pixels to move each time step() is called.
      private double dy;
    // constructors
       public Ball()         //default constructor
      {
         super(200, 200, 50, Color.BLACK);
         dx = Math.random() * 12 - 6;          // to move vertically
         dy = Math.random() * 12 - 6;          // to move sideways
      }
       public Ball(double x, double y, double dia, Color c)
      {
         super(x, y, dia, c);
         dx = Math.random()* 12 - 6;
         dy = Math.random() * 12 - 6;
      }
      
     //modifier methods 
       public void setdx(double x)        
      {
         dx = x;
      }
       public void setdy(double y)
      {
         dy = y;
      }
      
      //accessor methods
       public double getdx()             
      {
         return dx;
      }
       public double getdy()
      {
         return dy;
      }
      
      
     //instance methods
       public void move(double rightEdge, double bottomEdge)
      {
         setX(getX()+ dx);                  // move horizontally
                
         if(getX() >= rightEdge - getRadius())  //hit right edge
         {
            setX(rightEdge - getRadius());
            setdx(dx * -1); 
         }
        /* more code goes here  */
        else if (getX() < 0 + getRadius())
        {
            setX(0+getRadius());
            setdx(dx * -1);
            
        }
        setY(getY()+ dy);                  // move vertically
        
        if(getY() >= bottomEdge - getRadius())
        {
            setY(bottomEdge-getRadius());
            setdy(dy * -1);
        }
        
        else if (getY() < 0 + getRadius())
        {
            setY(0+getRadius());
            setdy(dy*-1);
        }

      }
   }