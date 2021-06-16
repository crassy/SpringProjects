package com.optimagrowth.license.controller;


import com.optimagrowth.license.model.License;
import com.optimagrowth.license.service.LicenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="v1/organization/{organizationId}/license")

public class LicenseController {

    @Autowired
    private LicenseService licenseService;

    @RequestMapping(value = "/{licenseId}", method = RequestMethod.GET)
    public ResponseEntity<License> getLicense(
            @PathVariable("licenseId") String licenseId,
            @PathVariable("organizationId") String organizationId){
        License license = licenseService.getLicense(licenseId, organizationId);
        return ResponseEntity.ok(license);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<String> updateLicense(
            @PathVariable ("organizationId") String organizationId,
            @RequestBody License request){
        return ResponseEntity.ok(licenseService.updateLicense(request,organizationId));
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<String> createLicense(
            @PathVariable ("organizationId") String organizationId,
            @RequestBody License request){
        return ResponseEntity.ok(licenseService.createLicense(request,organizationId));
    }

    @RequestMapping(value = "/{licenseId}", method = RequestMethod.DELETE)
    public ResponseEntity<String> deleteLicense(
            @PathVariable("licenseId") String licenseId,
            @PathVariable("organizationId") String organizationId){
        return ResponseEntity.ok(licenseService.deleteLicense(licenseId, organizationId));
    }

}
