package qien.derdefase.app.service.clientservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {


    @Autowired
    ClientRepository clientRepository;


}

//staat dit hier wel logisch? kan dit niet beter in de QuotationRequestService?
//via endpoint Client die methode aanroepen
