package DSTeam3.maps.locations;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.LinkedList;

import DSTeam3.source.PearlJam.base.*;
import DSTeam3.ui.GameInterface;

public class SavageGardenRestaurant extends PearlJam{
    public SavageGardenRestaurant(){
        super("Savage Garden");
    }

    /* Pattern: 
     * - each person say number from 1, starting from the first person
     * - if number matches the dayNumber, the person is SERVED FIRST
     * - next person start over from 1
     * - if reach each of queue, start over from last person and move in reverse order
    */

    @Override
    public void generateOrderProcessingList(){
        List<Customer> waitingListCopy = getWaitingList();
        List<Customer> orderProcessingList = new ArrayList<>();
        Queue<Customer> queue = new LinkedList<>();

        // Get day number
        GameInterface gameInterface = new GameInterface();
        String dayInfo = gameInterface.getDayInfo();
        System.out.println(dayInfo);
        String[] extractDayNumber = dayInfo.split(" ");
        int dayNumber = Integer.parseInt(extractDayNumber[2]);

        // int dayNumber = 4;

        // Customer whose number matches the dayNumber will be served first (put to front of queue)
        int index = 0;
        boolean reverseOrder = false;

        while (!waitingListCopy.isEmpty()) {
            int customerNumber = index + 1;

            if (customerNumber == dayNumber) {
                queue.offer(waitingListCopy.remove(index));
            } else {
                index++;
            }

            if (index == waitingListCopy.size() - 1) {
                if (!reverseOrder) {
                    index = 0;
                    reverseOrder = true;
                } else {
                    index = waitingListCopy.size() - 1;
                }
            } else {
                if (reverseOrder) {
                    index--;
                } else {
                    index++;
                }
            }
        }

        while (!queue.isEmpty()) {
            orderProcessingList.add(queue.poll());
        }

        setOrderProcessingList(orderProcessingList);
    }
}
