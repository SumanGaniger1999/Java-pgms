class CameraTester{


public static void main(String a[]){

Cameras camera=new Cameras();
camera.name="Nikon";
camera.price=28000;

System.out.println(camera.name+ " " + camera.price);

camera.take();



Cameras camera1=new Cameras();
camera1.name="Canon";
camera1.price=20000;

System.out.println(camera1.name+ " " + camera1.price);

camera1.take();




Cameras camera2=new Cameras();
camera2.name="Sony";
camera2.price=18000;

System.out.println(camera2.name+ " " + camera2.price);

camera2.take();


}
}