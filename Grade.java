enum Grade{ // A 90-100 B 80-89 C 70-79 D 60-69 F 0-59  
    A("90-100"),B("80-89"),C("70-79"),D("60-69"),F("0-59"); //Object
    
    private String value; //encapsulation
    
    private Grade(String value){
        this.value = value;
    }
    
    public String getValue(){
        return this.value;
    }
}