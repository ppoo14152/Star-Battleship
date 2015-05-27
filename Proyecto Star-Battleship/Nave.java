import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
import java.awt.Color;

/**
 * Escribe una descrición de la clase nave aquí.
 * 
 * @autor (tu nombre) 
 * @versión (Un número de versión o una fecha)
 */
public class Nave extends Actor
{   int x=200;
    int y=200;
    public int vida=3;
    private int timer=0;
    private int counter=0;
    private int counters=0;
    private int count=0;
    private int counts=0;
    private int c=0;
    public int co=0;
    private int co1=0;
    /**
     * Act - hace lo que nave quiere hacer. Este método se llama "cuando quiera" o whenever
     * los botones 'Actuar or 'Ejecutar' son presionados en el entorno.
     */
    
    public void act()
    { 
    timer++;
    counter++;
    count++;
    counters++;
    counts++;
    c++;
    co++;
    
   // ((start)getWorld()).aumCounter();

    if(vida==0){
        World world;
          getWorld().addObject(new fin(), 300,200);
          getWorld().addObject(new explosion(),getX(), getY());
          world = getWorld();
           world.removeObject(this);   
           return; 
        }
        if(isTouching(Asteroide.class))
        {
            getWorld().addObject(new explosion(),getX(), getY());
        }
        
 if(isTouching(Enemigo.class))
 {
     getWorld().addObject(new explosion(),getX(), getY());
     
    }
    
 if(isTouching(Enemigo3.class))
 {
     getWorld().addObject(new explosion(),getX(), getY());
    }
     
 if(isTouching(Enemigo2.class)){
     getWorld().addObject(new explosion(),getX(), getY());
    }
        
    if (counters==3550){
        getWorld().addObject(new nivel2(), 300, 100);
    }
    
    if (counters==7200){
        getWorld().addObject(new nivel3(), 300, 100);

    }

   if(isTouching(balamala.class))
   {
      vida=vida-1;
       removeTouching(balamala.class);
      
    }    
  

     if (count > 100)
   //spawn a Goat every 400 act-cycles (about 7 seconds with speed at 50)
   {
       
      getWorld().addObject(new Asteroide(), 600, Greenfoot.getRandomNumber(370));
      count=0;
   }
    
    if (count > 150)
   //spawn a Goat every 400 act-cycles (about 7 seconds with speed at 50)
   {
       
      getWorld().addObject(new Asteroide(), 600, Greenfoot.getRandomNumber(370));
      count=0;
   }
       
   if (counts > 3600 && counts <=7200 ){
      
   if (counter > 90)
   //spawn a Goat every 400 act-cycles (about 7 seconds with speed at 50)
   {
       
      getWorld().addObject(new Enemigo3(), 600,Greenfoot.getRandomNumber(350));
      counter=0;
   }}    
   
   
    if (counters == 7300)
    
   //spawn a Goat every 400 act-cycles (about 7 seconds with speed at 50)
   {
       
      getWorld().addObject(new Enemigo2(), 600,250 );
      
   }
  
   if (counts<=3500)
   {   
   if (timer > 100)
   //spawn a Goat every 400 act-cycles (about 7 seconds with speed at 50)
   {
       
      getWorld().addObject(new Enemigo(), 600, Greenfoot.getRandomNumber(350));
      timer=0;
   }
}
   
   if (Greenfoot.isKeyDown ("space") && counter>10){
       getWorld().addObject(new Bala(), getX()+10, getY());
       GreenfootSound music = new GreenfootSound("disparo.mp3");
       music.play();
       counter=0;
    }
   
     if (Greenfoot.isKeyDown ("right"))  {
   setLocation(getX() +5, getY());
        
}
if (Greenfoot.isKeyDown ("left"))  {
   setLocation(getX()-5, getY());
        
}
       
if (Greenfoot.isKeyDown ("down"))  {
   setLocation(getX(), getY()+5);
        
}
if (Greenfoot.isKeyDown ("up"))  {
  setLocation(getX(), getY()-5);
        
}

}
public boolean atWorldEdge()
{
    {
        if(vida==0){
        return false;
    }else
        {
        return true;
    }
    }
}
}