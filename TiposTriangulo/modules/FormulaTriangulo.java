package modules;

public class FormulaTriangulo {
	public double v1, v2, v3;// valores que representam o triângulo

	public static void retornaTriangulo(double v1, double v2, double v3) {
		if (v1 == v2 && v1 == v3) {
			System.out.println("Três lados iguais . Trata-se de um Triangulo Equilatero");
		} else if (v1 == v2 || v1 == v3 || v2 == v3) {
			System.out.println("Dois lados iguais . Trata-se de um Triangulo Isosceles");
		} else
			System.out.println("Três lados diferentes. Trata-se de um Triangulo Escaleno");
	}
}
