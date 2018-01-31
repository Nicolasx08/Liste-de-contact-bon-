import java.util.Scanner;

/**
 * Created by PagNi1731620 on 2018-01-22.
 */
public class Programme {
    public static void main(String[] args) {

        int decision=0;
        boolean quitter=false;
        Contact tabContact[]= new Contact[20];
        int nbeContact=0;
        int nbeNum=0;
        int choixContact=0;
        char autreNuméro='k';
        boolean autreNum=true;
        String vide="l";
        boolean rep=false;
        int tabModifNum[]=new int [10];

        while (quitter==false){
            Scanner sc = new Scanner(System.in);
            System.out.println("1-Ajouter un contact.");
            System.out.println("2-Modifier un contact.");
            System.out.println("3-Afficher un contact.");
            System.out.println("4-Quitter.");
            decision=sc.nextInt();

            switch (decision){
                case 1:
                    tabContact[nbeContact]= new Contact();
                    System.out.println("Ce contact sera entré à la position # "+(nbeContact));
                    System.out.println("Quelle est le prénom de votre contact?");
                    tabContact[nbeContact].setNom(sc.next());
                    System.out.println("Quelle est le nom de famille de votre contact?");
                    tabContact[nbeContact].setNomDeFamille(sc.next());
                    System.out.println("Quelle est votre adresse?");

                    Adresse adresseMaison=new Adresse();
                    System.out.println("Numéro de porte?");
                    adresseMaison.setNumeroPorte(sc.next());
                    System.out.println("Rue?");
                    adresseMaison.setRue(sc.next());
                    System.out.println("Appartement(falcutatif)?");
                    adresseMaison.setAppartement(sc.next());
                    System.out.println("Ville?");
                    adresseMaison.setVille(sc.next());
                    System.out.println("Province?");
                    adresseMaison.setProvince(sc.next());
                    System.out.println("Pays?");
                    adresseMaison.setPays(sc.next());
                    tabContact[nbeContact].setAdresse(adresseMaison);

                    System.out.println("Quelle est votre occupation(poste)?");
                    Occupation occupation=new Occupation();
                    occupation.setPoste(sc.next());
                    System.out.println("Quelle est le nom de votre entreprise?");
                    occupation.setNomEntreprise(sc.next());
                    tabContact[nbeContact].setOccupation(occupation);

                    System.out.println("Quelle est l'adresse de l'entreprise?");
                    Adresse adresseEntreprise=new Adresse();
                    System.out.println("Quelle est votre numéro de porte?");
                    adresseEntreprise.setNumeroPorte(sc.next());
                    System.out.println("Rue?");
                    adresseEntreprise.setRue(sc.next());
                    System.out.println("Appartement(falcutatif)?");
                    adresseEntreprise.setAppartement(sc.next());
                    System.out.println("Ville?");
                    adresseEntreprise.setVille(sc.next());
                    System.out.println("Province?");
                    adresseEntreprise.setProvince(sc.next());
                    System.out.println("Pays?");
                    adresseEntreprise.setPays(sc.next());
                    tabContact[nbeContact].getEntreprise().setAdresseEntreprise(adresseEntreprise);
                    autreNum=true;
                    nbeNum=0;
                    while(autreNum==true) {
                        Téléphone nouveauTelephone = new Téléphone();
                        tabContact[nbeContact].getTabTelephone()[nbeNum] = nouveauTelephone;
                        System.out.println("De quelle type de téléphone s'agit-il?");
                        nouveauTelephone.setType(sc.next());
                        System.out.println("Quelle est votre numéro?");
                        nouveauTelephone.setNumero(sc.next());
                        tabModifNum[nbeContact]++;
                        rep=false;
                        while (rep==false) {
                            System.out.println("Voulez-vous entrer un autre numéro?(o/n)");
                            autreNuméro = sc.next().toLowerCase().charAt(0);
                            if (autreNuméro == 'n') {
                                autreNum = false;
                                rep=true;
                            } else if (autreNuméro == 'o') {
                                autreNum = true;
                                nbeNum++;
                                rep=true;
                            } else {
                                System.out.println("Vous n'avez pas entrez une réponse valide.");
                                rep = false;
                            }
                        }
                    }
                    nbeContact++;
                    break;
                case 2:
                    System.out.println("Quelle contact voulez-vous voir?(0 à "+(nbeContact-1)+")");
                    choixContact=sc.nextInt();
                    if (nbeContact==0){
                        System.out.println("Vous n'avez pas de contact!");
                    }
                    else if (choixContact>=0 && choixContact<=nbeContact) {
                        System.out.println("Entrez une réponse s'il y a un changement sinon entrez un -.");
                        System.out.println("Nom:(" + tabContact[choixContact].getNom() + ")");
                        vide = sc.next().trim();
                        if (!vide.equals("-")) {
                            tabContact[choixContact].setNom(vide);
                        }
                        System.out.println("Nom de famille:(" + tabContact[choixContact].getNomDeFamille() + ")");
                        vide = sc.next().trim();
                        if (!vide.equals("-")) {
                            tabContact[choixContact].setNomDeFamille(vide);
                        }
                        System.out.println("Adresse:");
                        System.out.println("Numéro de porte:(" + tabContact[choixContact].getAdresse().getNumeroPorte() + ")");
                        vide = sc.next().trim();
                        if (!vide.equals("-")) {
                            tabContact[choixContact].getAdresse().setNumeroPorte(vide);
                        }
                        System.out.println("Rue:(" + tabContact[choixContact].getAdresse().getRue() + ")");
                        vide = sc.next().trim();
                        if (!vide.equals("-")) {
                            tabContact[choixContact].getAdresse().setRue(vide);
                        }
                        System.out.println("Appartement:(" + tabContact[choixContact].getAdresse().getAppartement() + ")");
                        vide = sc.next().trim();
                        if (!vide.equals("-")) {
                            tabContact[choixContact].getAdresse().setAppartement(vide);
                        }
                        System.out.println("Ville:(" + tabContact[choixContact].getAdresse().getVille() + ")");
                        vide = sc.next().trim();
                        if (!vide.equals("-")) {
                            tabContact[choixContact].getAdresse().setVille(vide);
                        }
                        System.out.println("Province:(" + tabContact[choixContact].getAdresse().getProvince() + ")");
                        vide = sc.next().trim();
                        if (!vide.equals("-")) {
                            tabContact[choixContact].getAdresse().setProvince(vide);
                        }
                        System.out.println("Pays:(" + tabContact[choixContact].getAdresse().getPays() + ")");
                        vide = sc.next().trim();
                        if (!vide.equals("-")) {
                            tabContact[choixContact].getAdresse().setPays(vide);
                        }
                        System.out.println("Poste:(" + tabContact[choixContact].getOccupation().getPoste() + ")");
                        vide = sc.next().trim();
                        if (!vide.equals("-")) {
                            tabContact[choixContact].getOccupation().setPoste(vide);
                        }
                        System.out.println("Nom entreprise:(" + tabContact[choixContact].getOccupation().getNomEntreprise() + ")");
                        vide = sc.next().trim();
                        if (!vide.equals("-")) {
                            tabContact[choixContact].getOccupation().setNomEntreprise(vide);
                        }
                        System.out.println("Numéro de porte:(" + tabContact[choixContact].getEntreprise().getAdresseEntreprise().getNumeroPorte() + ")");
                        vide = sc.next().trim();
                        if (!vide.equals("-")) {
                            tabContact[choixContact].getEntreprise().getAdresseEntreprise().setNumeroPorte(vide);
                        }
                        System.out.println("Rue:(" + tabContact[choixContact].getEntreprise().getAdresseEntreprise().getRue() + ")");
                        vide = sc.next().trim();
                        if (!vide.equals("-")) {
                            tabContact[choixContact].getEntreprise().getAdresseEntreprise().setRue(vide);
                        }
                        System.out.println("Appartement:(" + tabContact[choixContact].getEntreprise().getAdresseEntreprise().getAppartement() + ")");
                        vide = sc.next().trim();
                        if (!vide.equals("-")) {
                            tabContact[choixContact].getEntreprise().getAdresseEntreprise().setAppartement(vide);
                        }
                        System.out.println("Ville:(" + tabContact[choixContact].getEntreprise().getAdresseEntreprise().getVille() + ")");
                        vide = sc.next().trim();
                        if (!vide.equals("-")) {
                            tabContact[choixContact].getEntreprise().getAdresseEntreprise().setVille(vide);
                        }
                        System.out.println("Province:(" + tabContact[choixContact].getEntreprise().getAdresseEntreprise().getProvince() + ")");
                        vide = sc.next().trim();
                        if (!vide.equals("-")) {
                            tabContact[choixContact].getEntreprise().getAdresseEntreprise().setProvince(vide);
                        }
                        System.out.println("Pays:(" + tabContact[choixContact].getEntreprise().getAdresseEntreprise().getPays() + ")");
                        vide = sc.next().trim();
                        if (!vide.equals("-")) {
                            tabContact[choixContact].getEntreprise().getAdresseEntreprise().setProvince(vide);
                        }
                        for (int i=0;i<tabModifNum[choixContact];i++) {
                            System.out.println("Type Tel:(" + tabContact[choixContact].getTabTelephone()[i].getType() + ")");

                            vide = sc.next().trim();
                            if (!vide.equals("-")) {
                                tabContact[choixContact].getTabTelephone()[i].setType(vide);
                            }
                            System.out.println("# Tel:(" + tabContact[choixContact].getTabTelephone()[i].getNumero() + ")");

                            vide = sc.next().trim();
                            if (!vide.equals("-")) {
                                tabContact[choixContact].getTabTelephone()[i].setNumero(vide);
                            }
                        }
                    }
                    else {
                        System.out.println("Vous n'avez pas de contact à cette position.");
                    }
                    break;
                case 3:
                    boolean ok =false;
                    while (!ok) {
                        System.out.println("Quelle contact voulez-vous voir?");
                        for (int i = 0; i < nbeContact; i++) {
                            System.out.println("#" + i + " " + tabContact[i].getNom() + " " + tabContact[i].getNomDeFamille());
                        }
                        choixContact = sc.nextInt();
                        if (choixContact>(nbeContact-1)){
                            System.out.println("Entrez une réponse valide!");
                        }
                        else {
                            ok=true;
                        }
                    }
                    System.out.println("Nom:"+tabContact[choixContact].getNom());
                    System.out.println("Nom de famille:"+tabContact[choixContact].getNomDeFamille());
                    System.out.println("Adresse:");
                    System.out.println("Numéro de porte:"+tabContact[choixContact].getAdresse().getNumeroPorte());
                    System.out.println("Rue:("+tabContact[choixContact].getAdresse().getRue()+")");
                    System.out.println("Appartement:"+tabContact[choixContact].getAdresse().getAppartement());
                    System.out.println("Ville:"+tabContact[choixContact].getAdresse().getVille());
                    System.out.println("Province:"+tabContact[choixContact].getAdresse().getProvince());
                    System.out.println("Pays:"+tabContact[choixContact].getAdresse().getPays());
                    System.out.println("Poste:"+tabContact[choixContact].getOccupation().getPoste());
                    System.out.println("Nom entreprise:"+tabContact[choixContact].getOccupation().getNomEntreprise());
                    System.out.println("Numéro de porte:"+tabContact[choixContact].getEntreprise().getAdresseEntreprise().getNumeroPorte());
                    System.out.println("Rue:"+tabContact[choixContact].getEntreprise().getAdresseEntreprise().getRue());
                    System.out.println("Appartement:"+tabContact[choixContact].getEntreprise().getAdresseEntreprise().getAppartement());
                    System.out.println("Ville:"+tabContact[choixContact].getEntreprise().getAdresseEntreprise().getVille());
                    System.out.println("Province:"+tabContact[choixContact].getEntreprise().getAdresseEntreprise().getProvince());
                    System.out.println("Pays:"+tabContact[choixContact].getEntreprise().getAdresseEntreprise().getPays());
                    for (int i=0;i<tabModifNum[choixContact];i++) {
                        System.out.println("Type Tel:(" + tabContact[choixContact].getTabTelephone()[i].getType() + ")");
                        System.out.println("# Tel:(" + tabContact[choixContact].getTabTelephone()[i].getNumero() + ")");
                    }
                    break;
                case 4:
                    System.out.println("Seeya!");
                    quitter=true;
                    break;
                default:
                {
                    System.out.println("Entrez une réponse valide!");
                }
            }







        }

    }
}
