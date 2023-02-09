package class5Switch;

public class SwitchCase4 {
    public static void main(String[] args) {

        String country = "USA";

        System.out.println(country.toLowerCase());

        switch (country.toLowerCase()) { //'toLowerCase' allows us to write all our conditions in lowercase for less errors
            case "usa":
                System.out.println("Burgers");
                break;
            case "italy":
                System.out.println("Pasta");
                break;
            case "pakistan":
                System.out.println("Kebab");
                break;
            default:
                System.out.println("Wrong country");

        }
    }
}
