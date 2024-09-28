public class Nearest{
    public static void main(String[] args) {
        int[] arr = {10, -20, 30, -40, 50, -60};
        int minSum = Integer.MAX_VALUE;
        int num1 = 0, num2 = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int sum = arr[i] + arr[j];
                if (Math.abs(sum) < Math.abs(minSum)) {
                    minSum = sum;
                    num1 = arr[i];
                    num2 = arr[j];
                }
            }
        }
        System.out.println("Two elements whose sum is nearest to 0 are " + num1 + " and " + num2);
    }
}