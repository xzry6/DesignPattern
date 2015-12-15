package behavioral;


public class SIterator implements Iterator{
	private Animal animal;
	private int point = -1;
	
	public SIterator(Animal animal) {
		super();
		this.animal = animal;
	}
	@Override
	public Object pre() {
		if(point>0) point--;
		return animal.get(point);
	}

	@Override
	public Object next() {
		if(point<animal.size()-1) point++;
		return animal.get(point);
	}

	@Override
	public boolean hasNext() {
		return point<animal.size()-1;
	}

	@Override
	public Object first() {
		point = 0;
		return animal.get(point);
	}
	
}
