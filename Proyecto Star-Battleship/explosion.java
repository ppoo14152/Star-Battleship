import greenfoot.*;

/**
 * Escribe una descrición de la clase explosion aquí.
 * 
 * @autor (tu nombre) 
 * @versión (Un número de versión o una fecha)
 */
public class explosion extends Actor
{
   private int count=0;
    /**
     * Act - hace lo que explosion quiere hacer. Este método se llama "cuando quiera" o whenever
     * los botones 'Actuar or 'Ejecutar' son presionados en el entorno.
     */
    public void act() 
    {
     count ++;
        if(count ==30)
        {
        World world;
        GreenfootSound music = new GreenfootSound("explosion.mp3");
       music.play();
           world = getWorld();
           world.removeObject(this);
           return;
}
}}
