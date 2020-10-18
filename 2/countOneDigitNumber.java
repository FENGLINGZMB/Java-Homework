public class countOneDigitNumber {
    public static void main(String[] args) {
        int[] count  = new int[10];
        int randomNumber;
        System.out.println("Created 100 numbers are followed:");
        for (int i =0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                randomNumber = (int)(Math.random()*10);
                count[randomNumber]++;
                System.out.print(randomNumber+"\t");
            }
            System.out.println();
        }
        System.out.print("\nNumbers statistics:\n");
        for (int i = 0; i<10; i++)
            System.out.print(i+"\t");
            System.out.println();
        for (int i:count)
            System.out.print(i+"\t");
    }
}
