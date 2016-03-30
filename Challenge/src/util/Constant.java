package util;

import java.io.File;

public interface Constant {

	final String PREFIX = System.getProperty("user.home") + File.separator + "data" + File.separator;

	public final String PLACE_READER = PREFIX + "in/";

	public final String PLACE_SAVE = PREFIX + "out/";

}
