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
public class Rails {
    @Id
    @GeneratedValue(stategy = GenerationType.IDENTITY)
    private Long railsId;
    private String railsName;
    private Long capacity;

    public Long getRailsId() {
        return railsId;
    }

    public void setRailsId(Long railsId) {
        this.railsId = railsId;
    }

    public String getRailsName() {
        return railsName;
    }

    public void setRailsName(String railsName) {
        this.railsName = railsName;
    }

    public Long getCapacity() {
        return capacity;
    }

    public void setCapacity(Long capacity) {
        this.capacity = capacity;
    }
}
