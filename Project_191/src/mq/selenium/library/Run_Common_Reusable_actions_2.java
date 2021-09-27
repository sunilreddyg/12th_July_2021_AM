package mq.selenium.library;

public class Run_Common_Reusable_actions_2 {

	public static void main(String[] args) {
		
		CommonReusableActions actions=new CommonReusableActions();
		actions.launch_browser("chrome");
		actions.Loadwebpage("http://outlook.com");
		actions.set_implicitwait(20);
		actions.set_explicitwait_time(30);
		
		String Exp_title="Outlook – free personal email and calendar from Microsoft";
		if(actions.verify_title_presented(Exp_title))
			System.out.println("title is presented");
		else
			System.out.println("title is not presented");

	}

}
