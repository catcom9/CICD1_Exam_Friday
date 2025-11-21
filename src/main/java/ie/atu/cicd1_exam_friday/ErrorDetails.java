package ie.atu.cicd1_exam_friday;

public class ErrorDetails {
    private String feildName;
    private String errorMessage;

    public ErrorDetails(String feildName, String errorMessage) {
        this.feildName = feildName;
        this.errorMessage = errorMessage;
    }

    public String getFeildName() {
        return feildName;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
