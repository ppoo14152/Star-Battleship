import greenfoot.*;

/**
 * Escribe una descrición de la clase logo aquí.
 * 
 * @autor (tu nombre) 
 * @versión (Un número de versión o una fecha)
 */

public class logo extends Actor
{
    private int contador=0;
    /**
     * Act - hace lo que logo quiere hacer. Este método se llama "cuando quiera" o whenever
     * los botones 'Actuar or 'Ejecutar' son presionados en el entorno.
     */
    public void act() 
    {
        // Agrega tus códigos de acción aquígetWorld().removeObject();
        contador++;
        if(contador==60)
        getWorld().removeObject(this);
    }    
}
