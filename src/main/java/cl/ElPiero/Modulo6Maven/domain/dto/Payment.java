package cl.ElPiero.Modulo6Maven.domain.dto;

import cl.ElPiero.Modulo6Maven.persistence.entity.Capacitacion;

import javax.persistence.*;
import java.util.List;

/**
 * El Piero
 *
 * @author El Piero tiene sueño
 * @version 0.0.1
 * @since 28-06-2022
 */
public class Payment {

    private Integer payId;
    private Integer customerId;
    private Integer statusPayId;
    private Integer trainingId;
    private Integer amount;
    private String payDate;
    private String payType;
    private Integer totalToPay;
    private Integer accumulatedPayments;
    private Training training;

    private Integer userId;

    private User user;

    public Integer getPayId() {
        return payId;
    }

    public void setPayId(Integer payId) {
        this.payId = payId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getStatusPayId() {
        return statusPayId;
    }

    public void setStatusPayId(Integer statusPayId) {
        this.statusPayId = statusPayId;
    }

    public Integer getTrainingId() {
        return trainingId;
    }

    public void setTrainingId(Integer trainingId) {
        this.trainingId = trainingId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getPayDate() {
        return payDate;
    }

    public void setPayDate(String payDate) {
        this.payDate = payDate;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public Integer getTotalToPay() {
        return totalToPay;
    }

    public void setTotalToPay(Integer totalToPay) {
        this.totalToPay = totalToPay;
    }

    public Integer getAccumulatedPayments() {
        return accumulatedPayments;
    }

    public void setAccumulatedPayments(Integer accumulatedPayments) {
        this.accumulatedPayments = accumulatedPayments;
    }

    public Training getTraining() {
        return training;
    }

    public void setTraining(Training training) {
        this.training = training;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
