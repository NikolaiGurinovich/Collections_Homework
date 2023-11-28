import java.util.LinkedList;

public class AnimalList {
    private LinkedList<String> animalArray;

    public AnimalList(LinkedList<String> animalArray) {
        this.animalArray = animalArray;
    }

    public void add (String animalName){
        animalArray.addLast(animalName);
    }
    public void delete (){
        animalArray.removeFirst();
    }

    @Override
    public String toString() {
        return "AnimalList{" +
                "animalArray=" + animalArray +
                '}';
    }
}
