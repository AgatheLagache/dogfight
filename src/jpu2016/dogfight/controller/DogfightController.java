package jpu2016.dogfight.controller;

import jpu2016.digfight.model.IDogfightModel;
import jpu2016.dogfight.view.IViewSystem;

public class DogfightController implements IOrderPerformer{
	private static int TIME_SLEEP = 30;
	private IViewSystem viewSystem;
	private IDogfightModel dogfightModel;
	private int GameStatus = 1; //GameStatus = 1, pas de défaite ; GameStatus = 0, défaite d'un des joueurs

	public DogfightController(IDogfightModel dogfightModel){

	}

	private void gameLoop(){
		//La méthode gameLoop() (lancée par la méthode play()) est une boucle infinie (elle n’est stoppé que par la mort d’un avion).
		//Elle lance la méthode move sur chacun des mobiles présents.
		//Il s’agit d’un mécanisme classique dans les jeux vidéo qui ne sont pas en tour par tour.
		while(this.GameStatus != 0)
		{
			move();
		}
	}

	public void isWeaponOnMobile(){
		//La méthode isWeaponOnMobile() permet de calculer si un missile se trouve sur un mobile.
	}

	private void lauchMissile(int player){
		//La méthode lauchMissile() comme son nom l’indique créé un missile devant l’avion qui tire.
		//Attention à créer le missile un peu plus loin que l’avion sinon vous risquez de créer une collision.
		//Il faut donc gérer la direction de l’avion pour savoir où créer le missile.
	}

	public void manageCollision(){
		//La méthode manageCollision() a la charge de gérer les collisions des missiles (via la méthode isWeaponOnMobile()),
		//de détruire le missile et de prévenir l’avion en fonction du résultat.
	}

	@Override
	public void orderPerform(UserOrder userOrder) {
		// TODO Auto-generated method stub
		//La méthode orderPerform() récupère les ordre envoyés par la vue et en fonction lance les méthodes adéquat sur les éléments du modèle (plane.setDirection()).
	}

	public void play(){
		//La méthode play(), lance la méthode gameLoop() et affiche un message (via l’interface IViewSystem fournie par la vue) de fin de partie.
	}

	public void setViewSystem(IViewSystem viewSystem){

	}


}
