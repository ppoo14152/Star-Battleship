import greenfoot.*;

/**
 * Write a description of class fin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fin extends Actor
{
    private botton jug;
    public int rest=0;
    /**
     * Act - do whatever the fin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    { 
        setLocation(300,200);
        
        // Reg=new botton("boJug.png");
         /*getWorld().addObject(Reg,273,238);
         getWorld().addObject(new Mouse(),273,280);*/
       //  Greenfoot.setWorld(new Puntaje(rest));
         
        // Greenfoot.delay(50);
         if (Greenfoot.isKeyDown ("r"))  {
   Greenfoot.setWorld(new start());
        
}
         
         //Greenfoot.stop();
         
    }    
     
}