class Flower{
  String name;
  String colour;
  int noOfPetals;

  void blooming(){
  System.out.println(colour+" "+name+"is blooming...!");
}

  void shedFragrance(){
  System.out.println(colour+" "+name+"is shedding fragrance...!");
}

 public static void main(String args[]){
   Flower rose = new Flower();
   rose.name = "Rose";
   rose.colour = "Red";
   rose.noOfPetals = 15;
   rose.blooming();
   rose.shedFragnance();
}
}
