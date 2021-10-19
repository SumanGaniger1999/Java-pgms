class JobsTester{

public static void main(String a[]){

JobsDTO dto=new JobsDTO();
dto.setJobId(56565);
dto.setCompanyName("India Post Recruitment");
dto.setJobType("Government");

System.out.println(dto.toString());


JobsDTO dto1=new JobsDTO();
dto1.setJobId(56565);
dto1.setCompanyName("India Post Recruitment");
dto1.setJobType("Government");

System.out.println(dto1.toString());
}
}

