import java.util.*;
import java.lang.*;

public abstract class Player implements Success {
    private String name;
    private int number;
    public Player(String name, int number) {
        this.name = name;
        this.number = number;
    }
}
class Keeper extends Player {
//   public Double Chance=new Random(System.currentTimeMillis()).nextDouble();

    public Keeper(String name, int number) {
        super(name, number);
    }
    public boolean isSuccessful(int x) {
        if (x < 70) {
            return true;
        } else {
            return false;
        }
    }
}
class Seeker extends Player {
//   public Double Chance=new Random(System.currentTimeMillis()).nextDouble();

    public Seeker(String name, int number) {
        super(name, number);
    }
    public boolean isSuccessful(int x) {
        if (x < 5) {
            return true;
        } else {
            return false;
        }
    }
}
class Chaser extends Player {
//   public Double Chance=new Random(System.currentTimeMillis()).nextDouble();

    public Chaser(String name, int number) {
        super(name, number);
    }
    public boolean isSuccessful(int x) {
        if (x <30) {
            return true;
        } else {
            return false;
        }
    }
}
class Beater extends Player {
// public    Double Chance=new Random(System.currentTimeMillis()).nextDouble();

    public Beater(String name, int number) {
        super(name, number);
    }
    public boolean isSuccessful(int x) {
        if (x < 40) {
            return true;
        } else {
            return false;
        }
    }
}

