public class JudgeRouteCircle {
    public boolean judgeCircle(String moves) {
        char[] moveArr = moves.toCharArray();
		int lastMoveX=0;
		int lastMoveY=0;
		for(char c: moveArr){
			if(c == 'L'){
				lastMoveX--;
			}
			else if(c == 'R'){
				lastMoveX++;
			}
			else if(c == 'U'){
				lastMoveY++;
			}
			else if(c == 'D'){
				lastMoveY--;
			}			
		}
		if(lastMoveX==0 && lastMoveY==0)
			return true;
		return false;
    }
}
