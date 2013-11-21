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
      stdOut.println("1 ACUMULARJAVA");
      stdOut.println("2 BANCOJAVA");
      stdOut.println("3 FACTORIAL");
      stdOut.println("4 RELOJARENA");
      stdOut.println("5 SUMA DESDE 1");
      stdOut.println("6 NUM a BINARIO");
      stdOut.println("7 BINARIO a NUM");
      stdOut.println("8 PALINDROMO");
      stdOut.println("9 APPS");
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
      System.out.println("dame un valor. 9999 para salir");
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
    stdOut.println("(ENTER) para continuar");
    stdIn.readLine();
    
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
    if (x>0) {
      do{
        x=x*y;
        y=y-1;
      }
      while(y>0);
      stdOut.println("El factorial es igual a " +x);
    }
    else
      stdOut.println("Numero no valido");
    stdOut.println("(ENTER) para continuar");
    stdIn.readLine();
  }
  public static void o4 () throws IOException
  {
    stdOut.println("Dame un numero de pisos");
    int pisos=Integer.parseInt(stdIn.readLine());
    //Primero checa si el numero es impar, si no lo es acaba el programa
    if(pisos%2==0){
      stdOut.println("Pisos no es impar");
      stdOut.println("(ENTER) para continuar");
      stdIn.readLine();
    }
    else {
      String letrero="*";
      String espacio="";
      int y=pisos;
      for(int x=1; x<pisos; x++)
        letrero=letrero+"*";
      stdOut.print(letrero);
      stdOut.println();
      //Num de pisos en reversa/2 -2
      while(pisos>=(y/2+2)){
        //esto quita un char al string y le da un espacio en cada loop
        letrero = letrero.substring(0,letrero.length()-2);
        espacio = espacio+" ";
        stdOut.print(espacio+letrero);
        stdOut.println();
        pisos--;
      }
      while(pisos<y){
        //esto da dos chars al string y le quita un char a los espacios en cada loop
        letrero=letrero+"**";
        espacio = espacio.substring(0,espacio.length()-1);
        stdOut.print(espacio+letrero);
        stdOut.println();
        pisos++;
      }
      stdOut.println("(ENTER) para continuar");
      stdIn.readLine();
    }
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
    stdOut.println("(ENTER) para continuar");
    stdIn.readLine();
  }
  public static void o6 () throws IOException
  {
    stdOut.println("Dame un numero");
    int valor=Integer.parseInt(stdIn.readLine());
    String BINARIO="";
    while(valor!=0) {
      if (valor%2==0)
        BINARIO=BINARIO+"0";
      else
        BINARIO=BINARIO+"1";
      valor=valor/2;
    }
    stdOut.println(new StringBuffer(BINARIO).reverse().toString());//Efentiziar el programa al utilizar las funciones de JAVA
    stdOut.println("(ENTER) para continuar");
    stdIn.readLine();
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
          case 1: o1(); break;//Va a las funcion 1
          case 2: o2(); break;//Va a las funcion 2
          case 3: o3(); break;//Va a las funcion 3
          case 4: o4(); break;//Va a las funcion 4
          case 5: o5(); break;//Va a las funcion 5
          case 6: o6(); break;//Va a las funcion 6
          case 7: o7(); break;//Va a las funcion 7
          case 8: o8(); break;//Va a las funcion 8
          case 9: o9(); break;//Va a las funcion 9
          case 10: o10(); break;//Va a las funcion 10
          case 11: o11(); break;//Sale del programa
        }
      }
      while(opcion!=11);
    }
      stdOut.println("Gracias por usar nuestro programa. :) Cerrando Programa");
  }
}
