package class25Interface.class25homework;
/*Create a WebDriver Interface that will have the following unimplemented
behaviour: openBrowser(), closeBrowser(), maximizeWindow(), findElement().
Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
 */
public interface WebDriver {

    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();
}
class ChromeDriver implements WebDriver {
    @Override
    public void openBrowser() {
        System.out.println("opening chrome");
    }

    @Override
    public void closeBrowser() {
        System.out.println("closing chrome");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("maximizing window in chrome");
    }

    @Override
    public void findElement() {
        System.out.println("finding element in chrome");
    }
}
class FirefoxDriver implements WebDriver {
    @Override
    public void openBrowser() {
        System.out.println("opening Firefox");
    }

    @Override
    public void closeBrowser() {
        System.out.println("closing Firefox");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("maximizing window in Firefox");
    }

    @Override
    public void findElement() {
        System.out.println("finding element in Firefox");
    }
}
class WebDriverTester {
    public static void main(String[] args) {

        //using run time polymorphism
        WebDriver[] w = {new ChromeDriver(), new FirefoxDriver()};

        for (WebDriver x: w){
            x.openBrowser();
            x.maximizeWindow();
            x.findElement();
            x.closeBrowser();
            System.out.println();
        }
    }
}