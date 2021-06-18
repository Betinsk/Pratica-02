
import java.util.Scanner;
public class Exercicio05 {



	    public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
	
	            
	        System.out.print("Digite o lado X:");
	       int  X = sc.nextInt();
	        
	        System.out.print("Digite o lado Y:");
	       int Y = sc.nextInt(); 
	        
	        System.out.print("Digite o lado Z:");
	       int Z = sc.nextInt();
	     
	      
	      if (X==0 && Y==0 && Z==0){
	          System.out.println("Não são lados validos para um triangulo");
	           
	      }
	      else if (Y > X+Z){
	          System.out.println("Não são lados validos para um triangulo");
	      
	      }
	      else if (Z > X+Y){
	          System.out.println("Não são lados validos para um triangulo");
	      
	      }
	      else if(X > Y+Z){
	          System.out.println("Não são lados validos para um triangulo");
	      }
	              
	      else {
	          System.out.println("São valores validos para um triangulo");
	      
	      }

	      
	    sc.close();
	}


}
