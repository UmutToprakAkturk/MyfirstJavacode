public class dogs {
    int ageofDogs;
    int weightofDogs;
    String nameofDogs;
    String sexofDogs;
    String breedofDogs="Stray";

    dogs(int x,int y,String name,String sexofDogs,String breedofDogs){
        this.ageofDogs=x;
        this.weightofDogs=y;
        this.nameofDogs=name;
        this.sexofDogs=sexofDogs;
        this.breedofDogs=breedofDogs;
    }
    void bark(){
        System.out.println("Haw haw");
    }
    void sit(){
        System.out.println("*Dog sits");
    }

}
