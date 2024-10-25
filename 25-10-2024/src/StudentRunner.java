public class StudentRunner {
    public static void main(String[] args) {
        int [] marks = {99, 88, 100};

        Student student = new Student("ceva nume", marks);
        Student student2 = new Student("altceva nume", 1,4,5,6);
        Student student3 = new Student("ceva nume", 9, 85);

        //variable argument ... on constuctor  variable argument should always be the last argument
        //you cannot change size of an array

        int number = student.getNumberOfMarks();
        int sum = student.getTotalSumOfMarks();
        int maximumMark = student.getMaxMark();
        int minMark = student.getMinMark();

        System.out.println(number);
        System.out.println(sum);
        System.out.println(maximumMark);
        System.out.println(minMark);




        StudentWithArrayList student4 = new StudentWithArrayList("ceva nume", 9, 85);
        int sum2 = student4.getTotalSumOfMarks();
        System.out.println(sum2);
        System.out.println(student4);
        student4.addNewMark(35);
        System.out.println(student4);

        student4.removeMarkAtIndex(1);
        System.out.println(student4);
    }

}
