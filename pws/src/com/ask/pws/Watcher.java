package com.ask.pws;

/**
 * @author Raiden Awkward
 * @category public watcher interface
 */
public interface Watcher {
	/**
	 * @return returns false if the item watched does not change
	 */
	boolean onWatch();
}
