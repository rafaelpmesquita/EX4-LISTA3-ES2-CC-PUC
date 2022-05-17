import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Noticia noticia1 = new Noticia("noticia1",12,01,"fabulas");
        Noticia noticia2 = new Noticia("noticia2",11,02,"dadasda");
        Noticia noticia3 = new Noticia("noticia3",13,03,"testeqwe");

        Usuario usuario1 = new Usuario("rafael");
        Usuario usuario2 = new Usuario("mesquita");

        NoticiarioAssina noticiarioAssina = new NoticiarioAssina();

        noticiarioAssina.AdicionarNaLista(usuario1);
        noticiarioAssina.AdicionarNaLista(usuario2);

        noticiarioAssina.notificaUsuarios(noticia1);
        noticiarioAssina.notificaUsuarios(noticia2);

        noticiarioAssina.RemoveNaLista(usuario2);

        noticiarioAssina.notificaUsuarios(noticia3);
    }


}
