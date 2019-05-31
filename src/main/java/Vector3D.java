public class Vector3D extends AbstractVector{

    public Vector3D(double x, double y, double z) {
        super(3);
        setCoord(0, x);
        setCoord(1, y);
        setCoord(2, z);
    }

    public double getX() {
        return getCoord(0);
    }

    public double getY() {
        return getCoord(1);
    }

    public double getZ() {
        return getCoord(2);
    }

    double module()
    {
        return Math.sqrt(getX()*getX() + getY()*getY() + getZ()*getZ());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        sb.append(getX());
        sb.append(", ");
        sb.append(getY());
        sb.append(", ");
        sb.append(getZ());
        sb.append(")");
        return sb.toString();
    }
}
