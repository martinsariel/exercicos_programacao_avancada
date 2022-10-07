package exerciseJavaPoo.question4;

public class Alimento extends ItemDeLoja  {
	private Integer selo;

	public Alimento(Integer selo, int codigoDoItem, String nomeDoItem, String descriçãoDoItem, double valorDoItem) {
		super(codigoDoItem, nomeDoItem, descriçãoDoItem, valorDoItem);
	     this.selo = selo;
	}

	@Override
	public int getIndentificador() {
		
		return selo;
	}


	
	

}
