package fencesmngt;

public class FenceEntry {
    String name;
    String description;
    String centerLon;
    String centerLat;
    String radius;
    Boolean enabled;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCenterLon() {
        return centerLon;
    }

    public void setCenterLon(String centerLon) {
        this.centerLon = centerLon;
    }

    public String getCenterLat() {
        return centerLat;
    }

    public void setCenterLat(String centerLat) {
        this.centerLat = centerLat;
    }

    public String getRadius() {
        return radius;
    }

    public void setRadius(String radius) {
        this.radius = radius;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
    
    
}
