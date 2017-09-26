package com.smk.bi.ticketing.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * // TODO Comment
 */
// Nama Coenraad Samuel Marco Hursepuny
// NIS 16.10.1.066
@Entity
@Table(name = "city")
public class City {
    @Id
    @GeneratedValue(stategy = GenerationType.IDENTITY)
    private Long cityId;
    private String cityName;
    private String isValid;

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getIsValid() {
        return isValid;
    }

    public void setIsValid(String isValid) {
        this.isValid = isValid;
    }
}
