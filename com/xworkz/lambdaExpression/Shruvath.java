package com.xworkz.lambdaExpression;

public class Shruvath {
	public static void main(String[] args) {
		
		PresidentDTO dto[]=new PresidentDTO[50];
		 dto[0]=new PresidentDTO("Ram Nath Kovind", "76","India","Hindi");
	     dto[1]=new PresidentDTO("Joko Widodo", "60","Indonesia","Bahasa");
	     dto[2]=new PresidentDTO("Ali Khamenei ","82" ,"Iran","Farsi");
		 dto[3]=new PresidentDTO("Barham Salih","61" ,"Iraq","Arabic and Kurdish");
		 dto[4]=new PresidentDTO("Ilir Meta","52","Albania","Indo-European");
		 dto[5]=new PresidentDTO("Ilham Aliyev","59" ,"Azerbaijan","Azerbaijani");
		 dto[6]=new PresidentDTO("Alexander Van der Bellen","77","Austria","German");
		 dto[7]=new PresidentDTO("Armen Sarksyan","68" ,"Armenia","Armenia");
		 dto[8]=new PresidentDTO("Ilham Aliyev","59" ,"Azerbaijan","Azerbaijan");
		 dto[9]=new PresidentDTO("Lazarus Chakwera","66","Malawi","English")	;
		 dto[10]=new PresidentDTO("Abdul Hamid", "77","Bangladesh","Bengali");
		 dto[11]=new PresidentDTO("Dame Sandra Mason","72","Barbados","English");
	     dto[12]=new PresidentDTO("Alexander Lukashenko","67" ,"Belarus","Belarusian ");
	     dto[13]=new PresidentDTO("Rumen Radev","58","Bulgaria","Turkish");
		 dto[14]=new PresidentDTO("Roch Marc Christian Kaboré","64" ,"Burkina Faso","French");
	     dto[15]=new PresidentDTO("José Maria Neves","61","Cape Verde","Portuguese");
		 dto[16]=new PresidentDTO("Faustin-Archange Touadéra[δ]","64","Central African Republic"," French");
		 dto[17]=new PresidentDTO("Félix Tshisekedi","58","Congo","Frech");
		 dto[18]=new PresidentDTO("Zoran Milanović ","55" ,"Croatia","Standard Croatian");
		 dto[19]=new PresidentDTO("Miloš Zeman ","77" ,"Czech Republic","Czech");
	     dto[20]=new PresidentDTO("Ismaïl Omar Guelleh[δ] ","74" ,"Djibouti"," French and Arabic");
	     dto[21]=new PresidentDTO("Charles Savarin","78" ,"Dominica","English");
	     dto[22]=new PresidentDTO("Francisco Guterres","67","East Timor","Austronesian")	;
	     dto[23]=new PresidentDTO("Abdel Fattah el-Sisi","67","Egypt","Modern Standard Arabic")	;
	     dto[24]=new PresidentDTO("Nayib Bukele","40","El Salvador","Spanish")	;
	     dto[25]=new PresidentDTO("Alar Karis","63"," Estonian","Estonia")	;
	     dto[26]=new PresidentDTO("Sahle-Work Zewde","71","Ethiopia","Amharic")	;
	     dto[27]=new PresidentDTO("Sauli Niinistö","73","Finland","Finnish and Swedish")	;
	     dto[28]=new PresidentDTO("Salome Zourabichvili","69","Georgia","kartuli ena")	;
	     dto[29]=new PresidentDTO("Abdrabbuh Mansur Hadi","76","Yemen","Arabic");
	     dto[30]=new PresidentDTO("Frank-Walter Steinmeier","65","Germany","Indo-European");
	     dto[31]=new PresidentDTO("Katerina Sakellaropoulou","69","Greece","Greek");
	     dto[32]=new PresidentDTO("Umaro Sissoco Embaló","49","Guinea-Bissau","Portuguese");
       	 dto[33]=new PresidentDTO("János Áder","62","Hungary","Hungarian");
	     dto[34]=new PresidentDTO("Guðni Th. Jóhannesson","53","Iceland","Icelandic")	;
	     dto[35]=new PresidentDTO("Isaac Herzog","61","Israel","Hebrew")	;
	     dto[36]=new PresidentDTO("Egils Levits","66","Latvia","Latvian")	;
	     dto[37]=new PresidentDTO("Michel Aoun","88","Lebanon","Arabic")	;
	     dto[38]=new PresidentDTO("Gitanas Nausėda","57","Lithuania","Lithuanian ")	;
	     dto[39]=new PresidentDTO("Andry Rajoelina","47","Madagascar","French")	;
	     dto[40]=new PresidentDTO("George Vella","65","Malta","Maltese")	;
	     dto[41]=new PresidentDTO("Mohamed Ould Ghazouani","65","Mauritania","Arabic")	;
	     dto[42]=new PresidentDTO("Prithvirajsing Roopun","62","Mauritius","English")	;
	     dto[43]=new PresidentDTO("Maia Sandu","49","Moldova","Romanian")	;
	     dto[44]=new PresidentDTO("Bidhya Devi Bhandari","60","Nepal","Nepali")	;
	     dto[45]=new PresidentDTO("Mohamed Bazoum","61","Niger","French")	;
	     dto[46]=new PresidentDTO("Stevo Pendarovski","58","North Macedonia","Albanian")	;
	     dto[47]=new PresidentDTO("Mahmoud Abbas","86","Palestine","Arabic")	;
	     dto[48]=new PresidentDTO("Klaus Iohannis","62","Romania","Romanian")	;
	     dto[49]=new PresidentDTO("Vladimir Putin","69","Russia","Russian")	;
	     
	     
		
	
		
		PresidentDAO dao=new PresidentDAO();
		for(int i=0;i<dto.length;i++) {
			dao.save(dto[i]);
		}
	System.out.println(dao.find((dt,str)->(dt.getName()).equalsIgnoreCase(str),"Ram Nath Kovind"));
	System.out.println(dao.find((dt,str)->(dt.getName()).startsWith(str),"R"));
	System.out.println(dao.find((dt,str)->(dt.getCountryName()).equalsIgnoreCase(str),"India"));
	System.out.println(dao.find((dt,str)->(dt.getLanguage()).equalsIgnoreCase(str),"English"));
    System.out.println(dao.find((dt,str)->Integer.parseInt(dt.getAge())>Integer.parseInt(str),"100"));							
	
	
	}

}
