class invalideStudentMarksException extends Exception{
    public invalideStudentMarksException(String massage){
        super(massage);
    }
}

public class testCustomException {
    static void validatevivaanMarks(double  Marks) throws  invalideStudentMarksException{
        if(Marks < 0.0 || Marks > 100.0){
            throw new invalideStudentMarksException("Marks must be between 0 and 100 ! Input Was : "+ Marks);
        }else{
            System.out.println("Vivaan marks validated successfully : " + Marks);
        }
    }
    public static void main(String[] args) {
        try {
            System.out.print("Submit Exam score for vivaan : ");
            validatevivaanMarks(105.5);
        } catch (invalideStudentMarksException e) {
            System.out.println("Custom Exception cought : " + e.getMessage());
        }
    }
}


