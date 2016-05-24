package work.hophiuchus.algorithms.sort;

import java.util.Scanner;

public class SortContext {
    int[] numbers =null;
    public void inputNumbers(){
        Scanner scanner = new Scanner(System.in).useDelimiter(";");
        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            System.out.println(num);
        }
    }
    public void setNumbers(int[] numbers){
        this.numbers = numbers;
    }
}
