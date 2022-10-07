package exerciseJavaPoo.question4;

public class View {

	public static void main(String[] args) {
		ItemDeLoja obj1 = new ItemDeLoja(01, "Sabonete", "Cheiro de rosas", 3.50);
		System.out.println(obj1.getIndentificador()+","+ obj1.nomeDoItem);
		obj1 = new Alimento(32, 03, "Biscoito", "Sabor cocolate", 2.00);
		System.out.println(obj1.getIndentificador()+","+ obj1.nomeDoItem);
		Ferramenta obj2 = new Ferramenta(04, "Martelo", "Super resistente", 39.90, 12369);
		obj2.separa(null);
		obj2.separar();
		System.out.println(obj2.getIndentificador()+","+ obj2.nomeDoItem +","+ obj2.getCategoria());

	}

}
