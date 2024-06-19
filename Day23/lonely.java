import java.util.ArrayList;
import java.util.Arrays;

public class lonely {
    public static ArrayList<Integer> lonely(int num[]) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(num);
        for (int i = 0; i < num.length; i++) {
            if (i == 0) {
                if (num[i + 1] != num[i] + 1 && num[i + 1] != num[i])
                    list.add(num[i]);
            } else if (i == num.length - 1) {
                if (num[i - 1] != num[i] - 1 && num[i - 1] != num[i])
                    list.add(num[i]);
            } else {
                if (num[i - 1] != num[i] - 1 && num[i + 1] != num[i] + 1 && num[i - 1] != num[i] && num[i + 1] != num[i])
                    list.add(num[i]);
            }
        }
        return list;  
    }

    public static void main(String args[]) {
        int num[] = {10, 6, 5, 8};
        System.out.println(lonely(num));
    }
}
