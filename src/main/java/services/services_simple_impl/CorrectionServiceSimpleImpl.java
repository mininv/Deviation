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
    //нужен ли тут логгер???
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
    public void addCorrection(Deviation deviation, Correction correction, User user) {
        correction.setDateOfCorrection(deviation.getAppearsDate());
        correction.getDateOfWorkOnDeviation();
        correction.setDevForCorrect(deviation);//setDeviation
        this.correctionRepository.save(correction);
    }

    @Override
    public void removeCorrection(Correction correction, User user) {
        this.correctionRepository.delete(correction);
    }

    @Override
    public void updateCorrection(Correction correction, User user) {
        correction.getCorrectionDescription();
        this.correctionRepository.save(correction);
    }

    @Override
    public List<Correction> findCorrectionHistory(Correction correction) {
       /* for (Correction corr:this.correctionRepository.findByCorrectionHistory(correction)){
            return this.correctionRepository.findByCorrectionHistory(correction);
        }*/
        return null;//this.correctionRepository.fi;
    }

    @Override
    public boolean hasHistory(Correction correction){
        for (Correction corr:this.correctionRepository.findByHasHistory(correction)){
            return true;
        }
        return false;
    }
}
