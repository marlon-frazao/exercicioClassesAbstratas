package entities;

public class PessoaJuridica extends Pessoa{

	private Integer funcionarios;
	
	public PessoaJuridica() {
		super();
	}
	
	public PessoaJuridica(String nome, Double rendaAnual, Integer funcionarios) {
		super(nome, rendaAnual);
		this.funcionarios = funcionarios;
	}

	
	public Integer getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(Integer funcionarios) {
		this.funcionarios = funcionarios;
	}

	@Override
	public double calcularImposto() {
		double imposto = (funcionarios <= 10) ? getRendaAnual() * 0.16 : getRendaAnual() * 0.14;
		return imposto;
	}
}
