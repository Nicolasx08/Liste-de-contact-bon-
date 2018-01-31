/**
 * Created by PagNi1731620 on 2018-01-22.
 */
public class Contact {

    private String nom;
    private String nomDeFamille;
    private Adresse adresse;
    private Occupation occupation;
    private Téléphone tabTelephone[]=new Téléphone[10];
    private Entreprise entreprise= new Entreprise();

    public String getNom() {return nom;}
    public String getNomDeFamille() {return nomDeFamille;}
    public Adresse getAdresse() {return adresse;}
    public Occupation getOccupation() {return occupation;}
    public Téléphone[] getTabTelephone() {return tabTelephone;}
    public Entreprise getEntreprise() {return entreprise;}

    public void setNom(String nom) {this.nom = nom;}
    public void setNomDeFamille(String nomDeFamille) {this.nomDeFamille = nomDeFamille;}
    public void setAdresse(Adresse adresse) {this.adresse = adresse;}
    public void setOccupation(Occupation occupation) {this.occupation = occupation;}
    public void setTabTelephone(Téléphone[] tabTelephone) {this.tabTelephone = tabTelephone;}
    public void setEntreprise(Entreprise entreprise) {this.entreprise = entreprise;}
}


