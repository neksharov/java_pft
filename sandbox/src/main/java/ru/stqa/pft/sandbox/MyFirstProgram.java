package ru.stqa.pft.sandbox;

public class MyFirstProgram {
	public static void main(String[] args) {
		 hello("world");
		 hello("user");//результат конкатенации - отдельное значение, состоящее из двух значений (слов)/литеральное значение - строка/
		// число, вычислимое значение - результат какого-либо выражения


		/*double l =6.0;
		double s = l*l;
		System.out.println("Площадь квадрата со стороной "+l+"="+s);*/

		double len = 5;
		System.out.println("Плозадь квадрата со стороной " + len + "=" + area(len));

		double a = 4;
		double b = 6;
		System.out.println("Площадь прямоугольника со сторонами " + a + " и " + b + "=" + area(a, b));
	}
	//описание функции; String somebody - параметр функции; void - ничего не возвращает
	public static void hello(String somebody) {
		System.out.println("Hello, " + somebody);
	}
	//область видимости переменной - фигурные скобки, в которых она определена (double l)
	public static double area(double l) {
		return l*l;
	}

	public static double area(double a, double b) {
		return a*b;
	}
}