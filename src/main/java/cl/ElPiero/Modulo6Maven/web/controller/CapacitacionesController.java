package cl.ElPiero.Modulo6Maven.web.controller;

import cl.ElPiero.Modulo6Maven.domain.dto.Training;
import cl.ElPiero.Modulo6Maven.domain.service.CapacitacionService;
import cl.ElPiero.Modulo6Maven.persistence.entity.Capacitacion;
import cl.ElPiero.Modulo6Maven.persistence.repository.CapacitacionRepository;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping(value="/capacitaciones")
public class CapacitacionesController {

    Log logger = LogFactory.getLog(CapacitacionRepository.class);
    private final CapacitacionService capaService;

    public CapacitacionesController(CapacitacionService capaService) {
        this.capaService = capaService;
    }

    @GetMapping
    public String listarCapacitaciones(Model model){

       model.addAttribute("capacitaciones",capaService.getAll());
        return "listarCapacitacion";
    }

    @GetMapping("/{id}")
    public String editarCapacitacion(@PathVariable("id") Integer identificador, Model model){
        logger.warn(capaService.getOne(identificador).toString());
        model.addAttribute("capacitacion",capaService.getOne(identificador).get());

        return "capacitacionForm";
    }

    @GetMapping("/crear")
    public String crearCapacitacion(Model model){
        model.addAttribute("training", new Training());
        return "crearCapacitacion";
    }

    @PostMapping("/postCreaCapa")
    public String guardarNuevaCapacitacion(@ModelAttribute Training training){
        capaService.save(training);
        logger.info("Se envía nueva capacitación");
       logger.info(training.toString());

        return "redirect:/capacitaciones";
    }

    @GetMapping("/del/{identif}")
    public String delete(@PathVariable("identif") Integer training){
        capaService.delete(training);

        return "redirect:/capacitaciones";
    }

}
