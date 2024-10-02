package polimorfismo;

public class ConsultorPj extends Funcionario{
	public ConsultorPj(int id, String nome, String string, int matricula, String endereco) {
			super(id, nome, string, matricula, endereco);
		}
	    @Override
	    public double calcularSalario(double valorTotal,double imposto) {
	        return valorTotal - imposto;
	}
}

