package tests;

public class StockDetector {

    int minPrice=10;
    int maxPrice=1000;
    public void stockAnalyzer(String stockName, int stockPrice){

        if ("Apple".equals(stockName)){
            buy();
        }

        else if (stockName == "Gamestop"){
            sell();
        }
        else {
            if (stockPrice > maxPrice) {
                sell();
            } else if (stockPrice < minPrice) {
                buy();
            }
        }


    }
    public void buy(){

        System.out.println("You have bought");

    }

    public void sell(){

        System.out.println("You have sold");

    }

}
