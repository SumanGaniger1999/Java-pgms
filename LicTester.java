class LicTester{

public static void main(String a[]){

LicDTO dto= new LicDTO();
dto.setPolicyId(46776);
dto.setAgentName("Tappu");
dto.setCustomerName("Suman");
dto.setYears(6);


System.out.println(dto.getPolicyId()+ " " + dto.getAgentName() + "  " + dto.getCustomerName() + " " + dto.getYears());

}
}