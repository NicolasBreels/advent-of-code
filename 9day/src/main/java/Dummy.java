import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import static java.lang.Math.abs;

public class Dummy {

    public int playRule(String content) {
        List<String> line = Arrays.asList(content.split("\n"));
        Set<Position> positionTailSet = new LinkedHashSet<>();
        Position initPosition = new Position(0, 0,0, 0);
        for (String s : line) {
            List<String> singleLine = Arrays.asList(s.split(" "));
            initPosition = move(singleLine.get(0), Integer.parseInt(singleLine.get(1)), positionTailSet, initPosition);
        }
        return positionTailSet.size();
    }

    private Position move(String s, int nbr, Set<Position> positionTailSet, Position position) {
        int x_h = position.getXH();
        int y_h = position.getYH();
        int x_t = position.getXT();
        int y_t = position.getYT();

        if (s.equals("R")) {
            x_h = x_h + 1;
        }
        else if (s.equals("L")) {
            x_h = x_h - 1;
        }
        else if (s.equals("U")) {
            y_h = y_h + 1;
        }
        else{
            y_h = y_h - 1;
        }
        Position newPosition = new Position(x_h, y_h, x_t, y_t);
        if (abs(x_h-x_t)>1 || abs(y_h-y_t)>1){
//            System.out.println("before");
//            System.out.println(newPosition.getXH() + " " + newPosition.getYH());
//            System.out.println(newPosition.getXT()+ " " + newPosition.getYT());
            newPosition = changeTailPosition(newPosition);
//            System.out.println("new position tail ");
//            System.out.println(newPosition.getXH() + " " + newPosition.getYH());
//            System.out.println(newPosition.getXT()+ " " + newPosition.getYT());
//            System.out.println("apres calcul ");
//            System.out.println(newPosition.getXH()-newPosition.getXT());
//            System.out.println(newPosition.getYH()-newPosition.getYT());
        }

        positionTailSet.add(new Position(0,0,x_t, y_t));

        nbr = nbr -1;
        if(nbr==0){
            return newPosition;
        } else {
            return move(s, nbr, positionTailSet, newPosition);
        }
    }

    private Position changeTailPosition(Position position) {
        int x_h = position.getXH();
        int y_h = position.getYH();
        int x_t = position.getXT();
        int y_t = position.getYT();

        if(x_h == x_t && y_h == y_t+2){
            y_t = y_t +1;
        } else if(x_h == x_t && y_h == y_t-2){
            y_t = y_t -1;
        } else if(y_h == y_t && x_h == x_t-2){
            x_t = x_t -1;
        } else if(y_h == y_t && x_h == x_t+2){
             x_t= x_t +1;
        }else if (x_h < x_t && y_h>y_t){
            x_t = x_t -1;
            y_t = y_t+1;
        }else if (x_h < x_t && y_h<y_t){
            x_t = x_t -1;
            y_t = y_t-1;
        }else if (x_h > x_t && y_h<y_t){
            x_t = x_t +1;
            y_t = y_t-1;
        } else{
            x_t = x_t +1;
            y_t = y_t +1;
        }
        return new Position(x_h,y_h, x_t,y_t);
    }
}
