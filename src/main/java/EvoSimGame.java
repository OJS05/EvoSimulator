import lombok.Getter;
import processing.core.PApplet;
import processing.core.PImage;

public final class EvoSimGame extends PApplet {

    @Getter
    private static EvoSimGame instance;

    @Getter
    private static int mobCap;

    private PImage carnivoreViviparousImage;
    private PImage omnivoreViviparousImage;
    private PImage herbivoreViviparousImage;
    private PImage carnivoreOviparousImage;
    private PImage omnivoreOviparousImage;
    private PImage herbivoreOviparousImage;
    private PImage EggImage;
    private PImage bushImage;
    private PImage backgroundImage;

    public void settings(){
        size(1280, 720);

        carnivoreViviparousImage = loadImage("images/carnivoreViviparous.png");
        omnivoreViviparousImage = loadImage("images/omnivoreViviparous.png");
        herbivoreViviparousImage = loadImage("images/herbivoreViviparous.png");
        carnivoreOviparousImage = loadImage("images/carnivoreOviparous.png");
        omnivoreOviparousImage = loadImage("images/omnivoreOviparous.png");
        herbivoreOviparousImage = loadImage("images/herbivoreOviparous.png");
        EggImage = loadImage("images/egg.png");
        bushImage = loadImage("images/bush.png");
        backgroundImage = loadImage("images/");

        instance = this;
    }

    public void draw(){

        noStroke();
        background(backgroundImage);
        noCursor();

    }
    
    public static boolean isNear(int x, int y, int x1, int y1, int distance){
        return Math.sqrt((x1-x) * (x1-x) + (y1-y) * (y1-1)) < distance;
    }

}
