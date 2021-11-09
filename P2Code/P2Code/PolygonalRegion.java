import java.util.LinkedList;
import java.awt.Graphics;

public class PolygonalRegion {

    private LinkedList<Point> points;

    public PolygonalRegion(LinkedList<Point> points){
        this.points = points;
    }

    public double getArea(){
        double[][] matrix = new double[points.size()][2];
        double result1 = 0;
        double result2 = 0;

        for(int i = 0; i < points.size(); i++){
            matrix[i][0] = points.get(i).getx();
            matrix[i][1] = points.get(i).gety();
        }

        for(int i = 0; i < points.size() - 1; i++){
            result1 += matrix[i][0] * matrix[1][i+1];
        }

        for(int i = 0; i < points.size() - 1; i++){
            result1 += matrix[i+1][0] * matrix[1][i];
        }

        double finalResult = 0.5 * (result1 - result2);

        return finalResult;
    }

    public void draw(Graphics g){
        int [] xArray = new int[points.size()];
        int [] yArray = new int[points.size()];

        for(int i = 0; i < points.size(); i++){
            xArray[i] = (int) points.get(i).getx();
            yArray[i] = (int) points.get(i).gety();
        }
        
        g.drawPolygon(xArray, yArray, points.size());
    }
}