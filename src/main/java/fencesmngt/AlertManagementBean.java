package fencesmngt;

import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class AlertManagementBean {

    private List<AlarmEntry> alarmList;
    private AlarmEntry alarmEntry;

    public AlertManagementBean() {
        alarmList = new ArrayList<AlarmEntry>();        
        for (int i=0; i<10; i++) {
            AlarmEntry ae = new AlarmEntry();
            ae.alarmId = ""+i;
            ae.alarmCode = ""+i;
            ae.description = ""+i;
            alarmList.add(ae);
        }
        
    }

    public void createAlarm() {
        alarmEntry = new AlarmEntry();
        alarmList.add(alarmEntry);        
    }

    public List<AlarmEntry> getAlarmList() {
        return alarmList;
    }

    public void setAlarmList(List<AlarmEntry> alarmList) {
        this.alarmList = alarmList;
    }

    public AlarmEntry getAlarmEntry() {
        return alarmEntry;
    }

    public void setAlarmEntry(AlarmEntry alarmEntry) {
        this.alarmEntry = alarmEntry;
    }
    



}
