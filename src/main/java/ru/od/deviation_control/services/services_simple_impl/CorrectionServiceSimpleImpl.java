package ru.od.deviation_control.services.services_simple_impl;

import com.vaadin.spring.annotation.SpringComponent;
import ru.od.deviation_control.services.domain.Correction;
import ru.od.deviation_control.services.domain.Deviation;
import ru.od.deviation_control.services.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import ru.od.deviation_control.services.repositories.CorrectionRepository;
import ru.od.deviation_control.services.services_Interface.CorrectionService;

import java.util.List;

@SpringComponent
public class CorrectionServiceSimpleImpl implements CorrectionService {

    private  final CorrectionRepository correctionRepository;
    //private static final Logger logger = LoggerFactory.getLogger(CorrectionServiceSimpleImpl.class);

    @Autowired
    public CorrectionServiceSimpleImpl(CorrectionRepository correctionRepository) {
        this.correctionRepository = correctionRepository;
    }

    @Override
    public List<Correction> findAllCorectionsForDeviation(Deviation deviation) {
        return this.correctionRepository.findByDeviation(deviation);
    }

    @Override
    public void addCorrection(Correction correction) {
        this.correctionRepository.save(correction);
    }

    @Override
    public void removeCorrection(Correction correction, User user) {
        this.correctionRepository.delete(correction);
    }

    @Override
    public void updateCorrection(Correction correction, User user) {
        this.correctionRepository.save(correction);
    }

    @Override
    public List<Correction> findCorrectionHistory(Correction correction) {
        return null;
    }

    @Override
    public boolean hasHistory(Correction correction){
        return false;
    }
}
