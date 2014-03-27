package dom.bizlogic;

import java.util.HashMap;
import java.util.Map;

public class ClubRepository {

	private static ClubRepository instance = new ClubRepository();
	
	public Map<String, Club> clubMap;
	
	private ClubRepository(){
		//
		clubMap = new HashMap<String, Club>();
	}
	
	public static ClubRepository getInstance(){
		return instance;
	}
	
	public void addClub(Club club){
		clubMap.put(club.getName(), club);
	}
}
