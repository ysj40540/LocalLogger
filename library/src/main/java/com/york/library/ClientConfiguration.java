package com.york.library;

/**
 * @author : York
 * @time : 2023/5/22
 * @Description:
 */
public class ClientConfiguration {
    private long max_log_size = 5 * 1024 * 1024;

    public long getMaxLogSize() {
        return max_log_size;
    }

    /**
     * set max log file size  default 5mb
     *
     * @param max_log_size
     */
    public void setMaxLogSize(long max_log_size) {
        this.max_log_size = max_log_size;
    }

}
