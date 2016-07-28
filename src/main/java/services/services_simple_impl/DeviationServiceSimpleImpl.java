package services.services_simple_impl;

import com.vaadin.spring.annotation.SpringComponent;
import domain.Deviation;
import domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import repositories.CorrectionRepository;
import repositories.DeviationRepository;
import services.services_Interface.DeviationService;

import java.util.List;

@SpringComponent
public class DeviationServiceSimpleImpl implements DeviationService{

    private  final DeviationRepository deviationRepository;

    @Autowired
    public DeviationServiceSimpleImpl(DeviationRepository deviationRepository) {
        this.deviationRepository = deviationRepository;
    }

    @Override
    public void addDeviation(Deviation deviation, User user) {
        this.deviationRepository.save(deviation);
    }

    @Override
    public void removeDeviation(Deviation deviation, User user) {
        this.deviationRepository.delete(deviation);
    }

    @Override
    public void updateDeviation(Deviation deviation, User user) {
        this.deviationRepository.save(deviation);
    }

    @Override
    public List<Deviation> findAllDeviation() {
        return null;
    }
}
