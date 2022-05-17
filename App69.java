import java.util.TreeSet;
import java.util.Set;
import java.util.Scanner;

public class App69 {
    public static void main(String[] args) throws Exception{
        int number;
        TreeSet<Integer> treeSetIntegers = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);
        treeSetIntegers.add(0);
        treeSetIntegers.add(3);
        treeSetIntegers.add(1);
        treeSetIntegers.add(4);
        treeSetIntegers.add(2);
        treeSetIntegers.add(8);
        System.out.println("Các phần tử trong treeSetInteger: ");
        System.out.println(treeSetIntegers);
        System.out.println("Nhập phần tử cần thêm: ");
        number = scanner.nextInt();
        if (!treeSetIntegers.contains(number)){
            treeSetIntegers.add(number);
            System.out.println("Thêm thành công!");
            System.out.println("Các phần tử trong treeSetInteger sau khi thêm: ");
            System.out.println(treeSetIntegers);

        }
        else{
            System.out.println("Phần tử" + number + "đã tồn tại!");
        }
    }    
}
