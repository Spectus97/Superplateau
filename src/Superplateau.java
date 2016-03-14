import java.util.Random;

public class Superplateau {
	public static void main(String[] args){
		
		Random r = new Random();
		String[] gifs = {"images/un.gif","images/deux.gif","images/trois.gif","images/quatre.gif"};
		Plateau map = new Plateau(gifs,10);
		int[][] jeu = new int[10][10];
		
		for(int i = 0; i < 10; i++){
			for(int j = 0; j < 10; j++){
				jeu[i][j] = r.nextInt(5);
			}
		}
		
		map.setJeu(jeu);
		map.affichage();
	}
}