import java.awt.Color;


public class ImageEditor1 {

    public static double luminance (Color color) {
        double luminance = 0.299 * color.getRed() + + 0.587 * color.getGreen() + 0.114 * color.getBlue();
        return luminance;
    }

    public static Color toGrey (Color color) {
        int grey = (int) Math.round(luminance(color));
        Color final_color = new Color(grey, grey, grey);
        return final_color;
    }

    public static Picture makeGreyscale (Picture pic) {
        Picture picture = new Picture(pic.width(), pic.height());
        if (pic != null) {
            for (int col = 0; col < pic.width(); col++) {
                for (int row = 0; row < pic.height(); row++) {
                    picture.set(col,row,toGrey(pic.get(col,row)));
                }
            }
        }
        return picture;
    }


    public static void main(String[] args) {
        Picture p = new Picture("lion2.jpg"); // or use any other colour image
        Picture greyscale = makeGreyscale(p);
        greyscale.show();

        Picture t = ImageEditor2.threshold(p, 120);
        t.show();

    }

}
