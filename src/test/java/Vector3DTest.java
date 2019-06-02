import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Vector3DTest {

    @Test
    public void getX() {
        Vector3D vector = new Vector3D(1.1d, 2.7d, 3.8d);
        Assert.assertEquals(vector.getX(), 1.1d, 0);
    }

    @Test
    public void getY() {
        Vector3D vector = new Vector3D(1.1d, 2.7d, 3.8d);
        Assert.assertEquals(vector.getY(), 2.7d, 0);
    }

    @Test
    public void getZ() {
        Vector3D vector = new Vector3D(1.1d, 2.7d, 3.8d);
        Assert.assertEquals(vector.getZ(), 3.8d, 0);
    }

    @Test
    public void module() {
        Vector3D vector = new Vector3D(1.0d, 2.0d, 3.0d);
        Assert.assertEquals(vector.module(), Math.sqrt(14.0d), 0);
    }

    @Test
    public void toStringTest() {
        Vector3D vector = new Vector3D(1.1d, 2.8d, 322.8d);
        Assert.assertEquals(vector.toString(), "(1.1, 2.8, 322.8)");
    }
}