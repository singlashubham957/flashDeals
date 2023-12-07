package amazon.clone.orchestrator;

import amazon.clone.models.Deal;
import amazon.clone.service.DealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class DealOrchestrator {
    @Autowired
    private DealService dealService;

    public void addDeal(Deal deal) throws Exception {
         dealService.createDeal(deal);
    }

    public Deal getDeal(String id) {
        return dealService.findById(id);
    }

    public void endDeal( String dealId) throws Exception {
        Deal deal = getDeal(dealId);

        if(deal.endTime().isBefore( LocalDateTime.now()))
        {
            throw new Exception("deal has already ended");
        }

         dealService.endDeal(dealId);
    }
}
