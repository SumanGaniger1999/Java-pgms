class StateTester{

public static void main(String a[]){

StateDTO dto=new StateDTO();
dto.setStateId(345678);
dto.setStateName("Karnataka");

System.out.println(dto.toString());


StateDTO dto1=new StateDTO();
dto1.setStateId(345634);
dto1.setStateName("JammuKashmir");

System.out.println(dto1.toString());
}
}