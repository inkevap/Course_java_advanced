package Tarea4;

import java.util.HashMap;

public class OptionParser {
    private HashMap<String,String> options = new HashMap<>();

    private String []args;

    public OptionParser(String []args){ this.args = args;}
    public void OptionRegister(String optionName){
        options.put(optionName,"" );
    }
    public String getOption(String optionName){
        return options.get(optionName);
    }
    public void parse(){
        for(int i = 0;i< args.length;i++){
            String optionName =args[i].replace("--", "").toLowerCase();
            if(options.containsKey(optionName)){
                options.replace(optionName, args[i+1]);
                i++;
            }
        }
    }
}
