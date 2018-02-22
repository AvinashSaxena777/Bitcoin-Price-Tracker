package com.londonappbrewery.bitcointicker;

import org.json.JSONObject;


public class BitcoinDataModel {
    private double price;
    public static BitcoinDataModel fromJson(JSONObject jsonObject){
        try {
            BitcoinDataModel bitcoinData = new BitcoinDataModel();
            bitcoinData.price = jsonObject.getDouble("last");
            return bitcoinData;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public double getPrice() {
        return price;
    }
}
