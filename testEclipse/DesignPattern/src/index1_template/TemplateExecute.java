package index1_template;

import utils.CCLog;
import base.BaseExecute;

public class TemplateExecute extends BaseExecute{

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		CCLog.print("��ʼ����ģ��ģʽ");
		SeeMovie seeMovie1=new SeeMovieOfAmazingDoctor();
		SeeMovie seeMovie2=new SeeMovieOfYourName();
		CCLog.print("****************");
		seeMovie1.exeucte();
		CCLog.print("****************");
		seeMovie2.exeucte();
	}

}
