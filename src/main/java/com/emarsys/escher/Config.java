package com.emarsys.escher;

import java.util.Date;

public class Config {

    private String algoPrefix = "ESR";
    private String vendorKey = "Escher";
    private String hashAlgo = "SHA256";
    private String authHeaderName = "X-Escher-Auth";
    private String dateHeaderName = "X-Escher-Date";
    private Date currentTime;
    private int clockSkew = 900;


    private Config() {}


    public static Config create() {
        return new Config();
    }


    public String getAlgoPrefix() {
        return algoPrefix;
    }


    public Config setAlgoPrefix(String algoPrefix) {
        this.algoPrefix = algoPrefix;
        return this;
    }


    public String getVendorKey() {
        return vendorKey;
    }


    public Config setVendorKey(String vendorKey) {
        this.vendorKey = vendorKey;
        return this;
    }


    public String getHashAlgo() {
        return hashAlgo;
    }


    public Config setHashAlgo(String hashAlgo) {
        this.hashAlgo = hashAlgo;
        return this;
    }


    public String getAuthHeaderName() {
        return authHeaderName;
    }


    public Config setAuthHeaderName(String authHeaderName) {
        this.authHeaderName = authHeaderName;
        return this;
    }


    public String getDateHeaderName() {
        return dateHeaderName;
    }


    public Config setDateHeaderName(String dateHeaderName) {
        this.dateHeaderName = dateHeaderName;
        return this;
    }


    public Date getCurrentTime() {
        return currentTime;
    }


    public Config setCurrentTime(Date currentTime) {
        this.currentTime = currentTime;
        return this;
    }


    public int getClockSkew() {
        return clockSkew;
    }


    public Config setClockSkew(int clockSkew) {
        this.clockSkew = clockSkew;
        return this;
    }


    String getFullAlgorithm() {
        return algoPrefix + "-HMAC-" + hashAlgo;
    }

}
