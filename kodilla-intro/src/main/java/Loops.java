public class Loops {
    public static void main(String[] args) {
        String[] names = new String[] {"Zygfryd", "Gwidon", "Florentyna"};

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        int[] superArray = new int[] {2, 56, 990, 23, 6, 1023, 543, 89};
        int sum = sumUpElementsOfArray(superArray);

        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }

    private static int sumUpElementsOfArray(int[] array){
        int sumOfArrayElements = 0;
        for (int i = 0; i < array.length; i++){
            sumOfArrayElements = sumOfArrayElements + array[i];
        }
        return sumOfArrayElements;
    }
}
