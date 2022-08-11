package cl.ElPiero.Modulo6Maven.persistence.repository;

import cl.ElPiero.Modulo6Maven.domain.dto.Visit;
import cl.ElPiero.Modulo6Maven.domain.repository.IVisitasDomeinRespoitory;
import cl.ElPiero.Modulo6Maven.persistence.crud.IVisitasCrudRespository;
import cl.ElPiero.Modulo6Maven.persistence.entity.Visitas;
import cl.ElPiero.Modulo6Maven.persistence.mapper.IVisitasMapper;
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
public class VisitasRepository implements IVisitasDomeinRespoitory {

    private final IVisitasCrudRespository iVisitasCrudRespository;
    private final IVisitasMapper visitasMapper;

    public VisitasRepository(IVisitasCrudRespository iVisitasCrudRespository, IVisitasMapper visitasMapper) {
        this.iVisitasCrudRespository = iVisitasCrudRespository;
        this.visitasMapper = visitasMapper;
    }

    @Override
    public List<Visit> findAll() {
        return visitasMapper.toVisitList((List<Visitas>) iVisitasCrudRespository.findAll());
    }

    @Override
    public Optional<Visit> findById(Integer visitId) {
        return iVisitasCrudRespository.findById(visitId).map(visitasMapper::toVisit);
    }

    @Override
    public Visit save(Visit visit) {
        return visitasMapper.toVisit(iVisitasCrudRespository.save(visitasMapper.toVisitas(visit)));
    }

    @Override
    public void delete(Integer visitId) {
        iVisitasCrudRespository.deleteById(visitId);
    }
}
