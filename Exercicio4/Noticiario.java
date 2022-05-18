package Exercicio4;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public abstract class Noticiario implements ConsomeNoticia{

    public void notificaNoticia(Noticia noticia){
        notificaUsuarios(noticia);
    }

    public abstract void notificaUsuarios(Noticia noticia);



}
