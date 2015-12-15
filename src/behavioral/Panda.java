package behavioral;


public class Panda implements Animal {
	private String[] s = {"a","b","c","d","e"};
	@Override
	public Iterator iterator() {
		return new SIterator(this);
	}

	@Override
	public int size() {
		return s.length;
	}

	@Override
	public Object get(int i) {
		// TODO Auto-generated method stub
		return s[i];
	}

	
}
