import java.util.*;
import java.lang.*;

public class Team {
    int Goals = 0;
    Keeper keeper = new Keeper("keeper", 1);
    Seeker seeker = new Seeker("seeker", 2);
    Chaser chasera = new Chaser("chaserA", 3);
    Chaser chaserb = new Chaser("chaserB", 4);
    Chaser chaserc = new Chaser("chaserC", 5);
    Beater beatera = new Beater("beaterA", 6);
    Beater beaterb = new Beater("beaterB", 7);

    private int setGoal() {
        this.Goals++;
        return this.Goals;
    }
    public void Play() {
        Random rand= new Random();
        int xk= rand.nextInt(99);
        int xs= rand.nextInt(99);
        int xb1= rand.nextInt(99);
        int xb2= rand.nextInt(99);
        int xc1= rand.nextInt(99);
        int xc2= rand.nextInt(99);
        int xc3= rand.nextInt(99);



        if (seeker.isSuccessful(xs)) {
            this.Goals += 150;
        }
        else if (keeper.isSuccessful(xk) && (beatera.isSuccessful(xb1) || beaterb.isSuccessful(xb2)) && ((chasera.isSuccessful(xc1) && chaserb.isSuccessful(xc2)) || (chasera.isSuccessful(xc1) && chaserc.isSuccessful(xc3)) || (chaserc.isSuccessful(xc3) && chaserb.isSuccessful(xc2)))) {
            setGoal();
        }

    }
}
