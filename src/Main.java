import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Test Exercice 1
        Student student = new Student();
        student.setName("John");
        student.setRoll_no(2);
        System.out.println(student);

        //Test Exercice 2
        Triangle triangle = new Triangle();
        System.out.println(String.format("Triangle: Perimètre: %f \nAire: %f", triangle.perimetre(), triangle.aire()));

        //Test Exercice 3
        Rectangle rectangle1 = new Rectangle();
        rectangle1.setLongueur(4.5);
        rectangle1.setLargeur(5.8);
        System.out.println(rectangle1);

        Rectangle rectangle2 = new Rectangle();
        rectangle2.setLongueur(4.5);
        rectangle2.setLargeur(5.8);
        System.out.println(rectangle2);

        //Test Exercice 4
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrer la longueur: ");
        double longueur = scanner.nextDouble();

        System.out.println("Entrer la largeur: ");
        double largeur = scanner.nextDouble();

        //Instanciation de notre classe
        Area area = new Area(longueur, largeur);
        System.out.println(area);
        System.out.println("Aire : " + area.returnArea());
    }
}
