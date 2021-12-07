package com.company.reactive.springreactive.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "supercar")
public class SuperCar {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name="engineCapacity")
    private int engineCapacity;

    private int fuel;

    @Column(name="manfDate")
    private Date manfDate;

    @Column(name="sellingDate")
    private Date sellingDate;

    private String type;

    private String vin;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the engineCapacity
     */
    public int getEngineCapacity() {
        return engineCapacity;
    }

    /**
     * @param engineCapacity the engineCapacity to set
     */
    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    /**
     * @return the fuel
     */
    public int getFuel() {
        return fuel;
    }

    /**
     * @param fuel the fuel to set
     */
    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    /**
     * @return the manfDate
     */
    public Date getManfDate() {
        return manfDate;
    }

    /**
     * @param manfDate the manfDate to set
     */
    public void setManfDate(Date manfDate) {
        this.manfDate = manfDate;
    }

    /**
     * @return the sellingDate
     */
    public Date getSellingDate() {
        return sellingDate;
    }

    /**
     * @param sellingDate the sellingDate to set
     */
    public void setSellingDate(Date sellingDate) {
        this.sellingDate = sellingDate;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the vin
     */
    public String getVin() {
        return vin;
    }

    /**
     * @param vin the vin to set
     */
    public void setVin(String vin) {
        this.vin = vin;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    
    @Override
    public String toString() {
        return "SuperCar [engineCapacity=" + engineCapacity + ", fuel=" + fuel + ", id=" + id + ", manfDate=" + manfDate
                + ", sellingDate=" + sellingDate + ", type=" + type + ", vin=" + vin + "]";
    }

    

    
}
