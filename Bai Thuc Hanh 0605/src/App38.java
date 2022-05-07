import java.util.LinkedList;

public class App38 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Java");
        linkedList.add("C++");
        linkedList.add("C#");
        linkedList.add("PHP");
        System.out.println("vi du su dung phuong thuc addAll()");
        System.out.println("=====================================");
        LinkedList<String> listA = new LinkedList<>();
        listA.addAll(linkedList);
        System.out.println("list: ");
        showList(listA);
        System.out.println("Vi du su dung phuong thuc retainAll()");
        System.out.println("========================================");
        LinkedList<String> listB = new LinkedList<>();
        listB.add("Java");
        listA.retainAll(listB);
        System.out.println("listA: ");
        showList(listA);
        System.out.println("Day la vi du su dung phuong thuc removeAll()");
        linkedList.removeAll(listB);
        System.out.println("linkedList: ");
        showList(linkedList);
    }

    public static void showList(LinkedList<String> linkedList) {
        for (String obj : linkedList) {
            System.out.println("\t" + obj + " , ");
        }
        System.out.println();

    }

}