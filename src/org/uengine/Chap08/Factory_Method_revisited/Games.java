package org.uengine.Chap08.Factory_Method_revisited;

public class Games {

	public static void PlayGame(GameFactory factory){
		Game s = factory.getGame();
		while(s.move()){}
			
		
	}
	public static void main(String[] args) {
		PlayGame(Checkers.factory);
		PlayGame(Chess.factory);
	}

}
