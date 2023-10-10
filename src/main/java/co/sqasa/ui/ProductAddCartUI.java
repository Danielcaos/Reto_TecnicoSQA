package co.sqasa.ui;

import net.serenitybdd.screenplay.targets.Target;

public class ProductAddCartUI {

    public static Target LNK_ADD_CART=Target.the("Link add product to cart")
            .locatedBy("//button[@name='add-to-cart']");
    public static  Target IMG_PRODUCT=Target.the("Image product")
            .locatedBy("//img[@class='image-no-effect unveil-image']");

    public static  Target TXT_PRODUCT=Target.the("Image product")
            .locatedBy("//h1[@class='product_title entry-title']");

}
