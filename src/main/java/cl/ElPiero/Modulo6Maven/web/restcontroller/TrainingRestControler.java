package cl.ElPiero.Modulo6Maven.web.restcontroller;

import cl.ElPiero.Modulo6Maven.domain.dto.Training;
import cl.ElPiero.Modulo6Maven.domain.service.CapacitacionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Módulo 6
 *
 * @author El Piero tiene sueño
 * @version 0.0.1
 * @since 28-06-2022
 */
@RestController
@RequestMapping("/api/trainings")
public class TrainingRestControler {
    private final CapacitacionService capaService;

    public TrainingRestControler(CapacitacionService capaService) {
        this.capaService = capaService;
    }
    @GetMapping("/all")
    public ResponseEntity<List<Training>> findAll(){
        System.out.println("pase por el all");
        return new ResponseEntity<>(capaService.getAll(),HttpStatus.OK);
    }

    @GetMapping("/{trainingId}")
    public ResponseEntity<Training> findById(@PathVariable("trainingId") Integer trainingId){
        return capaService.getOne(trainingId)
                .map(training -> new ResponseEntity<>(training,HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    public ResponseEntity<Training> save(@RequestBody Training training){
        return new ResponseEntity<>(capaService.save(training), HttpStatus.OK);
    }
}
