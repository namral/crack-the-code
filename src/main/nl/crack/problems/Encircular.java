package main.nl.crack.problems;

/**
 * Created by Namrata Lele on 2/18/16.
 *
 */
public class Encircular {
    static String doesCircleExist(String commands) {
        int x = 0;
        int y = 0;
        boolean goUp = false;
        for (int i = 0; i < commands.length(); i++) {
            switch (commands.charAt(i)) {
                case 'G' :
                    if (goUp) {
                        y++;
                    } else {
                        x++;
                    }
                    break;
                case 'L' :
                    goUp = true;
                    break;
                case 'R' :
                    goUp = false;
                    break;
            }
        }
        if (x == 0 && y == 0) {
            return "YES";
        }
        return "NO";

    }

    public static void main(String[] args) {
        System.out.println(doesCircleExist("GLGLG"));
        System.out.println(doesCircleExist("GRGL"));
    }
}
