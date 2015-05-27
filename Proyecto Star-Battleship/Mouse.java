import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mouse here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mouse  extends Actor
{
    /**
     * Act - do whatever the mouse wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int cont=0,encj=0,encb=0;
    private start start;
    private botton jug;
    private int numero=0;
   
  GreenfootSound music = new GreenfootSound("menu.mp3");
   
     public void act() 
    {
       
      
        jug=start.dameJug();
        
        cont++;
       
        if(Greenfoot.mouseMoved(null)) 
        {
            MouseInfo mouse = Greenfoot.getMouseInfo();
            setLocation(mouse.getX(), mouse.getY());
            getWorld().addObject(new logo(),300,100);
            
            if(numero==0){
            music.play();
        numero=1;
        }
        }
        if(Greenfoot.mouseClicked(null))
        {
           getWorld().removeObject(jug);
          //getWorld().removeObject();
            music.stop();
           getWorld().removeObject(this);     
           start.nivel1();  
           
        }
        else{   
                 Actor bot=getOneIntersectingObject(botton.class);
    }

    }  
     
    public void addedToWorld(World world) 
    {
        start = (start) world;        
    }
}
