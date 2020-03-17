import java.awt.Color;


class Voronoi {

    public static double pointDist(Point2D point1, Point2D point2) {
        // ADD CODE HERE
        double x_value = point2.getX() - point1.getX();
        double y_value = point2.getY() - point1.getY();
        double distance = Math.sqrt(x_value*x_value + y_value*y_value);
        return distance;
    }

    public static int findClosestPoint(Point2D point, Point2D[] sites) {
        // ADD CODE HERE
        int index = 0;
        if (sites.length != 0){
            double min_distance = pointDist(point,sites[0]);
            for (int i = 0; i < sites.length; i++){
                if (pointDist(point,sites[i]) <= min_distance){
                    min_distance = pointDist(point,sites[i]);
                    index = i;
                }
            }
        }

        return index;
    }

    public static int[][] buildVoronoiMap(Point2D[] sites, int width, int height) {
        // ADD CODE HERE
        int[][] indexmap = new int[width][height];
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                Point2D point = new Point2D(i,j);
                indexmap[i][j] = findClosestPoint(point, sites);
            }
        }
        return indexmap;
    }

    public static void plotVoronoiMap(Point2D[] sites, Color[] colors, int[][] indexMap) {
        // ADD CODE HERE
        int width = indexMap.length;
        int height = indexMap[0].length;

        StdDraw.setCanvasSize(width, height);
        StdDraw.setXscale(0, width);
        StdDraw.setYscale(0, height);

        for (int w = 0; w < width; w++) {
            for (int h = 0; h < height; h++){
                StdDraw.setPenColor(colors[indexMap[w][h]]);
                StdDraw.point(w,h);
            }
        }

        for (int i = 0; i < sites.length; i++) {
            StdDraw.setPenColor(StdDraw.BLACK);
            StdDraw.filledCircle(sites[i].getX(), sites[i].getY(),3);
        }
    }

    public static void main(String[] args) {
        int width = 200;
        int height = 200;

        int nSites = 5;
        Point2D[] sites = new Point2D[nSites];
        sites[0] = new Point2D(50, 50);
        sites[1] = new Point2D(100, 50);
        sites[2] = new Point2D(50, 100);
        sites[3] = new Point2D(125, 50);
        sites[4] = new Point2D(100, 175);

        Color[] colors = new Color[nSites];
        colors[0] = Color.BLUE;
        colors[1] = Color.GREEN;
        colors[2] = Color.YELLOW;
        colors[3] = Color.ORANGE;
        colors[4] = Color.MAGENTA;

        int[][] indexmap = buildVoronoiMap(sites, width, height);
        plotVoronoiMap(sites, colors, indexmap);

    }

}