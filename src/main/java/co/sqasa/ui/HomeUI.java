package co.sqasa.ui;


import net.serenitybdd.screenplay.targets.Target;
public class HomeUI {

    public static Target LNK_LOVE=Target.the("Link love section")
            .locatedBy("//ul[@id='primary-menu']//a[normalize-space()='Amor']");

}
