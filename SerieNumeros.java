
public class SerieNumeros
{
    public int proceso (int num){
     int [] serie = new int [4];
     serie [0]= 1;
     serie [1]= 2;
     serie [2]= 3;
     serie [3]= 2;
     int aux=0;
     int pepe = 1;
      for (int i=1;i <num ;i++){
        if (aux == 4)
        {
            aux =0;
        }
        pepe = pepe + serie[aux];
        aux++;
     } 
     return pepe;
   }
   public  int Padovan (int n)
      {  /* Ejercicio 2
         Genera hasta el n-simo 
         termino de la sucesión padovan*/
        int a1 , a2 , a3;
        a1= a2= a3 = 1;
        int d = 1;
        int i = 3;
          while (i < n)
        { d = a1 + a2;
          a1 = a2;
          a2 = a3;
          a3 = d;
          i= i+1;
        }
        return d;
      }
}
