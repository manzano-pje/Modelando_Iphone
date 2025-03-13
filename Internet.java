import modelos.NomeSite;

public class Internet implements interfaces.InternetInterface {

    @Override
    public void exibirSite(NomeSite nomeSite) {
        System.out.println("exibindo site " + nomeSite.getSite());
    }

    @Override
    public void adicionarGuia() {
        System.out.println("Adicoinando nova guia.");
    }

    @Override
    public void atualizarSite(NomeSite nomeSite) {
        System.out.println("atualizando o site " + nomeSite.getSite() );
    }
}
