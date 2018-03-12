import java.io.*;
import java.util.*;

class Context{
    CheckStrategy strategy;
    
    Context(){
        this.strategy = new All();
    }
    
    void changeStrategy(CheckStrategy strategy){
        this.strategy = strategy;
    }
    
    void filter(String fileName) throws IOException{
        BufferedReader infile = new BufferedReader(new FileReader(fileName));
        String buffer = null;
        while((buffer = infile.readLine()) != null){
            StringTokenizer words = new StringTokenizer(buffer);
            while(words.hasMoreTokens()){
                String word = words.nextToken();
                if(strategy.check(word)){
                    System.out.println(word);
                }
            }
        }
    }
}
                                                  