package Test;

import Main.Food.Fish;
import Main.Food.Food;
import Main.Food.Meat;
import Main.Kitchen.Kitchen;
import Main.Kitchen.KitchenKnife;
import Main.Kitchen.RiceCooker;
import Main.Medicine.EyeDrops;
import Main.Medicine.Mask;
import Main.Medicine.Medicine;
import Main.ProductType;
import Main.Stationery.Book;
import Main.Stationery.Pen;
import Main.Stationery.Stationery;
import Main.SuperMarket;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SuperMarketTest {
    // 販売する商品
    Food pork ;
    Food beef;
    Food maguro ;
    Kitchen riceCooker ;
    Kitchen kitchenKnife;
    Medicine eyeDrop;
    Medicine mask;
    Medicine mask2;
    Medicine mask3;
    Stationery book;
    Stationery pen;
    // スーパー
    SuperMarket maruSuper = new SuperMarket();

    @Before
    public void setUp() throws Exception {
        // 商品の初期化
        pork = new Meat("豚肉", 400);
        beef = new Meat("牛肉", 1000);
        maguro = new Fish("マグロ", 500);
        riceCooker = new RiceCooker("Toshiba炊飯器", 6000);
        kitchenKnife = new KitchenKnife("和 NAGOMI", 3000);
        eyeDrop = new EyeDrops("Rohto", 2500);
        mask = new Mask("M1", 700);
        mask2 = new Mask("M2", 1000);
        mask3 = new Mask("M3", 850);
        book = new Book("漫画", 400);
        pen = new Pen("Pilot", 400);
        // 商品を販売ようとする
        maruSuper.setToSale(pork);
        maruSuper.setToSale(beef);
        maruSuper.setToSale(maguro);
        maruSuper.setToSale(riceCooker);
        maruSuper.setToSale(kitchenKnife);
        maruSuper.setToSale(eyeDrop);
        maruSuper.setToSale(mask);
        maruSuper.setToSale(mask2);
        maruSuper.setToSale(mask3);
        maruSuper.setToSale(book);
        maruSuper.setToSale(pen);
    }

    @Test
    public void testProductType() {
        assertThat(maguro.getType(), is(ProductType.FOOD));
        assertThat(kitchenKnife.getType(), is(ProductType.KITCHEN));
        assertThat(mask.getType(), is(ProductType.MEDICINE));
        assertThat(pen.getType(), is(ProductType.STATIONERY));
    }

    @Test
    public void testProductCost() {
        assertThat(pork.cost(), is("豚肉は400円です。"));
        assertThat(riceCooker.cost(), is("Toshiba炊飯器は6000円です。"));
        assertThat(eyeDrop.cost(), is("Rohtoは2500円です。"));
        assertThat(book.cost(), is("漫画は400円です。"));
    }

    @Test
    public void testTotalCountsOfProductInSuper() {
        assertThat(maruSuper.saleProductList.size(), is(11));
        assertThat(maruSuper.getCountOfFood(), is(3));
        assertThat(maruSuper.getCountOfKitchen(), is(2));
        assertThat(maruSuper.getCountOfMedicine(), is(4));
        assertThat(maruSuper.getCountOfStationary(), is(2));
    }

    @Test
    public void testBuyAndCashFromSuper() {
        // 商品を買う
        maruSuper.setToBuy(beef);
        maruSuper.setToBuy(mask);
        maruSuper.setToBuy(book);
        assertThat(maruSuper.purchasedProductList.size(), is(3));
        assertThat(maruSuper.totalCost, is(2100));
    }
}