package paquete10d;

public class APIDgo implements APIMovie{
    
    private String apiKey;
    
    @Override
    public void establecerApiKey(String ak){
        apiKey = ak+"102050";
    }
    
    @Override
    public String obtenerApiKey(){
        return apiKey;
    }
    
}
