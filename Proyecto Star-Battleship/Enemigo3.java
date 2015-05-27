import greenfoot.*;

/**
 * Escribe una descrición de la clase enemigo3 aquí.
 * 
 * @autor (tu nombre) 
 * @versión (Un número de versión o una fecha)
 */
public class Enemigo3 extends Actor
{ int vida=3;
   private int counter=0;
    /**
     * Act - hace lo que enemigo3 quiere hacer. Este método se llama "cuando quiera" o whenever
     * los botones 'Actuar or 'Ejecutar' son presionados en el entorno.
     */
    public void act() 
    {  
        counter++;
       move(-2);
       if (this.atWorldEdge()==true)
        {
           World world;
           world = getWorld();
          
           world.removeObject(this);
           return;
        }
 
  if(isTouching(Nave.class)){
    removeTouching(Nave.class);
    getWorld().addObject(new explosion(),getX(), getY());
     getWorld().addObject(new fin(), 300,200);
    }    
        
if(isTouching(Bala.class)){
    removeTouching(Bala.class); 
    ((start)getWorld()).aumCounter();
    ((start)getWorld()).aumCounter();
    ((start)getWorld()).aumCounter();
    vida=vida-1;
        
    }    
        
    if (counter>20){
      getWorld().addObject(new balamala(), getX()-20, getY());
      counter=0;
    }
    
    if(vida==0){
        World world;
           world = getWorld();
           world.removeObject(this);
           return;
           
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
        // Agrega tus códigos de acción aquí.
    } 
        // Agrega tus códigos de acción aquí.
    }    

