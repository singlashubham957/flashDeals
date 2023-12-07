package amazon.clone.service;

import amazon.clone.data.OrderRepository;
import amazon.clone.models.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public void createOrder(Order Order) {
        orderRepository.save(Order);
    }
    public List<Order> getOrderByUserIdAndDealId(String userId, String dealId){
        return orderRepository.findByUserIdAndDealId(userId, dealId);
    }

    public Integer getCountOfOrdersByDealId(String dealId){
        return orderRepository.findByDealId( dealId).size();
    }


    public OrderRepository orderRepository() {
        return orderRepository;
    }

    public void setOrderRepository(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }
}
