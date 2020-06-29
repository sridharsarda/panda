package 11.tool;

import panda.app.AppHelper;
import panda.dao.Dao;
import 11.WebSetup;



/**
 */
public class DDL {
	/**
	 * main
	 * @param args arguments
	 */
	public static void main(String[] args) {
		new DDL().execute();
	}

	public void execute() {
		AppConsole ac = AppConsole.i();
		try {
			Dao dao = ac.getDao();
			AppHelper.ddlTables(System.out, dao, WebSetup.ENTITIES);
		}
		finally {
			ac.destroy();
		}
	}
}
