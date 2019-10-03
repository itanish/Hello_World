import java.util.*;
class ShiftCipher
{
	public static void main(String args[])
	{	
		String plain;
		String encrypted="";
		String decrypted="";
		int key,x;
		char cipher,dec;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the plain Text without Space");
		plain= sc.nextLine();
		System.out.println("Plain Text is: - " +plain);
		System.out.println("Enter the key for Encrypting the Plain Text");
		key= sc.nextInt();
		for(int i=0;i<plain.length();i++)
		{
				int a =plain.charAt(i);
				x=(a-32)+key;
				if(x < 90)
				{
					cipher= (char)((x));
				}
				else
				{
					cipher= (char) ((int)x-26);
				}
				encrypted += cipher; 
		}
		System.out.println("Cipher text is: - " +encrypted);
		System.out.println("Enter the key for receiver");
		int rkey=sc.nextInt();
		if(rkey==key)
		{
				for(int i=0;i<encrypted.length();i++)
				{
					int b= encrypted.charAt(i);
					int p = (b+32)-key;
					if(p < 97)
					{
						dec= (char) ((int)p+26);
					}
					else
					{
						dec=(char)((p));
					}
					decrypted += dec;
				}
				System.out.println("Decrpted text is: - " +decrypted);
				
  		}
		else
		{
			System.out.println("The key entered is not valid");
		}
	}
}