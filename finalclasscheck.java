
final class vivaanSecurData {

    void ShowData() {
        System.out.println("Secure confidential Record for vivaan ");
    }
}

class student extends vivaanSecureData{
}

public class finalclasscheck {

    public static void main(String[] args) {
        student mystudent = new student();
        mystudent.ShowData();
    }
}
