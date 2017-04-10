package FrequentlyUsedClasses;

public abstract class TestString {
	public static void main(String args[]){
		String s = "ADDSAFDdsafgetfhDS&*%^&&58497 _ dsafwrfaDNASUWdus";
		int lowerCount = 0;
		int upperCount = 0;
		int otherCount = 0;
		/*for(int i = 0;i<s.length();i++){//方法一
			char c = s.charAt(i);
			if(c>='a'&&c<='z'){
				lowerCount++;
			}
			else if(c>='A'&&c<='Z'){
				upperCount++;
			}
			else{
				otherCount++;
			}
		}*/
		
		
		String sL = "abcdefghijklmnopqrstuvwxyz";
		String sU = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for(int i = 0;i<s.length();i++){
			char c = s.charAt(i);
			/*if(sL.indexOf(c)!=-1)*///方法二
			if(Character.isLowerCase(c))//方法三
			{
				lowerCount++;
			}
			else if(sU.indexOf(c)!=-1){
				upperCount++;
			}
			else{
				otherCount++;
			}
		}	
		System.out.println(lowerCount+" "+upperCount+" "+otherCount);
		
		
		String l = "sunjavasuehujavagoodjavasmilejavashietidfaksajifjava";//求某字符串中某子串的个数
		String lToFind = "java";
		int count1 = 0;
		int index =0;
		
		while(l.indexOf(lToFind)!=-1){
			index = l.indexOf(lToFind);
			l = l.substring(index + lToFind.length());//返回从第（index+被找串）个之后的字符串。
			count1++;
		}
		System.out.println(count1);
	}
}
