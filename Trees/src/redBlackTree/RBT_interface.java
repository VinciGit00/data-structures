package redBlackTree;

public interface RBT_interface {

	/**
	 * Insert.
	 *
	 * @param <T>  the generic type
	 * @param node the node
	 */
	<T> void insert(T node);

	/**
	 * Delete.
	 *
	 * @param <T>  the generic type
	 * @param node the node
	 */
	<T> void delete(T node);

	/**
	 * Already present.
	 *
	 * @param <T>  the generic type
	 * @param node the node
	 * @return true, if successful
	 */
	<T> boolean AlreadyPresent(T node);

	/**
	 * All strings.
	 *
	 * @param <T> the generic type
	 * @return the string
	 */
	<T> String allStrings();
}
