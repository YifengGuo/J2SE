package FrequentlyUsedClasses;

public abstract class TestString {
	public static void main(String args[]){
		String s = "ADDSAFDdsafgetfhDS&*%^&&58497 _ dsafwrfaDNASUWdus";
		int lowerCount = 0;
		int upperCount = 0;
		int otherCount = 0;
		/*for(int i = 0;i<s.length();i++){//����һ
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
			/*if(sL.indexOf(c)!=-1)*///������
			if(Character.isLowerCase(c))//������
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
		
		
		String l = "sunjavasuehujavagoodjavasmilejavashietidfaksajifjava";//��ĳ�ַ�����ĳ�Ӵ��ĸ���
		String lToFind = "java";
		int count1 = 0;
		int index =0;
		
		while(l.indexOf(lToFind)!=-1){
			index = l.indexOf(lToFind);
			l = l.substring(index + lToFind.length());//���شӵڣ�index+���Ҵ�����֮����ַ�����
			count1++;
		}
		System.out.println(count1);
	}
}
