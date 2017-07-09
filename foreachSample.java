import java.util.*;
import java.lang.*;
import java.io.*;
/* Name of the class has to be "Main" only if the class is public. */
class foreachSample
{
public static void main (String[] args) throws java.lang.Exception
{
int[] myintArray;
myintArray = new int[10];
myintArray[0]=10;
myintArray[1]=20;
myintArray[2]=30;
int result = 0;
for (int i : myintArray)
result += i;
System.out.println("Array sum " + result);
}
}
