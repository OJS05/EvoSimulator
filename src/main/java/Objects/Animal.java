package Objects;

import processing.core.PImage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public interface Animal {

    int getX();
    int getY();

    Collection mobs = new ArrayList();

    PImage getImage();

    default boolean checkCollision(){
        for (mobs.size():){
            if(){

            }
        }
    }

    default void onDraw(){
        for(Objects objects: ){

        }
    }

    default void drawObject(){

    }
}
