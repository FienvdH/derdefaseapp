package qien.derdefase.app.service.departmentservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FinanceService {

    @Autowired
    FinanceRepository financeRepository;
}