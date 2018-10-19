package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		
	
	//2. create an array of 5 robots.
	Robot[] robots = new Robot[5];
	//3. use a for loop to initialize the robots.
	for (int i=0; i<robots.length; i++) {
		robots[i] = new Robot();
	}
		//4. make each robot start at the bottom of the screen, side by side, facing up
	int accumulator = 0;
	for (Robot r : robots) {
		r.setY(600);
		r.setX(250+100*accumulator);
		accumulator = accumulator+1;
	}
	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
	while (robots[0].getY() > 0 && robots[1].getY() > 0 && robots[2].getY() > 0 && robots[3].getY() > 0 && robots[4].getY() > 0) {
		for (int j=0; j<5; j++) {
			robots[j].setSpeed(10);
			Random rand = new Random();
			robots[j].move(rand.nextInt(50));
		}
	}
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!
	int winner = 0;
	for (int k=0; k<5; k++) {
		if (robots[k].getY()<1) {
			winner = k;
		}
	}
	System.out.println("The winner was robot " + winner);
	robots[winner].turn(360);
	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
	}
}
