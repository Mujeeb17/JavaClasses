package class23PolymorphismFinal;

public class WebDriverTester {
    public static void main(String[] args) {
/*
        Chrome chrome = new Chrome();
        chrome.startBrowser();
        chrome.openURL();
        chrome.testLoginPage();
        chrome.closeBrowser();

        Safari safari = new Safari();
        safari.startBrowser();
        safari.openURL();
        safari.testLoginPage();
        safari.closeBrowser();

        FireFox fireFox = new FireFox();
        fireFox.startBrowser();
        fireFox.openURL();
        fireFox.testLoginPage();
        fireFox.closeBrowser();
 */
        //Instead of doing the above (Very repetetive), we can do
        //it in a simpler way with polymorphism

        WebDriver chrome = new Chrome(); // upcasting
        WebDriver safari = new Safari(); // upcasting
        WebDriver fireFox = new FireFox(); // upcasting

        //creating an array of objects from the WebDriver class (similar like String class)
        //note all objects are subclasses to WebDriver (a parent can hold all it's child classes)
        WebDriver[] web = {chrome, safari, fireFox};
        // or you could do this
        // WebDriver[] web = {new Chrome(), new Safari(), new FireFox()};

        //for each loop to go through each object in the array and
        //execute every overridden method inside the object's specific class
        for (WebDriver x: web){
            x.startBrowser();
            x.openURL();
            x.testLoginPage();
            x.closeBrowser();
        }
    }
}
