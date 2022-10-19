//1   // Fig. 7.15: GradeBookTest.java
//        2   // GradeBookTest creates a GradeBook object using an array of grades,
//        3   // then invokes method processGrades to analyze them.
//        4   public class GradeBookTest {
// 5      public static void main(String[] args) {
//        6         // array of student grades
//        7         int[] gradesArray = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
//        8
//        9         GradeBook myGradeBook = new GradeBook(
//                10            "CS101 Introduction to Java Programming", gradesArray);
//        11         System.out.printf("Welcome to the grade book for%n%s%n%n",
//                12            myGradeBook.getCourseName());
//        13         myGradeBook.processGrades();
//        14      }
//15   }