package week3.day2;

public class FindTypes {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
			int l=0;
			int s=0;
			int d=0;
			int spl=0;
			char[] cs = test.toCharArray();
		for (int i = 0; i < cs.length; i++) {
			{if(Character.isLetter(cs[i]))
			
			{
				l++;
			}else if(Character.isDigit(cs[i]))
			{
				d++;
			}else if(Character.isSpace(cs[i]))
			{
				s++;
			}else {
				{spl++;
				}
				}
			}
		}	System.out.println("count of letters"+l);
		System.out.println("count of disgits"+d);
		System.out.println("count of space"+s);
		System.out.println("count of spl"+spl);
	}

}
