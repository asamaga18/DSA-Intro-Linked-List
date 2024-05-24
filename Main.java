class Main {
  public static void main(String[] args) {
    int k;

    String[] food = {"Apples", "Burritos", "Carrots", "Dog food", "Eggs", "Fudge"};

    LList ThingsToBuy = new LList();

    for (k = 0; k < 6; k++)
      ThingsToBuy.InsertAtHead (food[k]);

    String[] morefood = {"Dog food", "Apples", "Fudge", "Guacamole"};

    for (k = 0; k < 4; k++) {
      if (ThingsToBuy.Find(morefood[k]) != null)
        System.out.println("We found " + morefood[k] + ".");
      else 
        System.out.println(morefood[k] + " is not on the list.");
      }//max
    ThingsToBuy.PrintList();

    LList.Node check = ThingsToBuy.Find("Burritos");
    ThingsToBuy.InsertItem(check, "Guacamole");
    ThingsToBuy.DeleteNode("Dog food");
    ThingsToBuy.InsertItem(ThingsToBuy.Find("Carrots"), "Potatoes");
    ThingsToBuy.InsertAtTail("Squash");
    ThingsToBuy.PrintList();
  }
}

/* ******************
Program should print:

We found Dog food.
We found Apples.
We found Fudge.
Guacamole is not on the list.
Fudge
Eggs
Dog food
Carrots
Burritos
Apples
Fudge
Eggs
Carrots
Potatoes
Burritos
Guacamole
Apples
Squash
**************** */