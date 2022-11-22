import java.util.ArrayList;

public class ListOfTeamMates{
  public static void main(String[] args) {
     ArrayList<TeamMate> list = new ArrayList<TeamMate>();
     TeamMate colega1 = new TeamMate("_lipe", "Felipe", true);
     list.add(colega1);
     TeamMate colega2 = new TeamMate("luis23", "Luis", true);
     list.add(colega2);
     TeamMate colega3 = new TeamMate("gabs", "Gabriel", false);
     list.add(colega3);

  System.out.println("\nNomes dos colegas:");
  for(TeamMate x : list ) {
       System.out.println( x.getName());
      }
   
    System.out.println("\nId dos colegas online:");
  for(TeamMate x : list ) {
       if (x.isOnline())
	{
	    System.out.println( x.getId());
	}
      }
    list.remove(colega2); //uso de um metodo disponivel na classe ArrayList que nao foi usado antes.
     System.out.println("\nNomes dos colegas apos colega 2 ser removido:");
  for(TeamMate x : list ) {
       System.out.println( x.getName());
      }

  }
}
