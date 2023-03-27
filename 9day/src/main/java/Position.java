import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Objects;

public class Position {
    int x_h;
    int y_h;
    int x_t;
    int y_t;


    public Position(int x_h, int y_h, int x_t, int y_t){
        this.x_h = x_h;
        this.y_h = y_h;
        this.x_t = x_t;
        this.y_t = y_t;
    }

    public int getXH(){
        return this.x_h;
    }
    public int getYH(){
        return this.y_h;
    }

    public int getXT(){
        return this.x_t;
    }
    public int getYT(){
        return this.y_t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return x_h == position.x_h &&
                y_h == position.y_h &&
                x_t == position.x_t &&
                y_t == position.y_t;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x_h, y_h, x_t, y_t);
    }
}
