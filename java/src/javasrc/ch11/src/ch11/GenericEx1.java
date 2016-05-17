package ch11;

public class GenericEx1<T> { //<-- <> generic
	T[] t;
	void set(T[] t) {
		this.t = t;
	}
	void print() {
		for(T v : t) {
			System.out.print(v+"\t");
		}
	}

}
