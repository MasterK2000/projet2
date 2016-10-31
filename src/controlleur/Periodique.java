package controlleur;

public class Periodique extends Document{

	int noVolume, noPeriodique;
	
	
	Periodique(String noDoc, String titre, String dateparution,int noVolume,int noPeriodique, boolean etat) {
		super(noDoc, titre, dateparution, etat);
		this.noVolume = noVolume;
		this.noPeriodique = noPeriodique;
	}

	
	
	
}
