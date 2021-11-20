package screens;

public class Professor extends Pessoa {
	private int Matricula;
	private int CargaHoraria;
	private String Tipo;
	
	public String verificaTipo() { 
		if(CargaHoraria > 7) {
			Tipo = "Efetivado";
			return Tipo;
		}else {
			Tipo = "Temporário";
			return Tipo;
		}
	}

	public int getMatricula() {
		return Matricula;
	}

	public void setMatricula(int matricula) {
		Matricula = matricula;
	}

	public int getCargaHoraria() {
		return CargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		CargaHoraria = cargaHoraria;
	}

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}
	
	
}
