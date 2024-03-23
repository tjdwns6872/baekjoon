package implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Explanation_13866 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int team1 = 0;
		int team2 = 0;
		List<Integer> skill = new ArrayList<Integer>();
		
		for(int i = 0; i < 4; i++) {
			skill.add(sc.nextInt());
		}
		int max = Collections.max(skill);
		int min = Collections.min(skill);
		team1 = max+min;
		skill.remove(skill.indexOf(max));
		skill.remove(skill.indexOf(min));
		
		team2 = skill.get(0) + skill.get(1);
		System.out.println(Math.abs(team1-team2));
		sc.close();
	}
}