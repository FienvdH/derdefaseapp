package qien.derdefase.app.service.orderservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlacedOrderService {

    @Autowired
    PlacedOrderRepository placedOrderRepository;
}
