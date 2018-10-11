import java.util.Scanner; 
import static java.lang.Math.abs; 

public class lesson1 { 

public static void main(String[] args){ 
output();
hello();
checkNumber();
} 
public static void output(){
StringBuilder sb = new StringBuilder("Hello!"); 
sb.append( " My name is Dasha" ); 
sb.append( ":)" ); 
System.out.println( sb.toString() ); 
}
public static void hello(){
Scanner scanner = new Scanner( System.in ); 
System.out.print( "Введете слово:" ); 
String string = scanner.nextLine(); 
System.out.println( "Hello, "+string ); 
}

public static void checkNumber(){
Scanner scanner = new Scanner( System.in ); 
System.out.print( "Введете целое число:" ); 
while (true) { 
int num = scanner.nextInt(); 
if (num < 0) { 
System.out.println( abs( num ) ); 
break; 
} else if (num > 0) { 
System.out.println( num * 2 ); 
break; 
} else { 
System.out.print( "Вы ввели 0. Введите число еще раз:" ); 
     } 
   } 
}

public static boolean checkArray(int[] array){ 
if(array.length>0 && array[0]==array[array.length-1]){ 
return true; 
}else{ 
return false; 
} 
} 

}
