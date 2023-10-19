import java.util.*;
class GradeCalculator{
    public static void main(String srga[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Subject : ");
        int numGrades=sc.nextInt();

        int[] grades=new int[numGrades];

        for(int i=0;i<numGrades; i++){
            System.out.println("Enter the Marks of Subject "+(i+1)+" :");
            grades[i]=sc.nextInt();
        }
        sc.close();
        int total=0;

        for(int i=0;i<numGrades; i++){
            total+=grades[i];
        }

        double sum=(double)total;
        double percentage=(double)total/numGrades;
        double average=(double)percentage/9.5;

        System.out.println("The Sum of Marks is : " + sum );
        System.out.println("The Percentage of all subject is : "+ percentage +" %");
        System.out.println("The Grade of all subject is : "+ average );
    }
}