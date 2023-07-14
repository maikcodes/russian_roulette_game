package GameClasses;

public class Player {

    //Atributes ⬇
    private int id;
    private String name;
    private boolean alive;

    //Methods ⬇
    //Constructor
    public Player() {
    }

    public Player(int id, String name, boolean alive) {
        this.id = id;
        this.name = name;
        this.alive = alive;
    }

    //Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    //Player actions
    public void shoot(Revolver revolver) {
        if (revolver.shoot()) {
            setAlive(false);
        } else {
            setAlive(true);
        }
    }

    //Player information
    @Override
    public String toString() {
        return "Gamer{" + "id=" + id + ", name=" + name + ", alive=" + alive + '}';
    }

}
