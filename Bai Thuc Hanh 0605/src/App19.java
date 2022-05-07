import java.util.ArrayList;
import java.util.ListIterator;

public class App19 {
    public static void main(String[] args) {
        ArrayList<Character> arrayLisCharacter = new ArrayList<>();
        arrayLisCharacter.add('a');
        arrayLisCharacter.add('e');
        arrayLisCharacter.add('b');
        arrayLisCharacter.add('c');
        ListIterator<Character> listIterator = arrayLisCharacter.listIterator();
        {
            System.out.println("Cac phan tu co trong arrayListCharacter la: ");
            while (listIterator.hasNext()) {
                System.out.println(listIterator.next() + "\t");
            }
        }
    }

}