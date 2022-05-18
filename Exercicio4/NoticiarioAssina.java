package Exercicio4;
import java.util.ArrayList;
import java.util.List;

public class NoticiarioAssina extends Noticiario {
    List<Usuario> usuarios = new ArrayList<>();

    public void AdicionarNaLista(Usuario usuario){
        usuarios.add(usuario);
    }

    public void RemoveNaLista(Usuario usuario){
        usuarios.remove(usuario);
    }

    @Override
    public void notificaUsuarios(Noticia noticia) {
        for (Usuario usuario : usuarios) {
            usuario.notificaNoticia(noticia);
        }
    }
}