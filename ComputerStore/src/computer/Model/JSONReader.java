package computer.Model;
/*import org.json.simple.JSONObject;
import java.io.FileWriter;
import java.io.IOException;

public class JSONReader {
	
	public void jsonwrite(){
	JSONObject obj = new JSONObject();
	
    obj.put("name", "HP");
    obj.put("cost", new Integer(35000));
    obj.put("description","Laptop is newly advanced");
    
    try (FileWriter file = new FileWriter("db.json")) {

        file.write(obj.toJSONString());
        file.flush();

    } catch (IOException e) {
        e.printStackTrace();
    }

    System.out.print(obj);
	}

}*/
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
//import java.util.ArrayList;
 
import org.json.simple.JSONArray;
//import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
 
public class JSONReader
{

	//@SuppressWarnings("unchecked")
    public JSONArray readFile()
    {
        //JSON parser object to parse read file
        JSONParser jsonParser = new JSONParser();
        
        JSONArray itemList = null;
         
        try (FileReader reader = new FileReader("item.json"))
        {
            //Read JSON file
            Object obj = jsonParser.parse(reader);
 
            itemList = (JSONArray) obj;
           // System.out.println(itemList);
             
            
			//itemList.forEach(itm -> parseitemObject( (JSONObject) itm) );
			
 
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
        return itemList;
    }
 
 
}
