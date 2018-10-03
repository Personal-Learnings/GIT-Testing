@Autowired
class HomeController {

	@Autowired
	private ServiceUtility serviceUtility;

	public static void main(String args[]) {
		
		String dateTime = serviceUtility.getCurrentDateTime();
		System.out.println("Current Date Time is: " + dateTime)
	}
}