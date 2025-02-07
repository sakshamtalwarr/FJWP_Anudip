public class StudentPercentage
{
    public static void main(String[] args) {
        int totalMarks = 500; 
        int obtainedMarks = 430;
        
        float percentage = (obtainedMarks *100.0f) / totalMarks;

        System.out.println("The percentage is"  + percentage + "%");
    }
}
