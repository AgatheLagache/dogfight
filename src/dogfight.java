import jpu2016.dogfight.controller.DogfightController;
import jpu2016.dogfight.model.DogfightModel;
import jpu2016.dogfight.view.DogfightView;

public class dogfight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final DogfightModel dogfightModel = new DogfightModel();
		final DogfightController dogfightController = new DogfightController(dogfightModel);
		final DogfightView dogfightView = new DogfightView(dogfightController, dogfightModel, dogfightModel);
		dogfightController.setViewSystem(dogfightView); dogfightController.play();




		//Dans le main, c’est vous qui créerez les avions et les nuages.
		//L’ordre dans lequel vous le ferez aura une incidence sur le jeu.
		//En effet, les premiers créés seront sous les autres. Si vous créez les avions avant les nuages, ces derniers cacheront les avions.
		//Vous pouvez donc tout à fait créer des nuages devant et d’autres derrières les avions.
		//Les missiles (créés pendant la partie et donc en dernier) seront eux toujours devant.
		//Si ce n’est pas le cas, c’est que la vue a dans sa boucle d’affichage commencé par la fin et mobiles.
	}

}
