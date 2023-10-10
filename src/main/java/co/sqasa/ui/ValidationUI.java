package co.sqasa.ui;

import net.serenitybdd.screenplay.targets.Target;
public class ValidationUI {

    public static Target LBL_NAME_CART=Target.the("Label name cart")
            .locatedBy("//td[@class='product-name']//a[contains(text(),'MDF 00010')]");

}
