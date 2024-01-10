
/**
 * Write a description of class Champion here.
 *
 * @author Taha & Sakina
 * @version 0.1.0
 */
public class Champion {
    private String name;
    private int level;

    public Champion(String name, int level) {
        this.name = name;
        this.level = Math.max(level, 1);
    }

    public int levelUp() {
        this.level++;
        return this.level;
    }

    public int getLevel() {
        return this.level;
    }

    public void setLevel(int level) {
        this.level = Math.max(level, 1);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
