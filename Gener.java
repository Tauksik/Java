import java.util.*;

class multiple<T, V> 
{
    T ob1;
    V ob2;

    multiple(T o1, V o2)
    {
        ob1 = o1;
        ob2 = o2;

    }

    void showTypes() 
    {
        System.out.println("type of first " + ob1.getClass().getName());
        System.out.println("Type of second" + ob2.getClass().getName());

    }

    T getob1() 
    {
        return ob1;

    }

    V getob2() 
    {
        return ob2;
    }
}

class Gener 
{
    public static void main(String args[]) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter any string");
        String s = scan.nextLine();
        System.out.println("enter any integer");
        int i = scan.nextInt();

        System.out.println();

        System.out.println("enter any string");
        String st = scan.next();
        System.out.println("enter any double");
        double d = scan.nextDouble();

        multiple<String, Integer> tObj = new multiple<String, Integer>(s, i);

        tObj.showTypes();
        String strn = tObj.getob1();
        System.out.println("value of set 2: " + strn);
        double vd = tObj.getob2();
        System.out.println("value of set 2: " + vd);
    }
}
