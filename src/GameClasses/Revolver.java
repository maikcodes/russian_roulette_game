package GameClasses;

public class Revolver {

    //Atributes ⬇
    private int actualPosition;
    private int bulletPosition;

    //Methods ⬇
    //Constructor
    public Revolver() {
        this.actualPosition = (int) (Math.random() * 6 + 1); //Position of cylinder to start game
        this.bulletPosition = (int) (Math.random() * 6 + 1); //Position of bullet to start game
    }

    //Getters and Setters
    public int getActualPosition() {
        return actualPosition;
    }

    public void setActualPosition(int actualPosition) {
        this.actualPosition = actualPosition;
    }

    public int getBulletPosition() {
        return bulletPosition;
    }

    public void setBulletPosition(int bulletPosition) {
        this.bulletPosition = bulletPosition;
    }

    //Revolver actions
    public boolean shoot() {
        return getActualPosition() == getBulletPosition();
    }

    public void nextBullet() {
        if (getActualPosition() < 6) {
            setActualPosition(getActualPosition() + 1);
        } else {
            setActualPosition(1);
        }
    }

    //Revolver information
    @Override
    public String toString() {
        return "Revolver{" + "actualPosition=" + actualPosition + ", bulletPosition=" + bulletPosition + '}';
    }

}
