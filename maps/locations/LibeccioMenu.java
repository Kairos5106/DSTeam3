package DSTeam3.maps.locations;

import DSTeam3.ui.base.*;

public class LibeccioMenu extends Menu {
    public LibeccioMenu(){
        this.setLocationName("Libeccio");
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
                setMoveTownHall(true);
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
            case "San Giorgio Maggiore":
                setMovingLocations(true);
                return "San Giorgio Maggiore";
            case "Joestar Mansion":
                setMovingLocations(true);
                return "Joestar Mansion";
            case "Vineyard":
                setMovingLocations(true);
                return "Vineyard";
            case "Dio's Mansion":
                setMovingLocations(true);
                return "Dio's Mansion";
            case "Green Dolphin Street Prison":
                setMovingLocations(true);
                return "Green Dolphin Street Prison";
            case "Town Hall":
                setMovingLocations(true);
                return "Town Hall";
            case "Go forward to visited location":
                setMovingLocations(true);
                setWantMoveForward(true);
                break;
        }
        return null;
    }
}
