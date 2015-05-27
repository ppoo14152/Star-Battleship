import greenfoot.*;
import java.util.*;
import java.awt.Color;

public class start extends World
{
    private int menu=0;
    private botton jug,back,reg;
    private int bandAr=1;
    private int bandAc;
    private Nave vida;
    private Counter cont1;

    /**
     * Constructor para objetos de clase start.
     * 
     */
    GreenfootSound music = new GreenfootSound("menu.mp3");
    public start()
    {    
        
        super(600, 400, 1); 
        menu();
        cont1 = new Counter();
        cont1.setPrefix("Puntos: ");
        addObject(cont1, 50, 20);
    }
    
    public void aumCounter()
    {
        cont1.add(1);
    }
    

    public void act()
    {
        
        
    }

    public void juego()
    {

    }

    public botton dameJug()
    {
        return jug;
    }

    public botton dameReg()
    {
        return reg;
    }

    public void menu()
    {
        bandAr=1;
        setBackground("space.jpg");
        jug=new botton("boJug.png");
        
        
        addObject(jug,273,238);
        addObject(new Mouse(),273,280);
        menu=1;
        
    }

    public void nivel1()
    {

        menu=0;
        bandAc=1;
        
        setBackground("space.jpg");
        addObject(new nivel(),300,100);
        addObject(new Nave(),100,200);

       
      
    }
}
