import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
public class StartScreen extends World
{   
    public StartScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
    }
    public void prepare()
    {
        StartScreen pressSpace = new StartScreen();
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        Greenfoot.setWorld(new MyWorld());
    }
}
