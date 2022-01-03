package Ëæ»úÖ½ÅÆ;

public class zhipai {

	public static void main(String[] args) {
		String str1=null,str2=null;
		int dian =(int)(Math.random()*13)+1;
		int hua =(int)(Math.random()*4)+1;
		switch(dian) {
		case 1:
			str1="Ace";
			break;
		case 2:
			str1="2";
			break;
		case 3:
			str1="3";
			break;
		case 4:
			str1="4";
			break;
		case 5:
			str1="5";
			break;
		case 6:
			str1="6";
			break;
		case 7:
			str1="7";
			break;
		case 8:
			str1="8";
			break;
		case 9:
			str1="9";
			break;
		case 10:
			str1="Jack";
			break;
		case 11:
			str1="Queen";
			break;
		case 12:
			str1="King";
			break;
		}
		switch(hua) {
		case 1:
			str2="Clubs";
			break;
		case 2:
			str2="Diamonds";
			break;
		case 3:
			str2="Hearts";
			break;
		case 4:
			str2="Spades";
			break;
		}
		System.out.println("The card you picked is "+str1+" of "+str2);
			
		
		

	}

}
