package ie.atu.cicd1_exam_friday;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
public class GlobalErrorHandler {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<List<ErrorDetails>> handleValidationFails(MethodArgumentNotValidException ex){
        List<ErrorDetails> errors = new ArrayList<>();
        ex.getBindingResult().getFieldErrors().forEach(error -> {
            String feildName = error.getField();
            String errorDetails = error.getDefaultMessage();
            ErrorDetails details = new ErrorDetails(feildName, errorDetails);
            errors.add(details);
        });
        return ResponseEntity.status(400).body(errors);
    }

    @ExceptionHandler(ServiceExpection.class)
    public ResponseEntity<String> handleRuntimeExp(ServiceExpection ex){
        return ResponseEntity.status(400).body(ex.getMessage());
    }


}
