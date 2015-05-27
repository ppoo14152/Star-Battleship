import greenfoot.*;

/**
 * Write a description of class nivel3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class nivel3 extends Actor
{
    
       int count=0;
    /**
     * Act - do whatever the nivel wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        setLocation(300,100);
        count ++;
        removeTouching(start.class);
     if(count ==200){
         World world;
           world = getWorld();

           world.removeObject(this);
           return;
    }    
}}
  