package git;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MainDashboardController {

	public static void main(String[] args) {

	

		Integer done = 0;
		Integer notdone = 0;
		Integer exception = 0;
		Integer isolate = 0;
		Integer total = 0;
		
		List<Map<String, Object>> work = new ArrayList<Map<String, Object>>();
		for(Map<String, Object> map : work )
		{
			Integer type_id = Integer.parseInt(map.get("type_id").toString());
			Integer sum_count = Integer.parseInt(map.get("sum_count").toString());
			switch(type_id)
			{
			case 4001: notdone = sum_count; break;
			case 4002: isolate = sum_count; break;
			case 4003: exception = sum_count; break;
			}
		}
		total = done + notdone + isolate + exception;
	
		Integer add = 0;
		Integer modify = 0;
		Integer delete = 0;
		
		List<Map<String, Object>> work2 = new ArrayList<Map<String, Object>>();
		for(Map<String, Object> map : work2 )
		{
			Integer type_id = Integer.parseInt(map.get("type_id").toString());
			Integer sum_count = Integer.parseInt(map.get("sum_count").toString());
			switch(type_id)
			{
			case 6000: add = sum_count; break;
			case 6001: modify = sum_count; break;
			case 6002: delete = sum_count; break;
			}
		}
		total = add + modify + delete;
	}
	public void DASHBOARD_AJAX_JSON_DYNAMIC_HORIZONTAL(){
		

	    String title = "";
	    
		/*
		 List<Map<String, Object>> top7 = m_categoryDAO.getDynamicCategoryTop7();
		if(top7.size() == 0)
		{
			top7 = m_categoryDAO.getDynamicDefaultCategoryTop7();
		}
		*/
	    
	    Map<String, Object> map = new HashMap<String, Object>();
			title = map.get("title").toString();
			String name = map.get("name").toString();
			Integer sum_count = Integer.parseInt(map.get("sum_count").toString());

		
	}
	
	public void getStaticHorizontal(){
		
	    String title = "";
	    /*
		List<Map<String, Object>> top7 = m_categoryDAO.getStaticCategoryTop7();
		if(top7.size() == 0)
		{
			top7 = m_categoryDAO.getStaticDefaultCategoryTop7();
		}
		*/
	    List<Map<String, Object>> top7 = new ArrayList<Map<String, Object>>();
		
		for(Map<String, Object> map : top7 )
		{
			title = map.get("title").toString();
			String name = map.get("name").toString();
			Integer sum_count = Integer.parseInt(map.get("sum_count").toString());

		}
		
	}
	

	
	public void getGraphWeek( ){
		
		
		
	    List<String> service = new ArrayList<String>();
	    List<String> service_id_list = new ArrayList<String>();
	    
	    List<String> check_date = new ArrayList<String>();
	    List<String> check_date_list = new ArrayList<String>();
	    
	    List<Map<String, Object>> m3 = new ArrayList<Map<String, Object>>();
	    for(Map<String, Object> map3 : m3 )
	    {
	    	String service_id = map3.get("service_id").toString();
	    	String service_check_date = map3.get("check_date").toString();
	    	Integer sum_count = Integer.parseInt(map3.get("sum_count").toString());
	    	Integer xValue = 0;
	    	Integer yValue = 0;
	    	for(Integer temp = 0; temp < service_id_list.size(); temp++ )
	    	{
	    		if(service_id_list.get(temp).equals(service_id))
	    		{
	    			xValue = temp + 1;
	    			temp = service_id_list.size();
	    		}
	    	}

	    	for(Integer temp = 0; temp < check_date_list.size(); temp++ )
	    	{
	    		if(check_date_list.get(temp).equals(service_check_date))
	    		{
	    			yValue = temp + 1;
	    			temp = check_date_list.size();
	    		}
	    	}
	    	
	    }
	    
	}
	
	
	public int getStaticSumValue(){
		return 0;
	}
}