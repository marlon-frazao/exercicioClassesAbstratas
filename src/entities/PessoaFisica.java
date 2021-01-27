package entities;

public class PessoaFisica extends Pessoa {

	private Double gastosSaude;
	
	public PessoaFisica() {
		super();
	}
	public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}
	
	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	@Override
	public double calcularImposto() {
		double imposto = (getRendaAnual() < 20000.0) ? getRendaAnual() * 0.15 - gastosSaude * 0.5 : getRendaAnual() * 0.25 - gastosSaude * 0.5;
		return imposto;
	}
}
