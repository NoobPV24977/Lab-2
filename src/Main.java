public class Main {
    public static void main(String[] args) {

        if (args.length > 0) {
            try {

                int decimalNumber = Integer.parseInt(args[0]);


                String binaryNumber = Integer.toBinaryString(decimalNumber);


                System.out.println("Десяткове число: " + decimalNumber);
                System.out.println("Двійкове число: " + binaryNumber);
            } catch (NumberFormatException e) {
                System.out.println("Помилка: Введіть коректне ціле число.");
            }
        } else {
            System.out.println("Помилка: Введіть число як аргумент командного рядка.");
        }
    }
}
