public class TeamMate{
  String userId; //lipe_
  String name; //felipe
  public boolean online; //true

  //construtor 1 (padrao) Crie um construtor default (que não recebe argumentos)
  public TeamMate(){
  }

  //construtor 2 (3 argumentos) Crie um construtor que receba 3 argumentos e os utilize para inicializar os 3 atributos
  public TeamMate (String userId, String name, boolean online){
    this.userId = userId;
    this.name = name;
    this.online = online;
}
  //construtor 3  Crie um construtor que receba valores para userId e name e inicialize os 2 atributos correspondentes. Este construtor deverá inicializar o atributo online com o valor default false.
  public TeamMate(String userId, String name){
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

  public boolean isOnline() {
    return this.online;
  }
}
