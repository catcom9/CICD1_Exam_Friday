package ie.atu.cicd1_exam_friday;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
public class RegistrationController {

    private RegistrationService service;

    public RegistrationController(RegistrationService service) {
        this.service = service;
    }

    @PostMapping("/registrations")
    public ResponseEntity<EventRegistration> createRegistration(@RequestBody @Valid EventRegistration details){
        if (service.createRegistration(details) == true){
            return ResponseEntity.ok(details);
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/registrations/{ticketCode}")
    public ResponseEntity<EventRegistration> getRegistration(@PathVariable String ticketCode){
        EventRegistration details = service.getRegistration(ticketCode);
        if (details != null){
            return ResponseEntity.ok(details);
        }
        return ResponseEntity.notFound().build();
    }

    @PutMapping("/registrations/{ticketCode}")
    public ResponseEntity<EventRegistration> updateRegistration(@RequestBody @Valid EventRegistration details, @PathVariable String ticketCode){
        if (service.updateRegistration(ticketCode, details) == 1){
            return ResponseEntity.ok(details);
        }
        return ResponseEntity.notFound().build();
    }


    @DeleteMapping("/registrations/{ticketCode}")
    public ResponseEntity<EventRegistration> deleteRegistration(@PathVariable String ticketCode){
        if(service.deleteRegistration(ticketCode) == 1){
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }



}
