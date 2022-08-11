package cl.ElPiero.Modulo6Maven.domain.dto;

/**
 * El Piero
 *
 * @author El Piero tiene sueño
 * @version 0.0.1
 * @since 28-06-2022
 */
public class CheckVisit {
    private Integer checkId;
    private String description;
    private Boolean statusCheck;

    public Integer getCheckId() {
        return checkId;
    }

    public void setCheckId(Integer checkId) {
        this.checkId = checkId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getStatusCheck() {
        return statusCheck;
    }

    public void setStatusCheck(Boolean statusCheck) {
        this.statusCheck = statusCheck;
    }
}
