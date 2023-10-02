import java.util.Scanner;

public class cashier06 {
    public static void main(String[] args){
        int total, discount, paid;
        String card;
        Scanner sc = new Scanner(System.in);
        System.out.println("does costumer have a card (yay or nay)? ");
        card = sc.nextLine();
        System.out.println("total = ");
        total = sc.nextInt();
        if (card.equals("yay")){
            if (total > 500000) {
                discount = 50000;
            }   else {
                discount = 25000;
            }
        } else {
            if (total > 200000) {
                discount = 10000;
            } else {
                discount = 0;
            }
        }
        paid = total - discount;
        System.out.println(" total u must paid = Rp" + paid);
    }

}

