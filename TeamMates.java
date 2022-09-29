public class TeamMates{
  String userId; //lipe_
  String name; //felipe
  boolean online; //true

  //construtor 1 (padrao)
  public TeamMates() {
  }

  //construtor 2 (3 argumentos)
  public TeamMates(String userId, String name, boolean online){
    this.userId = userId;
    this.name = name;
    this.online = online;
}
  //construtor 3 
  public TeamMates(){
    this.userId = "lipe_";
    this.name = "Felipe";
    this.online = false;
}
  
  //metodos
  public void setId(String userId) {
    this.userId = userId;
  }

  public String getId() {
    return userId;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setOnline(boolean online) {
    this.online = online;
  }

  public String getOnline() {
    return online;
  }
}