
package shipping;


public class Company {

    private String companyName;
    private String currentProject;
    
    public void setName(String companyName ){
        this.companyName=companyName;
        
    }
    public void setProject(String currentProject){
         this.currentProject=currentProject;
    }
    public String getName(){
        return companyName;
    }
    public String getProject(){
         return currentProject;

    }
}
