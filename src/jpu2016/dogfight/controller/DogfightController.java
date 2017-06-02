package jpu2016.dogfight.controller;

import jpu2016.digfight.model.IDogfightModel;
import jpu2016.dogfight.view.IViewSystem;

public class DogfightController implements IOrderPerformer{
	private static int TIME_SLEEP = 30;
	private IViewSystem viewSystem;
	private IDogfightModel dogfightModel;
	private int GameStatus = 1; //GameStatus = 1, pas de d�faite ; GameStatus = 0, d�faite d'un des joueurs

	public DogfightController(IDogfightModel dogfightModel){

	}

	private void gameLoop(){
		//La m�thode gameLoop() (lanc�e par la m�thode play()) est une boucle infinie (elle n�est stopp� que par la mort d�un avion).
		//Elle lance la m�thode move sur chacun des mobiles pr�sents.
		//Il s�agit d�un m�canisme classique dans les jeux vid�o qui ne sont pas en tour par tour.
		while(this.GameStatus != 0)
		{
			move();
		}
	}

	public void isWeaponOnMobile(){
		//La m�thode isWeaponOnMobile() permet de calculer si un missile se trouve sur un mobile.
	}

	private void lauchMissile(int player){
		//La m�thode lauchMissile() comme son nom l�indique cr�� un missile devant l�avion qui tire.
		//Attention � cr�er le missile un peu plus loin que l�avion sinon vous risquez de cr�er une collision.
		//Il faut donc g�rer la direction de l�avion pour savoir o� cr�er le missile.
	}

	public void manageCollision(){
		//La m�thode manageCollision() a la charge de g�rer les collisions des missiles (via la m�thode isWeaponOnMobile()),
		//de d�truire le missile et de pr�venir l�avion en fonction du r�sultat.
	}

	@Override
	public void orderPerform(UserOrder userOrder) {
		// TODO Auto-generated method stub
		//La m�thode orderPerform() r�cup�re les ordre envoy�s par la vue et en fonction lance les m�thodes ad�quat sur les �l�ments du mod�le (plane.setDirection()).
	}

	public void play(){
		//La m�thode play(), lance la m�thode gameLoop() et affiche un message (via l�interface IViewSystem fournie par la vue) de fin de partie.
	}

	public void setViewSystem(IViewSystem viewSystem){

	}


}
