package birthdayPack;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.time.LocalDate;
import java.time.Month;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.RequestStreamHandler;

public class BirthdayClass implements RequestStreamHandler {
	public void handleRequest(InputStream input, OutputStream output, Context context) throws IOException {
		JSONParser parser = new JSONParser();
		//BufferedReader reads data efficient way character by character 
	    BufferedReader reader = new BufferedReader(new InputStreamReader(input));
	    //JSONObject shows collection of name value pairs from the data
	    JSONObject responseJson = new JSONObject();
	    JSONObject event;
	    String result="";
	    try {
			event = (JSONObject) parser.parse(reader);
			context.getLogger().log("input " + event.get("body"));
		    
			//initializing user birth month, day, year
			int month = Integer.parseInt((String)event.get("monvalue"));
		    int day = Integer.parseInt((String)event.get("dayvalue"));
		    int year = Integer.parseInt((String)event.get("yearvalue"));
		    
		    //initialize current month, day, year
		    LocalDate currentdate = LocalDate.now();
		    int current_month = currentdate.getMonthValue();
		    int current_date = currentdate.getDayOfMonth();
		    int current_year = currentdate.getYear();
		    
		    //calculating difference between dates
		    Date dt1 = new Date(month,day,year);
	        Date dt2 = new Date(current_month,current_date,current_year);
	        result = Date.getDifference(dt1, dt2) + "days old";
	        //System.out.println("Difference between two dates is " + Date.getDifference(dt1, dt2));
		    
		    
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw e;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    
	    JSONObject responseBody = new JSONObject();
        responseBody.put("You are ",result);
        responseJson.put("statusCode", 200);
        responseJson.put("body", responseBody.toString());
        OutputStreamWriter writer = new OutputStreamWriter(output, "UTF-8");
        writer.write(responseJson.toString());
        writer.close();
        
        
	    
	}
}
