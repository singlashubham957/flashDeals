package amazon.clone.data;

import amazon.clone.models.Deal;
import amazon.clone.models.Deal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DealRepository extends CrudRepository<Deal, String> {
}