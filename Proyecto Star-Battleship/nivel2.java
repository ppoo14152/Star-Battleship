import greenfoot.*;

/**
 * Write a description of class nivel2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class nivel2 extends Actor
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
     if(count ==200){
         World world;
           world = getWorld();
           world.removeObject(this);
           return;
    }    
}}
