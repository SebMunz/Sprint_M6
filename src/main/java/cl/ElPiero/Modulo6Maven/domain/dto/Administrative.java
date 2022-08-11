package cl.ElPiero.Modulo6Maven.domain.dto;

import javax.persistence.Column;

/**
 * El Piero
 *
 * @author El Piero tiene sueño
 * @version 0.0.1
 * @since 28-06-2022
 */
public class Administrative {
    private String area;
    private String previousExperience;

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getPreviousExperience() {
        return previousExperience;
    }

    public void setPreviousExperience(String previousExperience) {
        this.previousExperience = previousExperience;
    }
}
