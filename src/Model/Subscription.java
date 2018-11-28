package Model;

import java.sql.Date;

/**
 * @author DL
 */
public class Subscription
{
    private double Cost;
    private Date SubDateTime;
    private String description;
    private float SubLength;
    
    Subscription(){}

    public Subscription(double Cost, Date SubDateTime, String description, float SubLength) {
        this.Cost = Cost;
        this.SubDateTime = SubDateTime;
        this.description = description;
        this.SubLength = SubLength;
    }

    public double getCost() {
        return Cost;
    }

    public Date getSubDateTime() {
        return SubDateTime;
    }

    public String getDescription() {
        return description;
    }

    public float getSubLength() {
        return SubLength;
    }

    public void setCost(double Cost) {
        this.Cost = Cost;
    }

    public void setSubDateTime(Date SubDateTime) {
        this.SubDateTime = SubDateTime;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setSubLength(float SubLength) {
        this.SubLength = SubLength;
    }
    
    
}
