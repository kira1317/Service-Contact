import java.util.HashMap;
import java.util.Map;

/**
 * Created by Администратор on 10.09.15.
 */
public class HobbyDao {

  private Map<String,String> serviseHobby= new HashMap<String,String>();

  public void addHobby(Hobby hobby){

    if (searchHobby(hobby.getTitle()) ==null) {

      serviseHobby.put(hobby.getTitle(),hobby.getDescription());
      return;

    }


  };
  public String searchHobby(String title) {


    if (serviseHobby.get(title) != null) {

      return serviseHobby.get(title);


    }
    return null;

  }







}
