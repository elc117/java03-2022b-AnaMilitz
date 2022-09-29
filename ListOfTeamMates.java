import java.util.ArrayList;

public class ListOfTeamMates{
  public static void main(String[] args) {
     ArrayList<TeamMate> list = new ArrayList<TeamMate>();
     TeamMate colega1 = new TeamMate("lipe_", "Felipe", true);
     list.add(colega1);
     TeamMate colega2 = new TeamMate("lipe_", "Felipe", false);
     list.add(colega2);
     TeamMate colega3 = new TeamMate("lipe_", "Felipe", true);
     list.add(colega3);

    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.getName());
    }
  }
}