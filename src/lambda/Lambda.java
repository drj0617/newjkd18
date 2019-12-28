package lambda;

@FunctionalInterface
public interface Lambda {

	int method01(int a,int b);
	default void method02() {
		
	};
	
}
