package src.Collections.compare_comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class runner {


    public static void main(String[] args) {


        Laptop details = new Laptop(25000, "Lenovo");
        Laptop details1 = new Laptop(35000, "Apple");
        Laptop details2 = new Laptop(45000, "Acer");
        Laptop details3 = new Laptop(15000, "Dell");
        Laptop details4 = new Laptop(12000, "Asus");


        List<Laptop> list = new ArrayList<>();

        list.add(details);
        list.add(details1);
        list.add(details2);
        list.add(details3);
        list.add(details4);

         Collections.sort(list);

        System.out.println(list);



    }
}
