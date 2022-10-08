package Es3;

public interface PilaInterface {

	<T> boolean isEmpty();

	<T> void push(T elem);

	<T> T pop();

	<T> T top();

}
