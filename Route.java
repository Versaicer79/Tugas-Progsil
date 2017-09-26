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
@Table(name = "route")
public class Route {
    @Id
    @GeneratedValue(stategy = GenerationType.IDENTITY)
    private Long routeId;
    private String routeName;
    private String isValid;

    public Long getRouteId() {
        return routeId;
    }

    public void setRouteId(Long routeId) {
        this.routeId = routeId;
    }

    public String getRouteName() {
        return routeName;
    }

    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }

    public String getIsValid() {
        return isValid;
    }

    public void setIsValid(String isValid) {
        this.isValid = isValid;
    }
}
