package ie.atu.cicd1_exam_friday;

public class ServiceExpection extends RuntimeException{
    public ServiceExpection(String message) {
        super(message);
    }
}
