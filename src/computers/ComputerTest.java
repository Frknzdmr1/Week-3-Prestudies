package computers;

import java.util.ArrayList;

public class ComputerTest{
    public static void main(String[] args) {

        Computer computer = new Computer();
        Computer computer2 = new Computer("Asus", 14, true);
        Computer computer3 = new Computer("Acer", 15, true);
        Computer computer4 = new Computer("Asus", 2500, 4, 3, 15, "Laptop", true );

        computer4.setRamSize(computer4.getRamSize()*2);
        shopComputer();
    }

    private static void shopComputer(){
        Computer computer1 = new Computer("HP", 2000, 4, 4, 15.3, "Laptop", true);
        computer1.setPurchasePrice(750);
        computer1.setSellingPrice(1100);

        Computer computer2 = new Computer("Asus", 2500, 8, 4, 17.5, "Laptop", true);
        computer2.setPurchasePrice(980);
        computer2.setSellingPrice(1400);

        Computer computer3 = new Computer("Lenovo", 2500, 8, 5, 14.3, "Laptop", true);
        computer3.setPurchasePrice(1750);
        computer3.setSellingPrice(2900);

        Computer computer4 = new Computer("Dell", 3000, 6, 6, 16.2, "Laptop", true);
        computer4.setPurchasePrice(650);
        computer4.setSellingPrice(1200);

        Computer computer5 = new Computer("Acer", 3000, 4, 4, 14.3, "Laptop", true);
        computer5.setPurchasePrice(950);
        computer5.setSellingPrice(1400);

        ArrayList<Computer> computerArrayList = new ArrayList<>();
        computerArrayList.add(computer1);
        computerArrayList.add(computer2);
        computerArrayList.add(computer3);
        computerArrayList.add(computer4);
        computerArrayList.add(computer5);

        ComputerShop shopComputer = new ComputerShop(computerArrayList);

        double totalProfit = shopComputer.calculateProfit();
        System.out.println("Total profit: " + totalProfit);
    }
}
