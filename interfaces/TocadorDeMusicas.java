package interfaces;

import modelos.Album;

public interface TocadorDeMusicas {
        void tocarMusica();
        void pausarMusica();
        void selecionarMusica(Album album);

}
