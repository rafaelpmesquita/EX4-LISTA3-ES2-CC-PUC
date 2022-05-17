import java.util.*;

public class ObserverPattern {
  
  public void main() {
    //pattern observer;
  }
}

class Saldo implements ITransacao {
    private float valor;

    public float getValor() {
        return valor;
    }

    public void movimento(float valorMovimento) {
        valor += valorMovimento;
    }
}


interface ITransacao {
  public void movimento(float valorMovimento);
}

interface ISubscribe extends ITransacao {
    public int getId();
    public String getName();
} 

class SaldoRepl extends Saldo { 
  
  private Map<Integer, Subscribe> subscribers;	

  SaldoRepl() {
      subscribers = new HashMap<Integer, Subscribe>();
  }
	
  public void addSubscribe(Subscribe subscribe) { 
    subscribers.put(subscribe.getId(), subscribe);
  };
  
  @Override
  public void movimento(float valorMovimento) { 
     super.movimento(valorMovimento);
     notifySubscribers(valorMovimento);
  }
  
  public Subscribe removeSubscribe(int id) { 
     return subscribers.remove(id);
  };

  public void notifySubscribers(float valormovimento) {
      for(Subscribe subscribe : subscribers.values()) {
          subscribe.movimento(valormovimento);
      }
  };
} 

class Subscribe implements ISubscribe {

  private static int generateId = 0;  
  private int id;
  private String name;

  Subscribe(String name) {
    this.name = name;
    this.id = generateId++;
  }

  public void movimento(float valorMovimento) {
    System.out.println("Valor movimentado -> " + this.id + " -> " + valorMovimento);
  }

  public int getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }   
}
