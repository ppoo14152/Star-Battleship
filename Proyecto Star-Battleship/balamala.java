import greenfoot.*;

/**
 * Write a description of class balamala here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class balamala extends Actor
{
    /**
     * Act - do whatever the balamala wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
      
        move(-4);
       if (this.atWorldEdge()==true)
        {
           World world;
           world = getWorld();
           world.removeObject(this);
           return;
        }
        
     
    } 
       
    public boolean atWorldEdge()
    {
       { 
     if (getX() == 0) 
     {
            return true;
     } else 
     {
            return false;
     }
    }
        // Agrega tus códigos de acción aquí.
    }    
    
    }   