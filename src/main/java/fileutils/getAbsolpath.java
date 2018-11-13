package fileutils;

import java.io.File;
import java.io.IOException;

public class getAbsolpath {

	public static String getpath() throws IOException {

		String getfilepath=System.getProperty("user.dir");
		File fsys=new File(getfilepath);
		
		return fsys.getAbsolutePath();
	}
	

}
