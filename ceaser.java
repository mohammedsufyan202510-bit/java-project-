import java.util.*; 
public class ceaser{
public static void main (String [] args){
Scanner input =new Scanner(System.in);
System.out.print("==== CEASER CIPHER DECODER ===");
System.out.print("enter the word:");
String word=input.next();
while(true){
System.out.print("enter the expected shift:");
int shift=input.nextInt();
for(int i=0;i<word.length();i++){
char let=word.charAt(i);

if (let>='A'&& let<='Z')
System.out.print((char)((let-'A'+shift)%26+'A'));
else if (let>='a'&& let<='z')
System.out.print((char)((let-'a'+shift)%26+'a')); 
}
System.out.println();
System.out.println("type 0 to exit");
if (shift==0)
break;
}

}
}