package com.optimagrowth.license.service;

import com.optimagrowth.license.model.License;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import java.util.Locale;
import java.util.Random;

@Service
public class LicenseService {

    @Autowired
    MessageSource messageSource;

    public License getLicense(String licenseId, String organizationId){
        License license = new License();
        license.setId(new Random().nextInt(1000));
        license.setLicenseId(licenseId);
        license.setOrganizationId(organizationId);
        license.setDescription("Software Product");
        license.setProductName("OStock");
        license.setLicenseType("full");
        return license;
    }

    public String createLicense(License license, String organizationID, Locale locale){
        String responseMessage = "";
        if(null != license){
            license.setOrganizationId(organizationID);
//            responseMessage = String.format("This is the post and the object is: %s", license.toString());
            responseMessage = String.format(messageSource.getMessage("license.create.message", null, locale), license.toString());
        }
        return responseMessage;
    }
    public String updateLicense(License license, String organizationID){
        String responseMessage = "";
        if(null != license){
            license.setOrganizationId(organizationID);
            //responseMessage = String.format("This is the put and the object is: %s", license.toString());
            responseMessage = String.format(messageSource.getMessage("license.update.message",null,null), license.toString());
        }
        return responseMessage;
    }

    public String deleteLicense(String licenseID, String organizationID){
        String responseMessage = "";
        responseMessage = String.format("Deleting license with id : %s for the organization %s", licenseID,organizationID);
        return responseMessage;
    }
}
