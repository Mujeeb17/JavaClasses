package class3;

public class VariablesDemo4 {
    public static void main(String[] args) {

        //NICE TIP: right click on variable name, and click refactor and rename
        //it will change the variable name everywhere in the class
        //you can use this tip for many other things like classes
        int num=10;

        System.out.println(num);
        System.out.println(num);
        System.out.println(num + "\n");

        int age=20;
        age=num;
        System.out.println(age);

        age = num+10;
        System.out.println(age);

        age = age+20;
        System.out.println(age);

    }
}
