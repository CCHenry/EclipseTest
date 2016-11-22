import base.BaseExecute;
import base.ExecuteFactory;

public class Main {
	public static void main(String[] args) {
		BaseExecute executeFactory = ExecuteFactory.createTemplate();
		executeFactory.execute();
	}
}
