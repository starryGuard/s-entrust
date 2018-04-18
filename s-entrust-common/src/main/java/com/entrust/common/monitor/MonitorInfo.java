package com.entrust.common.monitor;

import lombok.Data;

/**
 * 监控信息
 * Created by lixiaohan on 2018/4/18.
 */
@Data
public class MonitorInfo {

    public static final int STATE_TRUE = 0;
    public static final int STATE_FALSE = 1;
    private long startTime;
    private String key;
    private int processState;
    private long elapsedTime;

    public MonitorInfo(String key) {
        this.key = key;
        this.startTime = System.currentTimeMillis();
        this.elapsedTime = -1L;
        this.processState = 1;
    }

    public MonitorInfo(String key, String appName) {
        this.key = key;
        this.startTime = System.currentTimeMillis();
        this.elapsedTime = -1L;
        this.processState = 1;
    }

    public void error() {
        this.processState = -1;
    }

    public long getElapsedTime() {
        if(this.elapsedTime == -1L) {
            this.elapsedTime = System.currentTimeMillis() - this.startTime;
        }

        return this.elapsedTime;
    }

    @Override
    public String toString() {
        return "{" + "startTime=" + startTime + ", key='" + key + '\'' + ", processState=" + processState + ", elapsedTime=" + elapsedTime + '}';
    }
}
