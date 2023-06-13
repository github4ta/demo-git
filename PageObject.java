public class PageObject {

    String menuItemLocator;
    String inputNameLocator;

    PageObject clickMenuItem() {
        return this;
    }

    PageObject fillName(String name) {
        return this;
    }
}
