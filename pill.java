import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pill here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pill extends Item
{
    /**
     * Act - do whatever the pill wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public pill()
    {
        setImage("images/pill.png");
    }
    public int Score()
    {
       return 50; 
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
