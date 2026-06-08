import java.util.Arrays;

class Dog {
    String name;
    int size;
    public static void main(String[] args) {
        // make a Dog object and access it
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.name = "Bart";

        Dog[] myDogs = new Dog[4];


        dog1.size = 10;
        // now make a Dog array
        // and put some dogs in it
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = new Dog();

        myDogs[3] = dog1;
        // now access the Dogs using the array
        // references
        myDogs[0].name = "Fred";

        myDogs[1].name = "Marge";
        myDogs[1].name = "Marge";
        myDogs[0].size = 60;
        myDogs[0].size = 60;
        myDogs[0].size = 60;

        myDogs[1].name = "Marge";
        myDogs[1].name = "Marge";
        myDogs[1].name = "Marge";
        myDogs[1].name = "Marge";
        myDogs[1].name = "Marge";
        myDogs[1].name = "Marge";
        myDogs[1].name = "Marge";
        myDogs[1].name = "Marge";
        myDogs[1].name = "Marge";
        myDogs[1].name = "Marge";
        myDogs[1].name = "Marge";

        myDogs[2].name = "Tom";
        myDogs[2].name = "Tom";
        myDogs[2].name = "Tom";
        myDogs[2].name = "Tom";
        myDogs[1].size = 80;

        myDogs[2].size = 40;
        // Hmmmm... what is myDogs[2] name?
        // System.out.print("last dog’s name is ");
        //System.out.println(myDogs[2].name);
        // now loop through the array
        // and tell all dogs to bark
        int x =0;
        System.out.println(Arrays.deepToString(myDogs));
        System.out.println();

        while ((x < myDogs.length) && (myDogs != null)) {
            myDogs[x].bark();
            x = x + 1;
        }
    }
    public void bark() {
        // Arrays have a variable ‘length’
        // System.out.println(name + " says Ruff!");

        if ((size > 60)   ){
            System.out.println(name + " Wooof! Wooof!");
        } else if ((size >= 14)   ){
            System.out.println(name + " Ruff! Ruff!");
        } else if (size > 1){
            System.out.println(name + " Yip! Yip!");
        } else {
            System.out.println ("Nothing here");

        }
        //  that gives you the number of
        //  elements in the array.
    }
    public void eat() {
    }
    public void chaseCat() {
    }
}
