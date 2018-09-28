
public class Main {

	public static void main(String[] args) {

		String test = "aoNHQATMNLWC4vMdGgQpqMgbit";
		
		ReachNowChallenge challenge = new ReachNowChallenge(test);
		Character[][] result = challenge.getFrequencyArray();
		
		for(Character[] arr : result) {
			System.out.println(Character.valueOf(arr[0]) + "," + arr[1]);
		}
	}

}
