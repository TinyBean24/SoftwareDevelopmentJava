//1   // Fig. 7.14: GradeBook.java
//        2   // GradeBook class using an array to store test grades.
//        3
//        4   public class GradeBook {
// 5      private String courseName; // name of course this GradeBook represents
// 6      private int[] grades; // array of student grades
// 7
//         8      // constructor
//         9      public GradeBook(String courseName, int[] grades){
//        10         this.courseName = courseName;
//        11         this.grades = grades;
//        12      }
//13
//        14      // method to set the course name
//        15      public void setCourseName(String courseName) {
//        16         this.courseName = courseName;
//        17      }
//18
//        19      // method to retrieve the course name
//        20      public String getCourseName() {
//        21         return courseName;
//        22      }
//23
//        24      // perform various operations on the data
//        25      public void processGrades() {
//        26         // output grades array
//        27         outputGrades();
//        28
//        29         // call method getAverage to calculate the average grade
//        30         System.out.printf("%nClass average is %.2f%n", getAverage());
//        31
//        32         // call methods getMinimum and getMaximum
//        33         System.out.printf("Lowest grade is %d%nHighest grade is %d%n%n",
//                34            getMinimum(), getMaximum());
//        35
//        36         // call outputBarChart to print grade distribution chart
//        37         outputBarChart();
//        38      }
//39
//        40      // find minimum grade
//        41      public int getMinimum() {
//        42         int lowGrade = grades[0]; // assume grades[0] is smallest
//        43
//        44        // loop through grades array
//        45         for (int grade : grades) {
//            46            // if grade lower than lowGrade, assign it to lowGrade
//            47            if (grade < lowGrade) {
//                48               lowGrade = grade; // new lowest grade
//                49            }
//            50         }
//        51
//        52         return lowGrade;
//        53      }
//54
//        55      // find maximum grade
//        56      public int getMaximum() {
//        57         int highGrade = grades[0]; // assume grades[0] is largest
//        58
//        59         // loop through grades array
//        60         for (int grade : grades) {
//            61            // if grade greater than highGrade, assign it to highGrade
//            62            if (grade > highGrade) {
//                63               highGrade = grade; // new highest grade
//                64            }
//            65         }
//        66
//        67         return highGrade;
//        68      }
//69
//        70      // determine average grade for test
//        71      public double getAverage() {
//        72         int total = 0;
//        73
//        74         // sum grades for one student
//        75         for (int grade : grades) {
//            76            total += grade;
//            77         }
//        78
//        79         // return average of grades
//        80         return (double) total / grades.length;
//        81      }
//82
//        83      // output bar chart displaying grade distribution
//        84      public void outputBarChart() {
//        85         System.out.println("Grade distribution:");
//        86
//        87         // stores frequency of grades in each range of 10 grades
//        88         int[] frequency = new int[11];
//        89
//        90         // for each grade, increment the appropriate frequency
//        91         for (int grade : grades) {
//            92            ++frequency[grade / 10];
//            93         }
//        94
//        95          // for each grade frequency, print bar in chart
//        96          for (int count = 0; count < frequency.length; count++) {
//            97             // output bar label ("00-09: ", …, "90-99: ", "100: ")
//            98             if (count == 10) {
//                99                System.out.printf("%5d: ", 100);
//                100            }
//            101            else {
//                102               System.out.printf("%02d-%02d: ", count * 10, count * 10 + 9);
//                103            }
//            104
//            105            // print bar of asterisks
//            106            for (int stars = 0; stars < frequency[count]; stars++) {
//                107               System.out.print("*");
//                108            }
//            109
//            110            System.out.println();
//            111         }
//        112      }
//113
//        114      // output the contents of the grades array
//        115      public void outputGrades() {
//        116         System.out.printf("The grades are:%n%n");
//        117
//        118         // output each student's grade
//        119         for (int student = 0; student < grades.length; student++) {
//            120            System.out.printf("Student %2d: %3d%n",
//                    121               student + 1, grades[student]);
//            122         }
//        123      }
//124   }