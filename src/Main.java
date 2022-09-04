public class Main {
    public static void main(String[] args) {
        int[] array = generateRandomArray();

        int sum = 0;
        for (int spending : array) {
            sum += spending;
        }
            System.out.printf("Сумма трат за месяц составила %s рублей", sum);

        int min = array[0];
        int max=array[0];
        for (int spending:array) {
            if(min>spending) {
                min = spending;
            }else if(max<spending){
                max=spending;
            }

        }
        System.out.printf("Минимальная сумма трат за день составила %s рублей\n"+" " +
                "Максимальная сумма трат за день составила %s рублей\n",min,max);

        double averageDouble=(double) sum/array.length;
        String average =String.format("%.2f",averageDouble);
        System.out.println("Средняя трата за день = "+ average);

        char[] reverseFullName = {  'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for(int i = reverseFullName.length-1;i>=0;i--){
            System.out.print(reverseFullName[i]);
        }
        for (int i = 0; i < reverseFullName.length/2; i++) {
            char symbol = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - 1 - i];
            reverseFullName[reverseFullName.length - 1 - i] = symbol;
        }
        System.out.println(reverseFullName);


        }





    public static int[] generateRandomArray () {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    }