import java.io.*;
public class PROYECTOFINAL
{
  private static BufferedReader stdIn=new
    BufferedReader(new InputStreamReader(System.in));
  private static PrintWriter stdOut =new
    PrintWriter(System.out, true);
  public static int principio () throws IOException
  {
    stdOut.println("Bienvenidos a PROYECTOFINAL 1.0");
    stdOut.println("Creado por Mario y Tono -- MARTON SOFTWARE -- Bajo el GPLv2");
    stdOut.println("                      .");
    stdOut.println("                     / V\\ ");
    stdOut.println("                   / `  /");
    stdOut.println("                  <<   |");
    stdOut.println("                  /    |");
    stdOut.println("                /      |");
    stdOut.println("              /        |");
    stdOut.println("            /    \\  \\ /");
    stdOut.println("           (      ) | |");
    stdOut.println("   ________|   _/_  | |");
    stdOut.println(" <__________\\______)\\__)");
    int opcion=0;
    while (opcion!=1 && opcion!=2){
      stdOut.println("Mostrar Menu (1)");
      stdOut.println("SALIR (2)");
      opcion=Integer.parseInt(stdIn.readLine());
      if(opcion!=1 && opcion!=2)
        stdOut.println("¡Opcion invalida, intente de nuevo!");
    }
    return opcion;
  }
  public static int menu () throws IOException
  {
    int opcion=0;
    while (opcion<1 || opcion>11){
      stdOut.println("Menu Principal");
      stdOut.println("1 ");
      stdOut.println("2 BANCOJAVA");
      stdOut.println("3 ");
      stdOut.println("4 ");
      stdOut.println("5 ");
      stdOut.println("6 ");
      stdOut.println("7 ");
      stdOut.println("8 ");
      stdOut.println("9 ");
      stdOut.println("10 ABOUT");
      stdOut.println("11 Salir");
      stdOut.println("Selecciona una opcion del menu utlizando el numero de la linea.");
      opcion=Integer.parseInt(stdIn.readLine());
      if(opcion<1 || opcion>11) {
        //Se le notifica al usuario que la opcion que eliguio esta mal y se le pone un ReadLine para que pueda leerlo.
        stdOut.println("¡Opcion invalida, intente de nuevo! (ENTER)");
        stdIn.readLine();
      }
    }
    return opcion;
  }
  public static void o1 () throws IOException
  {
    int suma= 0;
    int valor =0;
    do{
    System.out.println("dame un valor");
    valor= Integer.parseInt(stdIn.readLine());
    if( valor!=9999)
    suma= suma+valor;
    }
    while( valor!= 9999);
    stdOut.println("El acumulado es igual a " + suma);
    if(suma==0)
      stdOut.println("El acumulado es igual a 0");
    else if(suma >0)
      stdOut.println("El acumulado es mayor a 0");
    else 
      stdOut.println("El acumulado es menos a 0");
  }
}
  public static void o2 () throws IOException
  {
    int numCuenta=0, numSaldo;
    stdOut.println("Dame tu numero de cuenta");
    numCuenta=Integer.parseInt(stdIn.readLine());
    if (numCuenta>=0) {
      stdOut.println("Dame tu saldo");
      numSaldo=Integer.parseInt(stdIn.readLine());
      if (numSaldo==0)
        stdOut.println("No tiene deuda");
      else if (numSaldo>0) {
        stdOut.println("Usted debe "+numSaldo+" (ENTER)");
        stdIn.readLine();
      }
      else {
        stdOut.println("Usted tiene a favor en su cuenta " +(numSaldo*-1)+" (ENTER)");
        stdIn.readLine();
      }
      }
      if (numCuenta<0) {
        stdOut.println("Cuenta no valida");
      }
  }
  public static void o3 () throws IOException
  {
long x=1;
 long y=0;
 stdOut.println("De que numero quieres obtener factorial?");
   x= Long.parseLong(stdIn.readLine());
   y=x-1;
if (x>0)
{
  do{
    x=x*y;
    y=y-1;
  }
  while(y>0);
  stdOut.println("El factorial es igual a " +x);
}
else
  stdOut.println("Numero no valido");
  }
  }
  public static void o4 () throws IOException
  {
  }
  public static void o5 () throws IOException
  {
    int x;
    int f = 0;
    stdOut.println("Introduzca el numero para el cual quiera saber la suma de todos su consecutivos positivos");
     x =Integer.parseInt(stdIn.readLine());
     x= x+1;
   do
                      {
    f= f + --x;
                       }
    while (x > 0);
    stdOut.println("La suma total es de " + f);
    }
  }
  public static void o6 () throws IOException
  {
  }
  public static void o7 () throws IOException
  {
  }
  public static void o8 () throws IOException
  {
  }
  public static void o9 () throws IOException
  {
  }
  public static void o10 () throws IOException
  {
  }
  public static void o11 () throws IOException
  {
  }
  public static void main (String [] args) throws IOException
  {
    int opcion=principio();//Se va la funcion principio donde se introduze el programa
    if(opcion==1){
      do{
        opcion=menu();//Se va a la funcion menu donde se le muestran todas las opciones
        switch(opcion) {
          case 1: o1(); break;
          case 2: o2(); break;
          case 3: o3(); break;
          case 4: o4(); break;
          case 5: o5(); break;
          case 6: o6(); break;
          case 7: o7(); break;
          case 8: o8(); break;
          case 9: o9(); break;
          case 10: o10(); break;
          case 11: o11(); break;//Sale del programa
        }
      }
      while(opcion!=11);
    }
      stdOut.println("Gracias por usar nuestro programa. :) Cerrando Programa");
  }
}
