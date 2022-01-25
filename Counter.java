import greenfoot.*;  
public class Counter extends Actor
{
    int score = 0;
    int time = 4000;
    Object c;
    public Counter()
    {
       setImage(new GreenfootImage("Time Elapsed:"+ --time/60+"\nSpeed : "+c.n+" km/h"+"\n Score:"+score,25,Color.BLACK,new Color(0,0,15,15)));
    }
    
    public void act() 
    {
       if(time < 0)
       {
            time = 0;
       }
       setImage(new GreenfootImage("Time Elapsed:"+ --time/60+"\nSpeed : "+c.n+" km/h"+"\n Score:"+score,25,Color.BLACK,new Color(0,0,15,15)));
       if(time == 0)
       {
          MyWorld world = (MyWorld) getWorld();
          Greenfoot.setWorld(new EndScreen()); 
       }
       getScore();
    } 
    
     public int getScore()
    {
        return score;
    }
}