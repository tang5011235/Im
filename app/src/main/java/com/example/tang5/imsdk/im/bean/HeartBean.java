package com.example.tang5.imsdk.im.bean;

import com.google.gson.annotations.SerializedName;

public class HeartBean extends BaseResponseBean {

    /**
     * client_ping_interval : 30000
     */

    @SerializedName("client_ping_interval")
    private int clientPingInterval;

    public int getClientPingInterval() {
        return clientPingInterval;
    }

    public void setClientPingInterval(int clientPingInterval) {
        this.clientPingInterval = clientPingInterval;
    }
}
