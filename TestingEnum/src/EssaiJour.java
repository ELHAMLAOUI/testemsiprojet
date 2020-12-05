
public class EssaiJour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Jour jour=Jour.valueOf("DIMANCHE");
if(jour==Jour.SAMEDI) System.out.print("fin de semaine: ");
switch(jour) {
case SAMEDI : 
	break;
case DIMANCHE :
	System.out.println("se reposer");
    break;
default:
	System.out.println("travailler");
	break;
}
	}

}
