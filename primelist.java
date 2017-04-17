import java.*;
class primelist
{
public static void main(String args[])
{
int sl,el,i,k,j;
Scanner sc=new Scanner(System.in);
   //enter the starting and ending limit
sl=sc.nextInt();
el=sc.nextInt();
for(i=sl;i<el;i++)
{
k=0;
for(j=2;j<i;j++)
{
if(i%j==0)
k=1;
}
if(k==0)
System.out.println(i);
}}}
