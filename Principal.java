package polimorfismo;

public class Principal {

	public static void main(String[] args) {
		
		Lobo lobo = new Lobo("Thor", "m", "Montanha");
		lobo.emitirSom();
		
		Cachorro cachorro = new Cachorro("Fred", "m", "Pastor Alemão");
		cachorro.emitirSom();
		
		Tigre tigre = new Tigre("Pantera", "F", "Dente de sabre");
		tigre.emitirSom();
		
		Gato gato = new Gato("Mia", "F", "Siames");
		gato.emitirSom();
		
		Leao leao = new Leao("Scar", "M", "Grande");
		leao.emitirSom();
	}
}
