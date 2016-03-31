package fencesmngt;

import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class FencesManagementBean {

    private List<FenceEntry> fencesList = new ArrayList<FenceEntry>();
    private FenceEntry fenceEntry;

    public FencesManagementBean() {      
    }

    public void createFence() {
        fenceEntry = new FenceEntry();
    }
    
    public void saveNewFence() {
        fencesList.add(fenceEntry);
    }

    public List<FenceEntry> getFencesList() {
        return fencesList;
    }

    public void setFencesList(List<FenceEntry> fencesList) {
        this.fencesList = fencesList;
    }

    public FenceEntry getFenceEntry() {
        return fenceEntry;
    }

    public void setFenceEntry(FenceEntry fenceEntry) {
        this.fenceEntry = fenceEntry;
    }


}
