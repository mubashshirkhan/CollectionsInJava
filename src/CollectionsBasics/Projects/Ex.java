package CollectionsBasics.Projects;

public class Ex {
    int x;
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public Ex(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString() {
        return "Ex"+ "(" +x+","+y+")";
    }
}
