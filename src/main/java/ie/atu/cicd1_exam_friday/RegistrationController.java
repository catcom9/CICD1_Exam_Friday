package ie.atu.cicd1_exam_friday;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class RegistrationController {

    RegistrationService service;

    @PostMapping("/registrations")
    public ResponseEntity<EventRegistration> createRegistration(@RequestBody @Valid EventRegistration details){
        if (service.createRegistration(details) == true){
            return ResponseEntity.ok(details);
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/registrations/{ticketCode}")
    public ResponseEntity<EventRegistration> getRegistration(@PathVariable String ticketCode){
        service.getRegistration(ticketCode);
        return ;
    }

    @PutMapping("/registrations/{ticketCode}")
    public ResponseEntity<EventRegistration> updateRegistration(@RequestBody @Valid EventRegistration details, @PathVariable String ticketCode){
        return ;
    }


    @DeleteMapping("/registrations/{ticketCode}")
    public ResponseEntity<EventRegistration> deleteRegistration(@PathVariable String ticketCode){
        return ;
    }



}
