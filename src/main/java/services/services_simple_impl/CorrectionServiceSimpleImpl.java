package services.services_simple_impl;

import com.vaadin.spring.annotation.SpringComponent;
import domain.Correction;
import domain.Deviation;
import domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import repositories.CorrectionRepository;
import services.services_Interface.CorrectionService;

import java.util.List;

@SpringComponent
public class CorrectionServiceSimpleImpl implements CorrectionService {

    private  final CorrectionRepository correctionRepository;

    private static final Logger logger = LoggerFactory.getLogger(CorrectionServiceSimpleImpl.class);

    @Autowired
    public CorrectionServiceSimpleImpl(CorrectionRepository correctionRepository) {
        this.correctionRepository = correctionRepository;
    }

    @Override
    public List<Correction> findAllCorectionsForDeviation(Deviation deviation) {
        return null;
    }

    @Override
    public void addCorrection(Deviation deviation, Correction correction, User user) {

    }

    @Override
    public void removeCorrection(Correction correction, User user) {

    }

    @Override
    public void updateCorrection(Correction correction, User user) {

    }

    @Override
    public List<Correction> findCorrectionHistory(Correction correction) {
        return null;
    }

    @Override
    public boolean hasHistory(Correction correction) {
        return false;
    }
}
