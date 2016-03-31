package fencesmngt;


public class AlarmEntry {
    String alarmId;
    String alarmCode;
    Boolean enable;
    String name;
    Boolean enableMailAlarm;
    String description;
    String mailAddress;
    String intersection;
    String directions;

    public String getAlarmCode() {
        return alarmCode;
    }

    public void setAlarmCode(String alarmCode) {
        this.alarmCode = alarmCode;
    }

    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getEnableMailAlarm() {
        return enableMailAlarm;
    }

    public void setEnableMailAlarm(Boolean enableMailAlarm) {
        this.enableMailAlarm = enableMailAlarm;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMailAddress() {
        return mailAddress;
    }

    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }

    public String getIntersection() {
        return intersection;
    }

    public void setIntersection(String intersection) {
        this.intersection = intersection;
    }

    public String getDirections() {
        return directions;
    }

    public void setDirections(String directions) {
        this.directions = directions;
    }
    
}
