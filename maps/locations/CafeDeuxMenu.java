package DSTeam3.maps.locations;

import DSTeam3.ui.base.*;

public class CafeDeuxMenu extends Menu {
    public CafeDeuxMenu(){
        this.setLocationName("Cafe Deux Magots");
    }

    /* Purpose: Defines the options for the menu */
    @Override
    public void defineOptions(){        
        // Defining options and linking them to their respective suboptions
        Option moveTo = new Option("Move to nearby location");
        
        Option backPrevious = new Option("Back to previous location");
        backPrevious.addSuboptions("Yes");
        backPrevious.addSuboptions("No");

        Option backTownHall = new Option("Back to Town Hall");

        Option[] options = {moveTo, backPrevious, backTownHall};
        setOptions(options);
    }

    @Override
    public String execute(String inputStr){
        switch(getSelectedTitle()){
            case "Move to nearby location":
                setGreeting("Select a location to move to: ");
                setOpenMoveLocationsMenu(true);
                break;
            case "Back to Town Hall":
                setMovingLocations(true);
                return "Town Hall";
            case "Back to previous location":
                setReturnPreviousLocation(true);
                break;
            case "Yes":
                setMovingLocations(true);
                break;
            case "No":
                setReturnToFrontPage(true);
                break;
            case "Town Hall":
                setMovingLocations(true);
                return "Town Hall";
            case "Jade Garden":
                setMovingLocations(true);
                return "Jade Garden";
            case "Savage Garden":
                setMovingLocations(true);
                return "Savage Garden";
            case "Polnareff Land":
                setMovingLocations(true);
                return "Polnareff Land";
            case "Joestar Mansion":
                setMovingLocations(true);
                return "Joestar Mansion";
            case "Go forward to visited location":
                setMovingLocations(true);
                setWantMoveForward(true);
                break;
        }
        return "";
    }
}
