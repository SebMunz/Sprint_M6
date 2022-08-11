package cl.ElPiero.Modulo6Maven.domain.dto;

/**
 * Modulo 6
 *
 * @author El Piero tiene sueño
 * @version 0.0.1
 * @since 28-06-2022
 */
public class Training {

    private Integer trainingId;
    private Integer customerId;
    private String day;
    private String hour;
    private String place;
    private String duration;
    private Integer numberAttendees;

    public Training() {
    }

    public Integer getTrainingId() {
        return trainingId;
    }

    public void setTrainingId(Integer trainingId) {
        this.trainingId = trainingId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Integer getNumberAttendees() {
        return numberAttendees;
    }

    public void setNumberAttendees(Integer numberAttendees) {
        this.numberAttendees = numberAttendees;
    }
}
