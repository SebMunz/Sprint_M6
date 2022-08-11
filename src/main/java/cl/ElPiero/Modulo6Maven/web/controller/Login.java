package cl.ElPiero.Modulo6Maven.web.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Sprint Final Modulo 6
 *
 * @author El Piero tiene sueño
 * @version 0.0.1
 * @since 28-06-2022
 */
@Controller
@RequestMapping("/login")
public class Login {
    Log logger = LogFactory.getLog(InicioController.class);
    @GetMapping
    public String inicio(){

        logger.info("Estás en el login");
        return "login";
    }
}
