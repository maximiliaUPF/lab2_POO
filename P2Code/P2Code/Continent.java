import java.util.LinkedList;
import java.awt.Graphics;

public class Continent {
    
    private LinkedList<PolygonalRegion> countries;

    public Continent(LinkedList<PolygonalRegion> countries){
        this.countries = countries;
    }

    public LinkedList<PolygonalRegion> getPolygonalRegions(){
        return countries;
    }

    public void setPolygonalRegions(LinkedList<PolygonalRegion> conts){
        this.countries = conts;
    }

    public double getTotalArea(){
        double total_area = 0;
        for(int i = 0; i < countries.size(); i++){
            total_area = total_area + countries.get(i).getArea();
        }
        return total_area;
    }

    public void draw(Graphics g){
        for(int i = 0; i < countries.size(); i++){
            countries.get(i).draw(g); 
        }
    }
}