public class Usuario implements ConsomeNoticia{

        public Usuario(String nome) {
                Nome = nome;
        }

        private String Nome;

        public String getNome() {
                return Nome;
        }

        public void setNome(String nome) {
                Nome = nome;
        }

        @Override
        public void notificaNoticia(Noticia noticia) {
                System.out.println("\n------Noticia------\n\nNoticia: " + noticia.getTextoNoticia()
                + "\nData : " + noticia.getDia() + "/" + noticia.getMes()
                + "\nTopico : " + noticia.getTopico());
        }
}
