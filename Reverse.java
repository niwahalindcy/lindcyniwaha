package assignment;

public class Reverse {
	public static void main(String[] args) {
		String sentence = "Go work";
		String reversed = reserve(sentence);
		System.out.println("The reversed sentence is:" + reversed);
		
		
	}
    public static String reserve(String sentence) {
    	if (sentence.isEmpty())
    		return sentence;
    	return reserve(sentence.substring(1)) + sentence.charAt(0);
    }
}


