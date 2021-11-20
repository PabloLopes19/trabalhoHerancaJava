package screens;

public class Aluno extends Pessoa {
	private double Nota1;
	private double Nota2;
	private double Media;
	public String Situacao;

	public void calculaMedia() {
		if(Media > 6.0) {
			Situacao = "Aluno aprovado!";
		}else {
			Situacao = "Aluno reprovado!";
		}
	}
	
	public double retornaResultado() {
		Media = (Nota1 + Nota2) / 2;
		
		if(Media > 6.0) {
			Situacao = "Aluno aprovado!";
		}else {
			Situacao = "Aluno reprovado!";
		}
		
		return Media;
	}
	
	public double getNota1() {
		return Nota1;
	}
	public void setNota1(double nota1) {
		Nota1 = nota1;
	}
	public double getNota2() {
		return Nota2;
	}
	public void setNota2(double nota2) {
		Nota2 = nota2;
	}
	public double getMedia() {
		return Media;
	}
	public void setMedia(double media) {
		Media = media;
	}
	
	
}
