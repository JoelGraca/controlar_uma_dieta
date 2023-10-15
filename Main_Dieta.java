package LP_Dieta;

public class Main_Dieta {

	public static void main(String[] args) {
		
		Dieta d = new Dieta();

		System.out.println(d.Balanco());
		System.out.println(d.numRefeicao());

		d.comer(50);
		d.comer(75);
		System.out.println(d.numRefeicao());

		System.out.println(d.numExercicio());

		d.queimar(20);
		System.out.println(d.Balanco());

		d.comer(75);
		d.comer(100);

		d.queimar(40);
		d.queimar(30);
		System.out.println(d.Balanco());

		System.out.println(d.numRefeicao());
		System.out.println(d.numExercicio());

		System.out.println(d.caloriasMediaConsumida());
		System.out.println(d.caloriasMediaQueimada());
		System.out.println(d.balancoNegativo()); // false

	}

}
