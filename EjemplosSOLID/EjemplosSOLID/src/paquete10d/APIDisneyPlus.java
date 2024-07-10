package paquete10d;

public class APIDisneyPlus implements APIMovie{
        
    private String apiKey;
    
    @Override
    public void establecerApiKey(String ak){
        apiKey = ak+"808080";
    }
    
    @Override
    public String obtenerApiKey(){
        return apiKey;
    }
    
}