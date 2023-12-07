import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleScreen extends World
{

    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Label titleLabel = new Label("Hungry Kangaroo", 55);
        addObject(titleLabel, getWidth()/2 + 50, getHeight()/2 - 60);
        prepare();
    }
    
    public void act()
    {
        // Start game if user presses space bar
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    private void prepare()
    {
        Kangaro kangaroo = new Kangaro();
        addObject(kangaroo, 90, getHeight()/2 + 50);
        Label label1 = new Label("Press Space to Play!", 35);
        addObject(label1, getWidth()/2 + 50, getHeight()/2 - 15);
        Label label2 = new Label("Use a and d to Move", 30);
        addObject(label2, getWidth()/2 + 60, getHeight()/2 + 20);
    }
}
