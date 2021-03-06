package Model;

import java.util.Date;

/**
 * @author DL
 */
public class Subscription
{
    private double Cost;
    private Date SubDateTime;
    private String description;
    private float SubLength;
    
    public Subscription(){
        Cost = 0;
        SubDateTime = new Date();
        description = "text.. ";
        SubLength = 0;
    }
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

    @Override
    public String toString() {
        return "Subscription{" + "Cost=" + Cost + ", SubDateTime=" + SubDateTime + ", description=" + description + ", SubLength=" + SubLength + '}';
    }
    
    
}
