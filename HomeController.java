@Autowired
class HomeController {

	@Autowired
	private ServiceUtility serviceUtility;

	public static void main(String args[]) {
		
		String dateTimeObject = serviceUtility.getCurrentDateTime();
		System.out.println("The Current Date Time is : " + dateTimeObject)
	}
}