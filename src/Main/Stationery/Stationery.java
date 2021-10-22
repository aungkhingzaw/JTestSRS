package Main.Stationery;

import Main.Merchandise;
import Main.ProductType;

/*
文具
 */
public abstract class Stationery implements Merchandise {
    // 名前
    private String name;
    // 価格
    private int price;
    // 種類
    private ProductType type;

    public Stationery(String name, int price) { }

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
