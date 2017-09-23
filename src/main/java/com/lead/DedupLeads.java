package com.lead;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import util.JsonUtil;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashSet;


public class DedupLeads {

    public static void main(String a[]){

        try {
            JsonElement jsonElement = new JsonParser().parse(new FileReader("src\\main\\resources\\input.json"));
            JsonObject jsonObject = jsonElement.getAsJsonObject();

            System.out.println("Input Leads: "+ JsonUtil.toJson(jsonObject));

            JsonArray jLeads = jsonObject.getAsJsonArray("leads");

            HashSet<Lead> leadHashSet = new HashSet<>();

            if(jLeads != null && jLeads.size() > 0) {
                for(JsonElement jElmntLead : jLeads) {
                    JsonObject jObjctLead = jElmntLead.getAsJsonObject();
                    leadHashSet.add(new Lead(jObjctLead.get("_id").getAsString(),
                                             jObjctLead.get("email").getAsString(),
                                             jObjctLead.get("firstName").getAsString(),
                                             jObjctLead.get("lastName").getAsString(),
                                             jObjctLead.get("address").getAsString(),
                                             jObjctLead.get("entryDate").getAsString()));
                }
            }

            System.out.println("Unique leads are:");
            for(Lead lead : leadHashSet) {
                System.out.println(lead);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
