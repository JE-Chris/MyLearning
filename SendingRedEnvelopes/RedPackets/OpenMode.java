package SendingRedEnvelopes.RedPackets;

import java.util.ArrayList;

public interface OpenMode {
    /**
     * depart the totalMoney into counts part, and saved in the ArrayList<Integer> to return.
     *
     * @param totalMoney            to make it easy to plan, translate the RMB Yuan to Fen;
     * @param totalCount            the number of red envelope's;
     * @param ArrayList<Integer>    the element of the List is one's get money, and the sum of each in the list is totalMoney.
     */
    ArrayList<Integer> divide(final int totalMoney, final int totalCount);
}
