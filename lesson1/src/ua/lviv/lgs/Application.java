package ua.lviv.lgs;

public class Application {
	public static void main(String[] args) {

		// int a=2;
		// long b=3;

		// System.out.println("Вар А="+a);
		// System.out.println("Вар Б="+b);

		// 1:Додавання і віднімання змінних

		// int d=1;
		// int e=2;
		// int res1=d+e;
		// int res2=d-e;
		// int res3=d*e;
		// int res4=d/e;

		// System.out.println("res1="+res1);
		// System.out.println("res2="+res2);
		// System.out.println("res3="+res3);
		// System.out.println("res4="+res4);

		// 2: Який буде результат виведення на екран? (інкремент,декремент)

//   int a=0;
//   int b=a++;
//   int c=a++;
//   
//   System.out.println("Приклад 2="+a+" "+b+" "+c+" ");

		// Приклад 3. Операції з присвоєння

//		int f=1; 
//		int g=2;
//		int h=3;
//		
//		f+=5;    //f=f+5=>f=1+5=6
//		g*=4;    //g=g*4=>g=2*4=8
//		h+=f*g;  //h=h+f*g=>3+48=51
//		h%=6;    //h=h%6=51/6=3
//		System.out.println("F="+f);
//		System.out.println("G="+g);
//		System.out.println("H="+h);

		// Приклад 4. тернарний оператор

//		int a=2;
//		
//		int r=a>0 ? -3:2;
//		
//		System.out.println("r="+r);

		// Приклад 5. Логічний оператор

//		boolean j=true;
//		boolean k=false;
//		boolean l=j|k;   //1+0=1
//		boolean m=j&k;   //1*0=0
//		boolean n=(!j&k)|(j&!k);   //(0*0)+(1*1)=0+1=1
//		boolean o=!j;
//		
//		System.out.println("J="+j);
//		System.out.println("K="+k);
//		System.out.println("L="+l);
//		System.out.println("M="+m);
//		System.out.println("N="+n);
//		System.out.println("O="+o);

		// Приклад 6. Операції з рівності

//		int t=5;
//		int u=21;
//		String result1=(t<u)? "yes":"no";
//		String result2=(t==u)? "yes":"no";
//		String result3=(t>=u)? "yes":"no";
//		
//		System.out.println("result1="+result1);
//		System.out.println("result2="+result2);
//		System.out.println("result3="+result3);

		// Приклад 7. Конструкція if\else
//		int a1 = 2;
//		int b1 = 3;
//
//		if (a1 > b1) {
//			System.out.println("a1 > b1");
//		} else {
//			System.out.println("a1 < b1");
//		}

		// Приклад 7. Конструкція if\else\if
//		int a1 = 2;
//	    int b1 = 3;
//		
//		
//		if (a1*a1==b1) {
//			System.out.println("1");
//			}else if(a1*a1<b1) {System.out.println("2");}
//		
//			else {
//				System.out.println("3");
//			}

		// Приклад 8. Конструкція Світч

//		int k1=8;
//		
//		
//		
//		switch (k1) {
//		case 1: case 3: case 4: {
//			
//			System.out.println(1);break;
//			} 
//		case 2:System.out.println(2);break;
//		default:System.out.println("default");
//		
//		
//		}
		
		//Приклад 8. Цикл for
		
//		for (int i = 0; i < 10; i++) {
//			System.out.println("i="+i);
//		}
		
//		Приклад 9. Цикл While
//		int i=0;
//		while (i<10) {
//			System.out.println("i="+i);
//			i++;
//		}
		
//		Приклад 9. Цикл  DO While
//		int i=0;
//		do {
//			System.out.println("i="+i);
//			i++;
//		} while (i==1);
		
//		Приклад 10. Масив
		
//		int array1 []=new int[10]; 
//		double [] array2=new double[10];
//		double array3[]= {1.1,2.2,3.3,4.4,5.5};
//		
//		for (int i = 0; i < array1.length; i++) {
//			array1[i]=i;
//			array2[i]=i*i;
//		}
//		for (int i = 0; i < array1.length; i++) {
//			System.out.print(array1[i]+" ");
//			System.out.println(array2[i]);
//		}
//		for (int i = 0; i < array3.length; i++) {
//		
//			System.out.println(array3[i]);
//		}
		
		//Приклад 11. Обгортки Wrappars примітивів
//		Byte a1=2;
//		Short a2=2;
//		Integer a=2;
//		Long a4=2l;
//		Double b=2.2;
//		Float b1=3.3F;
		System.out.println("Byte="+Byte.MAX_VALUE);

	}

}
