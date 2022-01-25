import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Object extends Actor
{
    int time = 2000;
    int count = 0;
    int timer;
    static int n = 1;
    Counter counter;
    public void act()
    {
        time--;
        if(time < 1900)
        {
            move(n);
            if(++count % 335 == 0)
            {
              n++;
            }   
        }
        //If it touches the red dot or timer runs out
        if(isTouching(Collision.class) && ++timer > 10)
        {
              MyWorld world1 = (MyWorld) getWorld();
              world1.touch();
        }
    }
}
