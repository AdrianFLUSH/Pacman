import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pacmanlvl1 extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    Pacman pacman = new Pacman();
    public Pacmanlvl1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(pacman,300,250);
        for(int x = 36; x < 650; x+=72){
            this.addObject(new wall(), x, 23);
        }
        for(int x = 36; x < 650; x+=72){
            this.addObject(new wall(), x, 380);
        }
        for(int y = 79; y < 180; y+=55){
            this.addObject(new wall(), 36, y);
        }
        for(int y = 79; y < 180; y+=55){
            this.addObject(new wall(), 570, y);
        }
        for(int y = 280; y < 380; y+=55){
            this.addObject(new wall(), 570, y);
        }
        for(int y = 280; y < 380; y+=55){
            this.addObject(new wall(), 36, y);
        }
        for(int x = 200; x < 430; x+=72){
            this.addObject(new wall(), x, 150);
        }
        addObject(new wall(), 200, 200);
        addObject(new wall(), 416, 200);
        addObject(new pildora(), 130, 80);
        addObject(new pildora(), 190, 80);
        addObject(new pildora(), 250, 80);
        addObject(new pildora(), 330, 80);
        addObject(new pildora(), 400, 80);
        addObject(new pildora(), 130, 310);
        addObject(new pildora(), 190, 310);
        addObject(new pildora(), 250, 310);
        addObject(new pildora(), 330, 310);
        addObject(new pildora(), 400, 310);
        addObject(new pill(), 120, 200);
        addObject(new pill(), 490, 90);
        addObject(new banana(), 490, 200);
        addObject(new cherrie(), 490, 300);

    }

    public void act() 
    {
       showText("Score: " + pacman.Score(),400,30);
    } 
}
