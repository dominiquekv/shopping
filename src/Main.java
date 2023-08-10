import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o limite do seu cartão? ");
        double limit = scanner.nextDouble();
        CreditCard card = new CreditCard(limit);

        int leave = 1;
        while (leave != 0) {
            System.out.println("Qual a descrição da compra? ");
            String description = scanner.next();

            System.out.println("Qual o valor da compra? ");
            double value = scanner.nextDouble();

            Purchase purchase = new Purchase(description, value);
            boolean lauchPurchase = card.lauchPurchase(purchase);

            if (lauchPurchase) {
                System.out.println("Compra realizada!");
                System.out.println("Digite 0 para sair ou 1 para continuar ");
                leave = scanner.nextInt();
            } else {
                System.out.println("Saldo insuficiente.");
                leave = 0;
            }
        }

        System.out.println("**************************");
        System.out.println("\nCOMPRAS REALIZADAS:\n");
        Collections.sort(card.getPurchases());

        for (Purchase p : card.getPurchases()) {
            System.out.println(p.getDescription() + " - " + p.getValue());
        }
        System.out.println("\n**************************");
        System.out.println("\nSaldo do cartão: " + card.getBalance());

    }

}