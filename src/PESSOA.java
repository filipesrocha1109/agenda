
import java.util.ArrayList;
import java.util.List;

public class PESSOA {

	private String nome;
	private int del = 0;
	
	public void setPessoa(String n) {
		this.nome = n;
	}
	
	public String getPessoa() {
		return this.nome;
	}
	
	public void setDel() {
		this.del = 1;
	}

	public int getDel() {
		return this.del;
	}

	
}
