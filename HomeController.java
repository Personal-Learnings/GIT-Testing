@Autowired
class HomeController {

	@Autowired
	private ServiceUtility serviceUtility;

	public static void main(String args[]) {
		
		String date = serviceUtility.getCurrentDateTime();
		System.out.println("Current Date is: " + date)
	}
}