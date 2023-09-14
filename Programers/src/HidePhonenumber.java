
public class HidePhonenumber {
	public String solution(String phone_number) {
		String answer = "";
        String[]num=new String[phone_number.length()];
        char c;
      
        for(int i=0; i<phone_number.length()-4;i++){
           c=phone_number.charAt(i);
           num[i].equals(c);
            
        }
        return phone_number;
    }

	
}
