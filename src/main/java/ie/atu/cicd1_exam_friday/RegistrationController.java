package ie.atu.cicd1_exam_friday;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class RegistrationController {
    

    @PostMapping("/registrations")
    ResponseEntity<EventRegistration> createRegistration(@RequestBody @Valid EventRegistration details){
        return ;
    }

    @GetMapping("/registrations/{ticketCode}")
    EventRegistration getRegistration(@PathVariable String ticketCode){
        return ;
    }

    @PutMapping("/registrations/{ticketCode}")
    ResponseEntity updateRegistration(@RequestBody @Valid EventRegistration details, @PathVariable String ticketCode){
        return ;
    }


    @DeleteMapping("/registrations/{ticketCode}")
    ResponseEntity deleteRegistration(@PathVariable String ticketCode){
        return ;
    }



}
