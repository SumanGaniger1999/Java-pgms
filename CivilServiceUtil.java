class CivilServiceUtil{
public static void main(String a[]){

CivilServiceDTO dto = new CivilServiceDTO();

dto.setServiceId(76549);
dto.setServiceName("Indian Administration Service");
dto.setNoOfSeats(72);
System.out.println(dto.toString());

CivilServiceDTO dto1 = new CivilServiceDTO();

dto1.setServiceId(69043);
dto1.setServiceName("Indian Foreign Service");
dto1.setNoOfSeats(12);
System.out.println(dto1.toString());

CivilServiceDTO dto2 = new CivilServiceDTO();

dto2.setServiceId(5328);
dto2.setServiceName("Indian Police Service");
dto2.setNoOfSeats(60);
System.out.println(dto2.toString());

CivilServiceDTO dto3 = new CivilServiceDTO();

dto3.setServiceId(2309877);
dto3.setServiceName("Indian Revenue System");
dto3.setNoOfSeats(33);
System.out.println(dto3.toString());


}
}