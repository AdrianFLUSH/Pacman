import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pacman here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pacman extends Actor
{
    /**
     * Act - do whatever the Pacman wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    private int currentImage;
    private int counter;
    private int Score;

    public Pacman()
    {
        setImage("images/pacman-close.png");
    }

    public void act() 
    {
        moveMouth();

        handleDirection();
        comer();
    }  

    public void handleDirection()
    {
        int x = getX();
        int y = getY();
        int OFFSET = 6;

        if(isAtEdge() && x < 36)
        {
            x = 500;
        }
        if(isAtEdge() && x > 500)
        {
            x = 36;
        }

        
        if(Greenfoot.isKeyDown("right"))
        {
            Actor collide=getOneObjectAtOffset(38,0,wall.class);
            if(collide!=null)
                OFFSET=0; 
            setLocation(x + OFFSET, y);
        }
        else if(Greenfoot.isKeyDown("left"))
        {
            Actor collide=getOneObjectAtOffset(-38,0,wall.class);
            if(collide!=null)
                OFFSET=0; 
            setLocation(x - OFFSET, y);
        }
        else if(Greenfoot.isKeyDown("up"))
        {
            Actor collide=getOneObjectAtOffset(0,-38,wall.class);
            if(collide!=null)
                OFFSET=0; 
            setLocation(x , y - OFFSET);
        }
        else if(Greenfoot.isKeyDown("down"))
        {
            Actor collide=getOneObjectAtOffset(0,38,wall.class);
            if(collide!=null)
                OFFSET=0; 
            setLocation(x , y + OFFSET);
        }
    }

    public void moveMouth()
    {
        if(counter==0)
        {
            if(currentImage==0)
            {
                setImage("images/pacman-close.png");
            }else if(currentImage==1)
            {
                setImage("images/pacman-open.png");
            }
            currentImage = (currentImage + 1) % 2;
        }
        counter = (counter + 1)%10;
    }
    
    public void comer()
    {
        if(isTouching(Item.class)){
            Item item=(Item)getOneIntersectingObject(Item.class);
            Score+=item.Score();
            removeTouching(Item.class);
        }
    }
    public int Score()
    {
        return Score;
    }
    
}
