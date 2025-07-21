public class point {

    float [][] location_axis= new float[1][2];

    public point(float x, float y) {
        location_axis[0][0] = x;
        location_axis[0][1] = y;
    }
    public void setAxis(float x, float y) {
        location_axis[0][0] = x;
        location_axis[0][1] = y;
    }
    public float getX() {
        return location_axis[0][0];
    }

    public float getY() {
        return location_axis[0][1];
    }
    public String getPosition() {
        return "(" + location_axis[0][0] + ", " + location_axis[0][1] + ")";
    }
}
