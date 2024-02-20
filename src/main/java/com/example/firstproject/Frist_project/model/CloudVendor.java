package com.example.firstproject.Frist_project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cloud_vendor_info")
public class CloudVendor {

    @Id
    private String vendor_ID;
    private String vendorName;
    private String vendorAddress;
    private String vendorContact;

    public CloudVendor() {
    }

    public CloudVendor(String vendor_ID, String vendorName, String vendorAddress, String vendorContact) {
        this.vendor_ID = vendor_ID;
        this.vendorName = vendorName;
        this.vendorAddress = vendorAddress;
        this.vendorContact = vendorContact;
    }

    public String getVendorID() {
        return vendor_ID;
    }

    public void setVendorID(String vendorID) {
        this.vendor_ID = vendorID;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getVendorAddress() {
        return vendorAddress;
    }

    public void setVendorAddress(String vendorAddress) {
        this.vendorAddress = vendorAddress;
    }

    public String getVendorContact() {
        return vendorContact;
    }

    public void setVendorContact(String vendorContact) {
        this.vendorContact = vendorContact;
    }
}
