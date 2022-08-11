package cl.ElPiero.Modulo6Maven.web.controller;

import cl.ElPiero.Modulo6Maven.domain.dto.User;
import cl.ElPiero.Modulo6Maven.domain.dto.Visit;
import cl.ElPiero.Modulo6Maven.domain.service.VisitasService;
import cl.ElPiero.Modulo6Maven.persistence.repository.CapacitacionRepository;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * El Piero tiene sueño
 *
 * @author El Piero tiene sueño
 * @version 0.0.1
 * @since 28-06-2022
 */
@Controller
@RequestMapping(value="/visitas")
public class VisitasController {
    Log logger = LogFactory.getLog(CapacitacionRepository.class);
    private final VisitasService visitasServicee;

    public VisitasController(VisitasService visitasServicee) {
        this.visitasServicee = visitasServicee;
    }


    @GetMapping("/list")
    public String listarVisitas(Model model){
        model.addAttribute("visitas",visitasServicee.getAll());
        return "listarVisitas";
    }

    @GetMapping("/nuevaVisita")
    public String nuevaVisita(Model model){
        model.addAttribute("visit", new Visit());
        return "crearVisita";
    }
    @PostMapping("/saveVisita")
    public String save(@ModelAttribute Visit visit){
        visitasServicee.save(visit);
        return "redirect:/visitas/list";
    }
    @GetMapping("/{id}")
    public String editar(@PathVariable("id") Integer visitId, Model model){
        model.addAttribute("visit",visitasServicee.getOne(visitId).get());

        return "editarVisita";
    }

    @GetMapping("/del/{identif}")
    public String delete(@PathVariable("identif") Integer visit){
        visitasServicee.delete(visit);

        return "redirect:/visitas/list";
    }
}
