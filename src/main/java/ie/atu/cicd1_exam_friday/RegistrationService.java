package ie.atu.cicd1_exam_friday;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class RegistrationService {
    ArrayList<EventRegistration> database = new ArrayList<EventRegistration>();
    boolean createRegistration(EventRegistration details){
        database.add(details);
        return true;
    }

    EventRegistration getRegistration(String ticketCode){
        for (int i = 0; i != database.size(); i++){
            if(database.get(i).getTicketCode().equals(ticketCode)){
                return database.get(i);
            }
        }
        return null;
    }

    int updateRegistration(String ticketCode, EventRegistration details){
        for(int i = 0; i != database.size(); i++){
            if(database.get(i).getTicketCode().equals(ticketCode)){
                database.remove(i);
                database.add(details);
                return 1;
            }
        }
        return 0;
    }

    int deleteRegistration(String ticketCode){
        for(int i = 0; i != database.size(); i++){
            if(database.get(i).getTicketCode().equals(ticketCode)){
                database.remove(i);
                return 1;
            }
        }
        return 0;
    }

}
