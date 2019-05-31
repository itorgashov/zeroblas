abstract class AbstractVector {
    private double[] _coords;

    AbstractVector(int n) {
        _coords = new double[n];
    }

    public void setCoord(int n, double value) {
        _coords[n] = value;
    }

    public double getCoord(int n) {
        return _coords[n];
    }

    abstract double module();
}
