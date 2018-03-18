public class Circle {
    public static void main(String[] args) {
        double radius, perimeter, acreage;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter radius:");
        radius = sc.nextFloat();
        perimeter = radius * 2 * (Math.PI);
        acreage = radius * radius * (Math.PI);
        System.out.println("Perimeter is:" + perimeter);
        System.out.println("Acreage is :" + acreage);
    }
}
