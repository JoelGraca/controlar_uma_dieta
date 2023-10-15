package LP_Dieta;

public class Dieta {

	private int numRefeicao;
	private int numExercicio;
	private int calorias;
	private float caloriaIngerida = 0.0f;
	private float caloriaConsumida = 0.0f;

	public Dieta() {
		this.numRefeicao = 0;
		this.numExercicio = 0;
		this.calorias = 0;

	}

	public Dieta(int numRefeicao, int numExercicio, int calorias) {
		this.numRefeicao = numRefeicao;
		this.numExercicio = numExercicio;
		this.calorias = calorias;

	}

	public void comer(int c) {
		if (c > 0) {
			this.calorias = calorias + c;
			this.numRefeicao++;
		}
		this.caloriaConsumida += c;
	}

	public void queimar(int c) {
		if (c > 0) {
			this.calorias = calorias - c;
			this.numExercicio++;
		}
		this.caloriaIngerida += c;
	}

	public int numRefeicao() {
		return this.numRefeicao;
	}

	public int numExercicio() {
		return this.numExercicio;
	}

	public int Balanco() {
		return this.calorias;

	}

	public boolean balancoNegativo() {
		if (caloriaIngerida < 0 && caloriaConsumida < 0) {
			return true;
		} else {
			return false;
		}
	}

	public float caloriasMediaConsumida() {
		if (numRefeicao > 0) {
			return this.caloriaConsumida / numRefeicao;
		} else {
			return 0;
		}

	}

	public float caloriasMediaQueimada() {
		if (numExercicio > 0) {
			return caloriaIngerida / numExercicio;
		} else {
			return 0;
		}
	}

}
