import interfaces.TocadorDeMusicas;
import modelos.Album;

public class Ipod implements TocadorDeMusicas {

    private boolean tocando = false;

    @Override
    public void tocarMusica() {
        if (tocando){
            System.out.println("IPhone já está tocando música.");
        }else {
            tocando = true;
            System.out.println("tocando a música");
        }
    }

    @Override
    public void pausarMusica() {
        if (!tocando){
            System.out.println("O Iphone não está tocando música.");
        }else{
            System.out.println("Música pausada");
            tocando = false;
        }
    }

    @Override
    public void selecionarMusica(Album album) {

        if(album == null){
            System.out.println("nenhuma música selecionada");
        }else{
            System.out.println("Música " + album.getNomeMusica() + " do album " + album.getNomeAalbum() + " selecionada");
        }
    }
}
