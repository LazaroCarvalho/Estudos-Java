// Classe que armazena o departamento ao qual o trabalhador pertence.
package entities;

public class Departament {
	private String name;

	public Departament(String name) {
		this.name = name;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
}
