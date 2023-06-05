package aaa;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Bbb {
    private static Logger Log=LogManager.getLogger(Bbb.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Log.debug("I am Debugger");
       Log.error("It's an error");
	}

}
