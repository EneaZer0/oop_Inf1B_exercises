public class Vector3D {

    private double x_axis;
    private double x;
    private double y_axis;
    private double y;
    private double z_axis;
    private double z;

    public Vector3D(double x, double y, double z) {
        x_axis = x;
        y_axis = y;
        z_axis = z;

        this.x = getR() * Math.sin(getTheta()) * Math.cos(getPhi());
        this.y = getR() * Math.sin(getTheta()) * Math.sin(getTheta());
        this.z = getR() * Math.cos(getTheta());

    }

    public double getR() {
        double r = Math.sqrt(x*x + y*y + z*z);
        return r;
    }

    public double getTheta() {
        double theta = Math.acos(z_axis/getR());
        return theta;
    }

    public double getPhi() {
        double phi = Math.atan2(y_axis,x_axis);
        return phi;
    }

    public static Vector3D add(Vector3D lhs, Vector3D rhs){
        double add_x = lhs.x + rhs.x;
        double add_y = lhs.y + rhs.y;
        double add_z = lhs.z+ rhs.z;

        Vector3D result = new Vector3D(add_x, add_y, add_z);

        return result;
    }

    public static Vector3D subtract(Vector3D lhs, Vector3D rhs) {
        double sub_x = lhs.x - rhs.x;
        double sub_y = lhs.y - rhs.y;
        double sub_z = lhs.z - rhs.z;

        Vector3D result = new Vector3D(sub_x, sub_y, sub_z);

        return result;
    }

    public static Vector3D scale( Vector3D v, double scaleFactor) {
        double scl_x = v.x * scaleFactor;
        double scl_y = v.y * scaleFactor;
        double scl_z = v.z * scaleFactor;

        Vector3D result = new Vector3D(scl_x, scl_y, scl_z);

        return result;
    }

}
