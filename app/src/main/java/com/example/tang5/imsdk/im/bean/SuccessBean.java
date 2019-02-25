package com.example.tang5.imsdk.im.bean;

import com.google.gson.annotations.SerializedName;

public class SuccessBean extends BaseResponseBean {

    /**
     * timestamp : 1551102270
     * cmd : 3
     */

    @SerializedName("timestamp")
    private int timestamp;
    @SerializedName("cmd")
    private int cmd;

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

    public int getCmd() {
        return cmd;
    }

    public void setCmd(int cmd) {
        this.cmd = cmd;
    }
}
