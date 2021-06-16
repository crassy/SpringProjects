package com.optimagrowth.license.service;

import com.optimagrowth.license.model.License;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class LicenseService {

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

    public String createLicense(License license, String organizationID){
        String responseMessage = "";
        if(null != license){
            license.setOrganizationId(organizationID);
            responseMessage = String.format("This is the post and the object is: %s", license.toString());
        }
        return responseMessage;
    }
    public String updateLicense(License license, String organizationID){
        String responseMessage = "";
        if(null != license){
            license.setOrganizationId(organizationID);
            responseMessage = String.format("This is the put and the object is: %s", license.toString());
        }
        return responseMessage;
    }

    public String deleteLicense(String licenseID, String organizationID){
        String responseMessage = "";
        responseMessage = String.format("Deleting license with id : %s for the organization %s", licenseID,organizationID);
        return responseMessage;
    }
}
