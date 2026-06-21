import java.util.Scanner;
public class LostAndFoundSystem {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] lostItems = {"Wallet", "Mobile", "Bag"};
    System.out.print("Enter found item: ");
    String foundItem = sc.nextLine();
    boolean match = false;
    for (int i = 0; i < lostItems.length; i++) {
        if (lostItems[i].equalsIgnoreCase(foundItem)) {
            match = true;
            break;
        }
    }
    if (match) {
        System.out.println("Match Found! Item was reported lost.");
    } else {
        System.out.println("No Match Found.");
    }

    sc.close();
}
}





