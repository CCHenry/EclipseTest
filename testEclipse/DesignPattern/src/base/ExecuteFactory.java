package base;

import index1_template.TemplateExecute;

public class ExecuteFactory {
	private BaseExecute execute;

	/**
	 * ����ģ���Ʒ
	 */
	public static TemplateExecute createTemplate() {
		// TODO Auto-generated method stub
		return new TemplateExecute();
	}
}
