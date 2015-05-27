import greenfoot.*;

/**
 * Write a description of class asteroide here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Asteroide extends Actor
{
    private int vida=4;
    private int timer = 0;
    /**
     * Act - do whatever the asteroide wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       move(-5);
       if (this.atWorldEdge()==true)
        {
           World world;
           world = getWorld();
          
           world.removeObject(this);
           return;
        }
        
 if(isTouching(Bala.class)){
    removeTouching(Bala.class);  
    vida=vida-1;
        
    }  
       
     if(vida==0){
        World world;
           world = getWorld();
           world.removeObject(this);
           return;
    }   
    
    if(isTouching(Nave.class)){
      getWorld().addObject(new explosion(),getX(), getY()); 
      getWorld().addObject(new fin(), 300,200);
      removeTouching(Nave.class);
    }    
        
    }    
    
    
    public boolean atWorldEdge()
    {
       { 
     if (getX() == 0) {
            return true;
     } else {
            return false;
     }
}
    }
}
