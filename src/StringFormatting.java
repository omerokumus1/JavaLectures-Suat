public class StringFormatting {
    public static void main(String[] args) {
        System.out.printf("Hello world!\n");
        System.out.printf("Hello world!\n");

        String name = "Ömer";
        String school = "Marmara University";
        double gpa = 3.5;

        System.out.printf("Hi, my name is %s. I am studying at %s, and my GPA is %f\n", name, school, gpa);
        System.out.println("Hi, my name is " + name +". I am studying at " + school + ", and my GPA is " + gpa);
// SELECT column1, column2, FROM table1, table2 WHERE table1.column1 == "value1" AND table2.column2 == "value2"
//String query = "SELECT " + column1 + ", " + column2 + ", FROM " + table1 +
//"SELECT %s, %s FROM %s, %s WHERE %s.%s == \"%s\" AND "

        double d = 2/3.0;
        System.out.printf("result: %f\n", d);
        System.out.printf("result: %.3f\n", d);


        System.out.printf("%30s%30s\n", "Programming Language", "Release Date");
        System.out.printf("%30s%30s\n", "Java", "1985");
        System.out.printf("%30s%30s\n", "C", "1980");

        System.out.printf("%-30s%-30s\n", "Programming Language", "Release Date");
        System.out.printf("%-30s%-30s\n", "Java", "1985");
        System.out.printf("%-30s%-30s\n", "C", "1980");



    }
}
