package com.microsoft.businessbootstraper.constants;

import com.microsoft.businessbootstraper.models.Business;

import java.sql.Array;
import java.util.*;

public enum BusinessTypes {

    URL_SHORTENER(1, "URL Shortener"),
    ECOMMERCE(2, "ECommerce"),
    MESSENGER(3, "Messenger"),
    SOCIAL_MEDIA(4, "Social Media"),
    STREAMING(5, "Streaming"),
    CLOUD_FILE_SYSTEM(6, "Cloud File System"),
    WALLET(7, "Wallet"),
    PAYMENT_GATEWAY(8, "Payment Gateway"),
    CODE_SHARING(9, "Code Sharing"),
    VoIP_CALLING(10, "VoIP Calling"),
    FOOD_ORDERING(11, "Food Ordering"),
    APPOINTMENT_BOOKING(12, "Appointment Booking"),
    HOTEL_BOOKING(13, "Hotel Booking"),
    GIT_VERSIONING_CONTROL(14, "Git Versioning Control");

    private int id;
    private String name;

    BusinessTypes(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public int getId()
    {
        return this.id;
    }

    public String getName()
    {
        return this.name;
    }

    public static List<String> getAllBusiness()
    {
        var result = new ArrayList<String>();
        for(BusinessTypes businessType :  BusinessTypes.values())
        {
            result.add(businessType.name);
        }

        return result;
    }

    public static Map<Integer, String> getBusinessMap()
    {
        var result = new HashMap<Integer, String>();
        for(BusinessTypes businessType :  BusinessTypes.values())
        {
            result.put(businessType.id, businessType.name);
        }

        return result;
    }

    public static BusinessTypes getByName(String name)
    {
        for(BusinessTypes type : BusinessTypes.values())
        {
            if (type.name.toLowerCase().equals(name.toLowerCase()))
            {
                return type;
            }
        }

        return null;
    }

    public static BusinessTypes getById(Integer id)
    {
        for(BusinessTypes type : BusinessTypes.values())
        {
            if (type.id == id)
            {
                return type;
            }
        }

        return null;
    }
}
