package amazon.clone.service;

import amazon.clone.data.DealRepository;
import amazon.clone.models.Deal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class DealService {
    @Autowired
    private DealRepository dealRepository;

    public Deal createDeal(Deal deal) {
        return dealRepository.save(deal);
    }

    public Deal findById(String id) {
        return dealRepository.findById(id).get();
    }
    public void endDeal( String dealId){
        Deal deal = dealRepository.findById(dealId).get();
        deal.setEndTime(LocalDateTime.now());
        dealRepository.save(deal);
    }


}
