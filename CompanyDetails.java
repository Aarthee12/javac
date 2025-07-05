public class CompanyDetails {
    public static void main(String[] args) {
        if (args.length != 2) {
            
            args = new String[]{"Wipro", "Bangalore"};
        }

        String company = args[0];
        String city = args[1];
        System.out.println(company + " Technologies " + city);
    }
}
