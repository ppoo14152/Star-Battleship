import greenfoot.*;

/**
 * Escribe una descrición de la clase enemigo aquí.
 * 
 * @autor (tu nombre) 
 * @versión (Un número de versión o una fecha)
 */
public class Enemigo extends Actor
{   int vida=1;
    int counter=0;
    public int puntos=0;
    /**
     * Act - hace lo que enemigo quiere hacer. Este método se llama "cuando quiera" o whenever
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
 
  if (counter>60){
      getWorld().addObject(new balamala(), getX()-20, getY());
      counter=0;
    }
    
if(isTouching(Nave.class)){
    removeTouching(Nave.class);
        getWorld().addObject(new fin(), 300,200);
        getWorld().addObject(new explosion(),getX(), getY());
       
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
}
