package métodosprivadospoo;

public class animal {

	private String Cavalo;
	private int quantidade;
	private boolean corrida;

	@Override
	public String toString() {
		return "animal [Cavalo=" + Cavalo + ", quantidade=" + quantidade + ", corrida=" + corrida + "]";
	}

	public String getCavalo() {
		return Cavalo;
	}

	public void setCavalo(String cavalo) {
		Cavalo = cavalo;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public boolean isCorrida() {
		return corrida;
	}

	public void setCorrida(boolean corrida) {
		this.corrida = corrida;
	}

}
