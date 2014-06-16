
public class MiClase
{
	//Tarea en Grupo
		//Junior Zelaya
		//Adalid Solis
		//Kevin Lanza
		//Maynor Morales
	
	//devuelve la suma de a y b
	
	static int sumarNumeros(int a, int b)
	{
		return a+b;
	}
	
	//devuelve la resta de a y b
	static int restarNumeros(int a, int b)
	{
		return a-b;
	}
	
	//devuelve la multiplicación de a y b
	static int multiplicarNumeros(int a, int b)
	{
		return a*b;
	}
	
	//devuelve true si num es par, de lo contrario, devuelve false
	static boolean esPar(int num)
	{
		if ((num % 2)==0)
		return true;
		{			
		return false;
		}
	}
	
	//devuelve el numero mayor entre a, b o c
	////Primero creamos la variable resultado para almacenar el resultado
	static int getMayor(int a, int b, int c){
	//Evaluamos las condiciones para averiguar que variable es menor
	//comparando el valor entre ellas.
	int resultado=0;
	
	{
		 if ((a > b) && (a > c)) 
		 { 
	      return a;
		 }
		        
	     if ((b > a) && (b > c)) 
	     {
	    	 return b;
	     }
	              
	      if ((c > a) && (c > b))
	      { 
	       return c;
	      }
	}     
	//Para cada evaluacion activamos la funcion y la almacenamos en nuestra variable
	//resultado listo para mostrar en pantalla
	 return resultado;          
}       
	  
	
	
	//devuelve num elevado a la potencia
	//Ayuda externa https://espanol.answers.yahoo.com/question/index?qid=20110223162444AAlGRhU
	static int potencia(int num, int potencia)
	{
	//creamos la varible potencia para que retorne nuestro resultado. 
	//despues utilizamos Math.pow para que multiplique nuestro numero y nuestra potencia
		potencia=(int) Math.pow(num,potencia);
		return potencia;
	}
	
	//devuelve el numero mayor del arreglo
	static int sumarArreglo(int arreglo[])
	{
	// creamos nuestra variable de suma para almacenar el proceso 		 
		int suma=0;
	//establecemos un ciclo con una variable contadora, que almacene el dato del numero
	//anterior del arreglo y por cada ves que sume la variable contadora sume el 
	//numero de nuestro arreglo.	
		for (int i=0; i< arreglo.length ;i++) 
		suma+=arreglo[i]; 
		
		return suma;
		
		}

	
	//devuelve el numero mayor de un arreglo
    static int getMayorArreglo(int arreglo[])
    {
     //Establecemos nuestra variable resultado para que retorne nuestro calculo
    // Luego con el ciclo FOR evaluamos gracias a nuestra variable contadora
    // por cada ves que se repita evaluara cual es el mayor.	
        int resultado = arreglo[0]; 
        
        for(int x=0; x<arreglo.length; x++) 
        { 
            if(arreglo[x] > resultado) 
        { 
                resultado = arreglo[x]; 
        } 
        } 
            return resultado; 
    }
    
    
	//devuelve el numero menor de un arreglo
    static int getMenorArreglo(int arreglo[])
    //Establecemos nuestra variable resultado para que retorne nuestro calculo
   // Luego con el ciclo FOR evaluamos gracias a nuestra variable contadora
   // por cada ves que se repita evaluara cual es el menor.
    {
        
        int resultado = arreglo[0]; 
        
        for(int x=0; x<arreglo.length; x++) 
        { 
            if(arreglo[x] < resultado) 
        { 
                resultado = arreglo[x]; 
        } 
        } 
            return resultado; 
    }
	//devuelve true si encuentra cadena dentro arreglo
    static boolean existe(String arreglo[],String cadena)
    {
       //Primeramentos vamos evaluando la condicion gracias a nuestra variable X en ciclo FOR
    	// ya en la funcion IF evalua si hay una cadena de texto si la hay muestra valor true
    	// de lo contrario false
        for(int x=0; x<arreglo.length; x++)
        {
            if(arreglo[x].equals(cadena))
        {
                return true;
        }
        }
            return false;
    }
    
	public static void main(String args[])
	{
		System.out.print("lo que sea");
	}
}
