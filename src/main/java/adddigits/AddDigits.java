package adddigits;

public class AddDigits {

    public int addDigits(String input) {
        if (input == null || input == "") {
            return -1;
        }
        int sum = 0;
        for (Character actual : input.toCharArray()) {
            if (Character.isDigit(actual)) {
                sum += Integer.parseInt(actual.toString());
            }
        }
        return sum;
    }
}
