package SendingRedEnvelopes;

/*
Environment introduce:
    After someone the RedPackets send, everyone could grab, and then, the last one leave to himself.

Our works:
    1.Set the title of this program.
    2.Set the owner's name
    3.Set the Strategy of sending: Random / Average?

The Strategy of Sending RedPackets:
    1.Normal Red Packets (Average): totalMoney / totalCount, the rest get into the last one.
    2.Lucky Red Packets (Random): one can get 1 Fen at least, and the most is (totalMoney-totalCount+1);
 */

import SendingRedEnvelopes.RedPackets.OpenMode;
import SendingRedEnvelopes.RedPackets.RedPacketFrame;

import java.util.ArrayList;
import java.util.Random;

public class Bootstrap {

    public static void main(String[] args) {
        //setting the title.
        RedPacketFrame rpt = new RedPacketImpl("RedPacket!!!");

        //setting the owner's name.
        rpt.setOwnerName("JEason Chris");


        //setting the strategy of sending red packets.[Normal]
//        rpt.setOpenWay((totalMoney, totalCount) -> {
//            public ArrayList<Integer> divide(int totalMoney, int totalCount) {
//                ArrayList<Integer> list = new ArrayList<>();
//                int m = totalMoney/totalCount;
//                int n = totalMoney%totalCount;
//                for (int i = 0; i < totalCount-1; i++) {
//                    list.add(m);
//                }
//                list.add(m+n);
//                return list;
//            }
//        });

        //setting the strategy of sending red packets.[Random]
        rpt.setOpenWay(Bootstrap::divide);
    }

    private static ArrayList<Integer> divide(int totalMoney, int totalCount) {
        ArrayList<Integer> list = new ArrayList<>();
        int rest = totalMoney;
        int left = totalCount;
        Random rand = new Random();

//        for (int i = 0; i < totalCount-1; i++) {
//            int n = rand.nextInt(rest-totalCount+i)+1;  //这种分钱方法会导致：如果红包数量过多的话，最后面的人几乎只能拿一分钱
//            list.add(n);
//            rest -= n;
//        }
//        list.add(rest);

        for (int i = 0; i < totalCount-1; i++) {
            int n = rand.nextInt(rest/left*2)+1;  //这种分钱方法会导致：如果红包数量过多的话，最后面的人几乎只能拿一分钱
            list.add(n);
            rest -= n;
            left--;
        }
        list.add(rest);

        return list;
    }
}
