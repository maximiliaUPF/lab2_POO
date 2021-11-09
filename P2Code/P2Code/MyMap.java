import java.util.LinkedList;

public class MyMap extends javax.swing.JPanel {

    private World myWorld;

    private void initComponents() {
            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
            this.setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 1000, Short.MAX_VALUE)
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 1000, Short.MAX_VALUE)
            );
        }

    public MyMap() {
        initComponents();

        LinkedList< Point > points1 = new LinkedList< Point >();
        points1.add(new Point( 10, 100 ));
        points1.add(new Point( 150, 10 ));
        points1.add(new Point( 290, 100 ));
        points1.add(new Point( 290, 200 ));
        points1.add(new Point( 150, 290 ));
        points1.add(new Point( 10, 200));

        PolygonalRegion region1 = new PolygonalRegion( points1 );
        System.out.println( "The area of region1 is "+ region1.getArea());


        LinkedList< Point > points2 = new LinkedList< Point >();
        points2.add( new Point( 200, 300 ) );
        points2.add( new Point( 350, 300 ) );
        points2.add( new Point( 490, 400 ) );
        points2.add( new Point( 490, 500 ) );
        points2.add( new Point( 350, 390 ) );
        points2.add(new Point( 200, 400));

        PolygonalRegion region2 = new PolygonalRegion( points2 );
        System.out.println( "The area of region2 is "+ region2.getArea());


        LinkedList<PolygonalRegion> countries_list1 = new LinkedList<PolygonalRegion>();
        countries_list1.add(region1);
        countries_list1.add(region2);

        Continent continent1 = new Continent(countries_list1);
        System.out.println( "The total area of continent1 is "+ continent1.getTotalArea());



        LinkedList< Point > points3 = new LinkedList< Point >();
        points3.add( new Point( 650, 500 ) );
        points3.add( new Point( 750, 600 ) );
        points3.add( new Point( 800, 650 ) );
        points3.add( new Point( 800, 700 ) );
        points3.add( new Point( 750, 700 ) );
        points3.add(new Point( 650, 600));

        PolygonalRegion region3 = new PolygonalRegion( points3 );
        System.out.println( "The area of region3 is "+ region3.getArea());


        LinkedList< Point > points4 = new LinkedList< Point >();
        points4.add( new Point( 750, 700 ) );
        points4.add( new Point( 850, 800 ) );
        points4.add( new Point( 900, 850 ) );
        points4.add( new Point( 900, 900 ) );
        points4.add( new Point( 850, 800 ) );
        points4.add(new Point( 750, 700));

        PolygonalRegion region4 = new PolygonalRegion( points4 );
        System.out.println( "The area of region4 is "+ region4.getArea());


        LinkedList<PolygonalRegion> countries_list2 = new LinkedList<PolygonalRegion>();
        countries_list2.add(region3);
        countries_list2.add(region4);

        Continent continent2 = new Continent(countries_list2);
        System.out.println( "The total area of continent2 is "+ continent2.getTotalArea());


        LinkedList<Continent> thisWorld = new LinkedList<Continent>();
        thisWorld.add(continent1);
        thisWorld.add(continent2);

        myWorld = new World(thisWorld);
    }

    public void paint( java.awt.Graphics g ) {
        super.paint( g );
        myWorld.draw( g );
    }
}

