@Autowired
class HomeController {

	@Autowired
	private ServiceUtility serviceUtility;

	public static void main(String args[]) {
		
		String dateTime = serviceUtility.getCurrentDateTime();
		System.out.println("The Current Date Time is : " + dateTime);
		System.out.println("Ranjith Has Changed It.");
	}
}
