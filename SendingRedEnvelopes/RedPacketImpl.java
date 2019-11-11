package SendingRedEnvelopes;

import SendingRedEnvelopes.RedPackets.RedPacketFrame;

public class RedPacketImpl extends RedPacketFrame {
    /**
     * 构造方法：生成红包界面。
     *
     * @param title 界面的标题
     */
    public RedPacketImpl(String title) {
        super(title);
    }
}
