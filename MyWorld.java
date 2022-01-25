import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class MyWorld here.
 * 
 * P3K Nicholas Tan
 */
public class MyWorld extends World
{
    public Object c = new Object();
    Counter counter = new Counter();
    Collision collision = new Collision();
    
    int randomizer;
    int time = 2000;
    Actor[] objs = {new A(), new B(), new C(),new D(),new E(),new F(),new G(),new H(),new I()
    ,new J(),new K(),new L(),new M(),new N(),new O(),new P(),new Q(),new R(),new S(),new T()
    ,new U(),new V(),new W(),new X(),new Y(),new Z()};
    boolean gameEnd = false;
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        addObject(collision, getWidth(), getHeight()-200);
        addObject(counter, getWidth()/2, getHeight()-100);
    }
    public void act()
    {
      objectSpeed();  
      settingUp();
      keys();
      if(gameEnd == true)
      {
        removeObject(objs[randomizer]);
        Greenfoot.setWorld(new EndScreen());
      }
    }
    public void objectSpeed()
    {
      if(counter != null && counter.time > 1900)
      {
        c.n = 1;       
      }
    }
    public void settingUp()
    {
        if(--time < 30)
        {
          showText("LOADING \nSCORES...", getWidth()/2, getHeight()-25);
        }
        if(time < 0)
        {
            removeObject(counter);
        }
    }
    public void started()
    {
        randomizer = Greenfoot.getRandomNumber(objs.length);
        addObject(objs[randomizer], getWidth() / 2, getHeight() / 2);
    }
    public void keys()
    {
      String key = Greenfoot.getKey();
      if(key != null && time < 1900)
      {
          int n = "abcdefghijklmnopqrstuvwxyz".indexOf(key);
          addObject(ending, getWidth() / 2 + 35, getHeight() / 2);
          if(n==randomizer && time < 1900)
          {
              counter.score += 2;
              removeObject(objs[randomizer]);
              c.move(-220);
              started();
          }
          if(n!=randomizer && time < 1900)
          {
             counter.score -= 1;
             c.move(20);
          }
      }   
    }
    public void touch()
    {
        gameEnd = true;
        removeObject(c);
        removeObject(collision);
    }
}
