public class Casting { // Type Conversion
    public static void main(String[] args) {
        int i = 7;
        double d = i; // implicit casting: Kendisi yapıyor

        d = 12.9;
        i = (int)d; // Explicit casting: Kendisi yapmıyor
        System.out.println(i);


    }
}
