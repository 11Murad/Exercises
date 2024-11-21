import java.util.Arrays;

public class Family extends Human {
    static {
        System.out.println("Family class was loaded");
    }
    {
        System.out.println("Object type Family");
    }

    private Human mother;
    private Human father;
    private Human[] children = new Human[100];
    private Pet pet;

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
    }

    public Family(Human mother, Human father, Human[] children, Pet pet) {
        this.mother = mother;
        this.father = father;
        this.children = children;
        this.pet = pet;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    private static int pointer=0;
    public boolean deleteChild(int index) {
        if (index>children.length){
            return false;
        }
        children[index] = null;
        for (int i=index+1; i<pointer; i++) {
            if (children[i] != null){
                children[i-1] = children[i];
            }
            else {
                break;
            }
        }
        children[--pointer] = null;
        return true;
    }
    public boolean addChild(Human child){
        if (this.mother!=null && this.father!=null){
            children[pointer++] = child;
        }
        return true;
    }

    public int counterFamily(){
        return 2 + pointer;
    }

}
