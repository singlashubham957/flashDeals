package amazon.clone.orchestrator;

import amazon.clone.service.DealService;
import amazon.clone.service.OrderService;
import amazon.clone.models.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class OrderOrchestrator {
    @Autowired
    private DealService dealService;
    @Autowired
    private OrderService orderService;

    public boolean placeOrder(String userId, String dealId) throws Exception {
        Integer noOfExistingOrders = orderService.getCountOfOrdersByDealId(dealId);
        int maxNoOfItems = dealService.findById(dealId).noOfItems();
        boolean doesOrderAlreadyExists = !orderService.getOrderByUserIdAndDealId(userId, dealId).isEmpty();

        if (doesOrderAlreadyExists || maxNoOfItems <= noOfExistingOrders) {
            throw new Exception("not eligible");
        }

        orderService.createOrder(new Order("randomNumber", userId, dealId));
        return true;
    }
}
