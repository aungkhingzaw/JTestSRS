package Main.Kitchen;

import Main.Merchandise;
import Main.ProductType;

/*
台所用品
 */
public abstract class Kitchen implements Merchandise {
    // 名前
    private String name;
    // 価格
    private int price;
    // 種類
    private ProductType type;

    public Kitchen(String name, int price) { }

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
