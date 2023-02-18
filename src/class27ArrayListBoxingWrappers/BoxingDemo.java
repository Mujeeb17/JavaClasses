package class27ArrayListBoxingWrappers;

public class BoxingDemo {
    public static void main(String[] args) {

        //converting a primitive to a Object type (Boxing)
        //converting an Object to a primitive type (Unboxing)

        int n = 15;

        //you can still use this method even though n is primitive
        //but the parameter in the method is taking a wrapper type
        //(This flexibility is only provided to Wrapper classes)
        //this is called AutoBoxing
        printData(n);


        Integer x = 10; //Autoboxing
        int y = x;
    }

    //this method uses wrapper(Class) type parameter
    public static void printData(Integer a){
        System.out.println(a);
    }
}
