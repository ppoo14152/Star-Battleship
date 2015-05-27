import greenfoot.*;

/**
 * Write a description of class bala here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bala extends Actor
{
    private int coo=0;
    /**
     * Act - do whatever the bala wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        move(10);
       if (this.atWorldEdge()==true)
        {
           World world;
           world = getWorld();
           world.removeObject(this);
           return;
        }
     
     if(isTouching(Enemigo.class)){
      removeTouching(Enemigo.class);
      
       getWorld().addObject(new explosion(),getX(), getY());
       ((start)getWorld()).aumCounter();
        
    }    
    } 
       
    public boolean atWorldEdge()
    {
        if (getX() > getWorld().getWidth() - getImage().getWidth() || getY() > getWorld().getHeight() - getImage().getHeight())    
     
        {    
            return true;    
        }    
        else   
        {    
            return false;
        }    
    }
    
    }