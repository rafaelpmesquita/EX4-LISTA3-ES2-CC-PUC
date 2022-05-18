package Exercicio2;
import java.util.*;

class CommandPattern {
  public static void main(String[] args) {
    System.out.println("adicionar actions na lista de ações -> Para executar todas as açoes vc deve fazer um loop chamando o metodo execute de Experimento");
  }
}

class Experimento {
    private List<Action> actions;

    public void addActions(Action action) {
        actions.add(action);
    }

    public void execute() {
        actions.remove(0).getRobot().execute();
    }
}

class Action {
    private RobotAction robot;   
    private String nameAction;

    Action(RobotAction robot, String nameAction) {
        this.robot = robot;
        this.nameAction = nameAction;
    }

    public RobotAction getRobot() {
        return this.robot;
    }

    public String getNameAction() {
        return this.nameAction;
    }
}

interface RobotAction {
    public void execute();
}

class Robot implements RobotAction {

    private String nameRobot;
    
    Robot(String nameRobot) {
        this.nameRobot = nameRobot;    
    }
    
    public void execute() {
        System.out.println("Executada pelo " + nameRobot);
    }
}

