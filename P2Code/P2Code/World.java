import java.util.LinkedList;
import java.awt.Graphics;

public class World {

    private LinkedList<Continent> continents;

    public World(LinkedList<Continent> continents){
        this.continents = continents;
    }

    public void draw(Graphics g){
        for(int i = 0; i < continents.size(); i++){
            continents.get(i).draw(g);
        }
    }
}
