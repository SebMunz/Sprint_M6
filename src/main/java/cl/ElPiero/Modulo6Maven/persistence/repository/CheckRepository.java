package cl.ElPiero.Modulo6Maven.persistence.repository;

import cl.ElPiero.Modulo6Maven.domain.dto.CheckVisit;
import cl.ElPiero.Modulo6Maven.domain.repository.ICheckDomainRepository;
import cl.ElPiero.Modulo6Maven.persistence.crud.IChekVisitasCrudRepository;
import cl.ElPiero.Modulo6Maven.persistence.entity.CheckVisitas;
import cl.ElPiero.Modulo6Maven.persistence.mapper.ICheckMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * El Piero
 *
 * @author El Piero tiene sueño
 * @version 0.0.1
 * @since 28-06-2022
 */
@Repository
public class CheckRepository implements ICheckDomainRepository {

    private final IChekVisitasCrudRepository iCheckCrudRespository;
    private final ICheckMapper checkMapper;

    public CheckRepository(IChekVisitasCrudRepository iCheckCrudRespository, ICheckMapper checkMapper) {
        this.iCheckCrudRespository = iCheckCrudRespository;
        this.checkMapper = checkMapper;
    }


    @Override
    public List<CheckVisit> findAll() {
        return checkMapper.toCheckVisitList((List<CheckVisitas>) iCheckCrudRespository.findAll());
    }

    @Override
    public Optional<CheckVisit> findById(Integer checkId) {
        return iCheckCrudRespository.findById(checkId).map(checkMapper::toCheckVisit);
    }

    @Override
    public CheckVisit save(CheckVisit checkVisit) {
        return checkMapper.toCheckVisit(iCheckCrudRespository.save(checkMapper.toCheckVisitas(checkVisit)));
    }

    @Override
    public void delete(Integer checkId) {
        iCheckCrudRespository.deleteById(checkId);
    }
}
