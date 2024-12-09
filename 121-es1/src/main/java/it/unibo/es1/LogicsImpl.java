package it.unibo.es1;

//import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LogicsImpl implements Logics {
	private final List<Integer> values;

	public LogicsImpl(final int size) {
		this.values = IntStream.range(0, size)
				.mapToObj(o -> 0)
				.collect(Collectors.toList());
	}

	@Override
	public int size() {
		return this.values.size();
	}

	@Override
	public List<Integer> values() {
		return List.copyOf(this.values);
	}

	@Override
	public List<Boolean> enablings() {
		return this.values.stream()
				.map(i -> (i.equals(this.values.size()) ? false : true))
				.toList();
	}

	@Override
	public int hit(int elem) {
		return this.values.set(elem, this.values.get(elem) + 1 ) + 1;
	}

	@Override
	public String result() {
		return this.values.stream()
				.map(String :: valueOf)
				.map(s -> s.concat(s))
				.toString();
	}

	@Override
	public boolean toQuit() {
		return this.values.stream()
				.allMatch(i -> i.equals(this.values.get(0)));
	}
}
