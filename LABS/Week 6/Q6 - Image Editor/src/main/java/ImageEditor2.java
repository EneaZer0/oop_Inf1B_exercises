import java.awt.*;

public class ImageEditor2 {



    public static Picture threshold(Picture p, int thresh) {
        Picture picture = new Picture(p.width(), p.height());
        if (p != null) {
            for (int col = 0; col < p.width(); col++) {
                for (int row = 0; row < p.height(); row++) {
                    if (ImageEditor1.luminance(p.get(col,row)) <= thresh) {
                        picture.set(col,row, Color.BLACK);
                    } else {
                        picture.set(col,row,ImageEditor1.toGrey(p.get(col,row)));
                    }
                }
            }
        }
        return picture;
    }


}
