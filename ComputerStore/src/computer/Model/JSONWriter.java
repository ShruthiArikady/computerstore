package computer.Model;

/*import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
//import java.util.Iterator;

public class JSONReader {
	
	public void reader(){
		
	  JSONParser parser = new JSONParser();

      try {

          Object obj = parser.parse(new FileReader("db.json"));

          JSONObject jsonObject = (JSONObject) obj;
          System.out.println(jsonObject);

          String name = (String) jsonObject.get("name");
          System.out.println(name);

          long cost = (Long) jsonObject.get("cost");
          System.out.println(cost);
          
          String description = (String) jsonObject.get("description");
          System.out.println(description);

          // loop array
         // JSONArray msg = (JSONArray) jsonObject.get("messages");
          //Iterator<String> iterator = msg.iterator();
          //while (iterator.hasNext()) {
          //    System.out.println(iterator.next());
          //}

      } catch (FileNotFoundException e) {
          e.printStackTrace();
      } catch (IOException e) {
          e.printStackTrace();
      } catch (ParseException e) {
          e.printStackTrace();
      }

  }

}*/
import java.io.FileWriter;
import java.io.IOException;
 
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
 
public class JSONWriter
{
    @SuppressWarnings("unchecked")
    public static void main( String[] args )
    {
        //item1
        JSONObject itemDetails = new JSONObject();
        itemDetails.put("Name", "HP model1");
        itemDetails.put("Cost", "20000KR");
        itemDetails.put("Description", "it has 64 gb RAM");
         
        JSONObject itemObject = new JSONObject();
        itemObject.put("item", itemDetails);
         
        //item2
        JSONObject itemDetails2 = new JSONObject();
        itemDetails2.put("Name", "Del model1");
        itemDetails2.put("Cost", "15000KR");
        itemDetails2.put("Description", "it has high battery");
         
        JSONObject itemObject2 = new JSONObject();
        itemObject2.put("item", itemDetails2);
         
        //Add item to list
        JSONArray itemList = new JSONArray();
        itemList.add(itemObject);
        itemList.add(itemObject2);
         
        //Write JSON file
        try (FileWriter file = new FileWriter("item.json")) {
 
            file.write(itemList.toJSONString());
            file.flush();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
