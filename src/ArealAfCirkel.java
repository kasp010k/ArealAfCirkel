import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class ArealAfCirkel {

    public static void main(String[] args) {
        System.out.println("Vælg Radius");

        Scanner input = new Scanner(System.in);
        double radius =input.nextDouble();
        System.out.println("Radius er "+radius);

        double resultat = radius * radius * 3.14;
        System.out.println (radius + "*" + radius + "*3.14");
        System.out.println("Arealet er " + resultat);
    }
}
