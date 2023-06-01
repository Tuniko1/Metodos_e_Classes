package entities;

public class AreaTerreno {
	public double largura;
	public double comprimento;
	public double area;
	

	public void retornaArea(double largura,double comprimento) {
		area = largura * comprimento;
		
	}

}