import java.io.*;

class StrategyPatternDemo{
    public static void main(String[] args) throws IOException {
        Context context = new Context();
        String fileName = args[0];
        
        System.out.println("\nDefault(All):");
        context.filter(fileName);
        
        System.out.println("\nStartWithT:");
        context.changeStrategy(new StartWithT());
        context.filter(fileName);
        
        System.out.println("\nLongerThanFive:");
        context.changeStrategy(new LongerThanFive());
        context.filter(fileName);
        
        System.out.println("\nDetectPalindrome:");
        context.changeStrategy(new DetectPalindrome());
        context.filter(fileName);
    }
}