
import modelos.Album;
import modelos.NomeSite;
import modelos.NumberTelephone;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Iphone {
    public static void main(String[] args) {
        Ipod ipod = new Ipod();
        Album album = new Album("Rock your babyes", "Música 01", "Queen", "Freddie Mercury");

        System.out.println("Tocar música");
        ipod.tocarMusica();

        System.out.println("\nPausar música");
        ipod.pausarMusica();

        System.out.println("\nSelecionar música");
        ipod.selecionarMusica(album);

        System.out.println("\n#######################\n");

        Telephone telephone = new Telephone();
        NumberTelephone numberTelephone = new NumberTelephone("(11) 98305-0657");

        System.out.println("\nFazendo ligação.");
        telephone.ligar(numberTelephone);

        System.out.println("\nAtender");
        telephone.atender();

        System.out.println("\nCorreio de voz");
        telephone.iniciarCorreioDeVoz();

        System.out.println("\n#######################\n");

        NomeSite siteInternet = new NomeSite("Google");
        Internet internet = new Internet();

        System.out.println("\nExibindo site");
        internet.exibirSite(siteInternet);


        System.out.println("\nAbrindo nova guia");
        internet.adicionarGuia();

        System.out.println("\nAtualizando site");
        internet.atualizarSite(siteInternet);
    }
}