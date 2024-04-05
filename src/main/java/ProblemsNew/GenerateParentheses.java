package ProblemsNew;



import java.util.*;

public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }

    private void backtrack(List<String> result, String current, int open, int close, int max) {
        if (current.length() == max * 2) {
            result.add(current);
            return;
        }

        if (open < max)
            backtrack(result, current + "[", open + 1, close, max); // Changed "(" to "[" for a different character
        if (close < open)
            backtrack(result, current + "]", open, close + 1, max); // Changed ")" to "]" for a different character
    }

    public static void main(String[] args) {
        GenerateParentheses solution = new GenerateParentheses();

        int n1 = 4;
        List<String> result1 = solution.generateParenthesis(n1);
        System.out.println("Output 1: " + result1);

        int n2 = 1;
        List<String> result2 = solution.generateParenthesis(n2);
        System.out.println("Output 2: " + result2);
    }
}
