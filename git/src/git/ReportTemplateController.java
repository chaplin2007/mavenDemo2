package git;



import java.io.File;
import java.util.List;
import java.util.Map;


public class ReportTemplateController {
	
	public String templateList (){
		return "/report/template/list";
	}
	public String templateAdd (){
		return "/report/template/add";
	}

	public String templateCategoryAdd (){
		return "/report/template/add";
	}
	
	public String templateAddAction (String title,String comment,int parentId){
		return "redirect:/report/template";
	}
}