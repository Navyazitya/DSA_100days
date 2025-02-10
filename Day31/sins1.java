import java.util.*;
class sins1 {
    public int strStr(String haystack, String needle) {
        int n = haystack.length(), m = needle.length();
        
        for (int i = 0; i <= n - m; i++) {
            if (haystack.substring(i, i + m).equals(needle)) {
                return i;
            }
        }
        
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter haystack: ");
        String haystack = sc.nextLine();
        
        System.out.print("Enter needle: ");
        String needle = sc.nextLine();
        
        sins1 solution = new sins1();
        int result = solution.strStr(haystack, needle);
        
        System.out.println("First occurrence index: " + result);
        
        sc.close();
}
}