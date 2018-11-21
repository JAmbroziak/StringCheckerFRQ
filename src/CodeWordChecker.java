public class CodeWordChecker implements StringChecker {
    private int minLength;
    private int maxLength;
    private String badChar;

    public CodeWordChecker(int minLength, int maxLength, String badChar){
        this.minLength = minLength;
        this.maxLength = maxLength;
        this.badChar = badChar;
    }

    public CodeWordChecker(String badChar){
        this.minLength = 6;
        this.maxLength = 20;
        this.badChar = badChar;
    }

    public boolean isValid(String str){
        if(str.length() > this.maxLength || str.length() < this.minLength){
            return false;
        }
        if(str.contains(this.badChar)){
                return false;
            }
        return true;
    }
}
