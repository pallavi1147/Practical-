class Nestedif{
public static void main(String[] args){
String address= "Solapur,India";
  if(address.endsWith("India")){
  if(address.contains("Delhi")){
   System.out.println("Your city is Delhi");
  }
else if(address.contains("Pune")){
  System.out.println("Your city is Pune");
}
else {
   System.out.println(address.split(",")[0]);
   }
  }
else {
   System.out.println("You are not living in India");
   }
   }
   }