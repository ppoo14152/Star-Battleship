import greenfoot.*;

/**
 * Escribe una descrición de la clase nivel1 aquí.
 * 
 * @autor (tu nombre) 
 * @versión (Un número de versión o una fecha)
 */
public class nivel extends Actor
{
   private int count=0;
    /**
     * Act - hace lo que nivel1 quiere hacer. Este método se llama "cuando quiera" o whenever
     * los botones 'Actuar or 'Ejecutar' son presionados en el entorno.
     */
    public void act() 
    {
        // Agrega tus códigos de acción aquí.
         setLocation(300,100);
       count ++;
     if(count ==200){
         World world;
           world = getWorld();
           world.removeObject(this);
           return;
    }    
    }    
}
