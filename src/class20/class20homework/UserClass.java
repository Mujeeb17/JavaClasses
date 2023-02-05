package class20.class20homework;

/*
Write program: userClass  that has a constructor that initializes
instance variable name and mobile number. Create a subclass
userInfo that will have user address variable and it also being
initialized through constructor call. Print users name, mobile number
and address in userDetails method. Test your code.
 */
public class UserClass {

    String name, mNum;

    UserClass(String name, String mNum) {
        this.name = name;
        this.mNum = mNum;
    }
}

class userInfo extends UserClass {

    String address;

    userInfo(String name, String mNum, String address) {
        super(name, mNum);
        this.address = address;
    }

    void userDetails() {
        System.out.println("name: " + name + ", mobile number: " + mNum + ", address: " + address);
    }

    public static void main(String[] args) {
        new userInfo("Joe", "1234567890", "123 street").userDetails();

        //ALL CLASSES
    }
}