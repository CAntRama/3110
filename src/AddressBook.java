import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> addressbook;

    public AddressBook(){
        addressbook = new ArrayList<BuddyInfo>();
    }

    public boolean addBuddy(BuddyInfo friend) {
        return addressbook.add(friend);
    }

    public boolean removeBuddy(BuddyInfo friend) {
        return addressbook.remove(friend);
    }

    public static void main(String[] args){
        AddressBook addressBook = new AddressBook();
        BuddyInfo bob = new BuddyInfo("Bob","brostreet","67");
        addressBook.addBuddy(bob);
        addressBook.removeBuddy(bob);
        System.out.println("done");
    }
}

