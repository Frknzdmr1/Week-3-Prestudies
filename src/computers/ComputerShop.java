package computers;

import java.util.ArrayList;

public class ComputerShop {
  private  ArrayList<Computer> computers;

  public ComputerShop(ArrayList<Computer> computerArrayList) {
      this.computers = computerArrayList;
  }
  public double calculateProfit() {
      double totalProfit = 0;
      for (Computer computer : computers) {
        totalProfit += computer.calculateProfit();
      }
      return totalProfit;
  }
}
