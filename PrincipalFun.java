package polimorfismo;

public class PrincipalFun {

	public static void main(String[] args) {
		
		Funcionario fun = new Funcionario(1,"Joaquim", "15-1111-1111", 123,"Rua X");
	
	
	System.out.println(fun.getNome());
	System.out.println(fun.calcularSalario(10000.00, 1000));
	
	Horista hor = new Horista(2, "Pedro", "11111", 1234, "Rua Y");
	System.out.println(hor.getNome());
	System.out.println(hor.calcularSalario(100, 200));
 
	Jornada jor = new Jornada(3, "Jose", "5555", 1231, "Rua z");
	System.out.println(jor.getNome());
	System.out.println(jor.calcularSalario(150, 220));
	
	ConsultorPj consultor = new ConsultorPj(4, "Maria", "55555", 1239, "Rua M");
	System.out.println(consultor.getNome());
	System.out.println(consultor.calcularSalario(40000, 5000));
	}
}
