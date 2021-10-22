package Main.Food;

import Main.Merchandise;
import Main.ProductType;

/*
食品
 */
public abstract class Food implements Merchandise {
    // 名前
    private String name;
    // 価格
    private int price;
    // 種類
    private ProductType type;

    public Food(String name, int price) { }

    public void setName(String name) {
    }

    public void setPrice(int price) {
    }

    public ProductType getType() {
        return null;
    }

    @Override
    public String cost() {
        return "";
    }
}
