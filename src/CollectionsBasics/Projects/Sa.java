package CollectionsBasics.Projects;

import java.util.Objects;

public class Sa {

    @Override
    public String toString() {
        return "Sa"+ "(" +x+","+y+")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Sa s) {
        return this.x == s.x && y == s.y;
        }
        return false;
    }
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

    public Sa(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
