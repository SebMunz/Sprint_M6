package cl.ElPiero.Modulo6Maven.web.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(value="/inicio")
public class InicioController {

    Log logger = LogFactory.getLog(InicioController.class);
    @GetMapping
    public String inicio(){

        logger.info("Estás en el home");
        return "index";
    }
}
