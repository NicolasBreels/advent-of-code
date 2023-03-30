package Coord;


import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Coord {
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coord coord = (Coord) o;
        return x == coord.x && y == coord.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    int x;
    int y;
    int cost;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getCost() {
        return cost;
    }

    public Coord(int x, int y, int cost) {
        this.x = x;
        this.y = y;
        this.cost = cost;
    }

    public List<Coord> getValidNeighbours(char[][] grille) {
        List<Coord> neighbours = new LinkedList<>();
        if (x > 0) {
            if (mapElevationToCharacter(grille[x - 1][y]) - mapElevationToCharacter(grille[x][y]) <= 1) {
                neighbours.add(new Coord(x - 1, y, cost + 1));
            }
        }

        if (x < grille.length - 1) {
            if (mapElevationToCharacter(grille[x + 1][y]) - mapElevationToCharacter(grille[x][y] )<= 1) {
                neighbours.add(new Coord(x + 1, y, cost + 1));
            }
        }
        if (y > 0) {
            if (mapElevationToCharacter(grille[x][y - 1]) - mapElevationToCharacter(grille[x][y]) <= 1) {
                neighbours.add(new Coord(x, y - 1, cost + 1));
            }
        }
        if (y < grille[0].length - 1) {
            if (mapElevationToCharacter(grille[x][y + 1]) - mapElevationToCharacter(grille[x][y]) <= 1) {
                neighbours.add(new Coord(x, y + 1, cost + 1));
            }
        }
        return neighbours;
    }

    private Character mapElevationToCharacter(Character c) {
        if (c == 'S') return 'a';
        if (c == 'E') return 'z';
        return c;
    }
}
