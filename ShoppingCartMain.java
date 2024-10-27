package shopping;

import java.util.Scanner;

public class ShoppingCartMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ShoppingCart cart = new ShoppingCart();

        System.out.println("-------------------------------------");
        System.out.println("********** 쇼핑 카트 프로그램 **********");
        System.out.println("-------------------------------------");

        while (true) {
            System.out.print("상품명을 입력하시오: ");
            String name = scanner.nextLine();
            System.out.print("상품의 가격을 입력하시오: ");
            int price = scanner.nextInt();
            System.out.print("상품의 수량을 입력하시오: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();

            System.out.println("상품을 더 추가하시겠습니까?");
            System.out.println("1. 예 | 2. 아니오");
            int plus = scanner.nextInt();
            if (plus == 2) {
                break;
            }
            System.out.println("----------------------");

            Item item = new Item(name, price, quantity);
            cart.addItem(item);
        }

        cart.displayItems();
    }
}
