package class23PolymorphismFinal;

public class WebDriver {

    public void startBrowser(){
        System.out.println("starting the browser");
    }
    public void openURL(){
        System.out.println("opening URL");
    }
    public void testLoginPage(){
        System.out.println("checking if login page works");
    }
    public void closeBrowser(){
        System.out.println("Closing the browser");
    }
}

class Chrome extends WebDriver{

    @Override
    public void startBrowser() {
        System.out.println("starting chrome");
    }

    @Override
    public void openURL() {
        System.out.println("Opening the url in chrome");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing the login page on chrome");
    }

    @Override
    public void closeBrowser() {
        System.out.println("closing chrome");
    }
}

class Safari extends WebDriver {
    @Override
    public void startBrowser() {
        System.out.println("Starting Safari");
    }

    @Override
    public void openURL() {
        System.out.println("Opening url on Safari");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing login page on Safari");
    }

    @Override
    public void closeBrowser() {
        System.out.println("closing Safari");
    }
}

class FireFox extends WebDriver {
    @Override
    public void startBrowser() {
        System.out.println("Starting firefox");
    }

    @Override
    public void openURL() {
        System.out.println("Opening url on firefox");
    }

    @Override
    public void testLoginPage() {
        System.out.println("Testing login page on firefox");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing firefox");
    }
}