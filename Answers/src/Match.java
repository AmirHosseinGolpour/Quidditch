import java.util.*;
import java.lang.*;

public class Match {
    Team T1 = new Team();
    Team T2 = new Team();
    int i = 0;
    public void start() {
        MAIN: while (i<100) {
            T1.Play();
            if (T1.Goals>=150) {
                break MAIN;
            }
            T2.Play();
            if (T2.Goals>=150) {
                break MAIN;
            }
            i++;
        }
        if (T1.Goals > T2.Goals) {
            System.out.println("winner: Team 1");
        }
        else if (T1.Goals < T2.Goals) {
            System.out.println("winner: Team 2");
        }
        else {
            System.out.println("Draw");
        }
        System.out.println("Team 1: "+ T1.Goals);
        System.out.println("Team 2: "+ T2.Goals);
    }
}
