import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class Shop {
    private File file;
    private List<Purchase> purchaseList;

    public Shop(String path){
        file = new File(path);
        purchaseList = new ArrayList<>();

        loadPurchases();
    }

    private void loadPurchases() {
        List<String> lineList = null;
        try {
            lineList = Files.readAllLines(file.toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }

        Purchase purchase;
        for (String s : lineList) {
            String[] elements = s.split(":");
            purchase = new Purchase(elements[0],
                                    Integer.parseInt(elements[1]),
                                    Integer.parseInt(elements[2]));
            purchaseList.add(purchase);
        }
    }

    public int countFullPrice(){
        int sum = 0;
        for (Purchase purchase : purchaseList) {
            sum += purchase.getPrice() * purchase.getCount();
        }
        return sum;
    }

    public Purchase getMostAmountProduct(){
        Purchase max = purchaseList.get(0);
        for (Purchase purchase : purchaseList) {
            if(max.getCount() < purchase.getCount()){
                max = purchase;
            }
        }
        return max;
    }

    public int getMaximumPrice() {
        int max = 0;
        for (Purchase purchase : purchaseList) {
            if(max < purchase.getPrice()){
                max = purchase.getPrice();
            }
        }
        return max;
    }



}
