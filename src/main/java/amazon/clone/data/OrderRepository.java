package amazon.clone.data;

import amazon.clone.models.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends CrudRepository<Order, String> {

    List<Order> findByUserIdAndDealId(String userId, String dealId);
    List<Order>  findByDealId(String dealId);

}