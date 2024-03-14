package Entitys;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Launch {

    @Id
    private String launchId;
    private String provider;

    public String getLaunchId(){
        return this.launchId;
    }
    public String getProvider(){
        return this.provider;
    }
    public void setLaunchId(String launchId){
        this.launchId = launchId;
    }

    public void setProvider(String provider){
        this.provider = provider;
    }
}