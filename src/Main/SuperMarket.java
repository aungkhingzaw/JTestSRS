package Main;

import java.util.LinkedList;
import java.util.List;

/*
スーパー
 */
public class SuperMarket {
    /**
     * 購入した商品の合計金額
     */
    public int totalCost = 0;

    /**
     * スーパーから購入用の商品リスト
     */
    public List<Object> purchasedProductList = new LinkedList<>();

    /**
     * 販売用の商品リスト
     */
    public List<Object> saleProductList = new LinkedList<>();;

    /**
     * 商品を購入とする
     * 購入用の商品リストに商品を追加する
     * @param product: 商品
     */
    public void setToBuy(Object product) { }

    /**
     * 商品を販売として設定する
     * 販売用の商品リストに商品を追加する
     * @param product: 商品
     */
    public void setToSale(Object product) { }

    /**
     * 購入用商品リストから食品リストのみを取得する
     * @return　食品リストカウント
     */
    public int getCountOfFood(){ return 0;}

    /**
     * 購入用商品リストから台所用品リストのみを取得する
     * @return　台所用品リストカウント
     */
    public int getCountOfKitchen(){ return 0;}

    /**
     * 購入用商品リストから楽品リストのみを取得する
     * @return　楽品リストカウント
     */
    public int getCountOfMedicine(){ return 0;}

    /**
     * 購入用商品リストから文具リストのみを取得する
     * @return　文具リストカウント
     */
    public int getCountOfStationary(){ return 0;}
}

