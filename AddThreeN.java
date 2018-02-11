
/**
 * Write a description of class AddThreeN here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AddThreeN
{
    
    static int Adicion(int a,int b,int c)
    {
        int resultado= 0;
        
        resultado=a+b+c;
        
        return resultado;
    }

    public static void main(String args[]){
        
        int A= 10;
        int B= 20;
        int C= 5;
        
        System.out.println(+A);
        System.out.println(+B);
        System.out.println(+C);
        System.out.println(Adicion(A,B,C));        
    }

}
