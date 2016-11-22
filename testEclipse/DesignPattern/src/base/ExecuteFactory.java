package base;

import index1_template.TemplateExecute;

public class ExecuteFactory {
	private BaseExecute execute;

	/**
	 * 创建模板产品
	 */
	public static TemplateExecute createTemplate() {
		// TODO Auto-generated method stub
		return new TemplateExecute();
	}
}
